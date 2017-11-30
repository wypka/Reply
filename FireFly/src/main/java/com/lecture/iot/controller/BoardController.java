package com.lecture.iot.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lecture.iot.model.Board;
import com.lecture.iot.model.Reply;
import com.lecture.iot.service.BoardService;
import com.lecture.iot.service.ReplyService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Resource(name="boardServiceImpl")
	BoardService service;
	@Resource(name="replyServiceImpl")
	ReplyService reply;
	//@Autowired 
	@RequestMapping(value="/list")
	public String list(Model model){
		model.addAttribute("list",service.getList());
		return "board/list";
	}
	@RequestMapping(value="/view")
	public String view(Model model,
			@RequestParam("boardId")long boardId){
		model.addAttribute("board",service.getBoard(boardId));
		model.addAttribute("list",reply.getReply(boardId));

		return "board/view";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateGet(
			@RequestParam("boardId")long boardId,
			Model model){
		model.addAttribute("board", service.getBoard(boardId));
		return "board/update";
	}
	
	@RequestMapping(value="/update", method= RequestMethod.POST)
	public String updatePost(Board board){
		
		service.update(board);		
		return "redirect:list";
	}
	@RequestMapping(value="/delete")
	public String delete(@RequestParam("id") long id){
		service.delete(id);
		return "redirect:list";		
	}
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String createGet(Board board){
		return "board/create";
	}
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createPost(Board board){
		if(service.insert(board)){
			return "redirect:list";
		}else{
			return "board/create";
		}
	}
	//댓글 등록 매핑 해야한다.
	@RequestMapping(value="/reply/create", method=RequestMethod.POST)
	public String createPost(Reply repl,@RequestParam("boardId")long boardId){
		
		reply.updateReSeq(repl.getReRef(), repl.getReSeq());
		repl.setReDepth(repl.getReDepth()+1);
		repl.setReSeq(repl.getReSeq()+1);
		reply.insertReply(repl);
		 return "redirect:/view?boardId="+repl.getBoardId();
	}
	//댓글 수정 매핑해야한다.
	//댓글 삭제 매핑해야한다.
}
