package com.lecture.iot.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lecture.iot.model.Member;
import com.lecture.iot.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	//Resource는 오토와이어링 리플렉션으로... ?
	@Resource(name="memberServiceImpl") 
		MemberService service;
	@RequestMapping(value="/list")
	public String list(Model model){
		model.addAttribute("list",service.getList());
		return "member/list";
	}
	@RequestMapping(value="/view")
	public String view(Model model,
			@RequestParam("userId")String userId){
		model.addAttribute("member",service.getMember(userId));
		return "member/view";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateGet(
			@RequestParam("userId")String userId,
			Model model){
		model.addAttribute("member", service.getMember(userId));
		return "member/update";
	}
	
	@RequestMapping(value="/update", method= RequestMethod.POST)
	public String updatePost(Member member){
		service.update(member);
		
		return "redirect:list";
	}
	@RequestMapping(value="/delete")
	public String delete(@RequestParam("userId") String userId){
		service.delete(userId);
		return "redirect:list";		
	}
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String createGet(Member member){
		return "member/create";
	}
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createPost(@Valid Member member,BindingResult result){
		if(result.hasErrors()) return "member/create";
		if(service.insert(member)){
			return "redirect:list";
		}else{
			return "member/create";
		}
	}
	/*@RequestMapping(value= "/idcheck")
	@ResponseBody
	public boolean idcheck(@RequestParam("userId") String userId){
		Member member = service.getMember(userId);
		return member == null;
	}*/
	
	@RequestMapping(value= "/idcheck/{userId}")
	@ResponseBody
	public boolean idcheck(@PathVariable("userId") String userId){
		Member member = service.getMember(userId);
		return member == null;
	}
}
