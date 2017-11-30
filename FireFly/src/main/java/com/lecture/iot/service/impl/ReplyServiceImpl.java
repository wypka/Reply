package com.lecture.iot.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecture.iot.dao.ReplyDao;
import com.lecture.iot.model.Reply;
import com.lecture.iot.service.ReplyService;
@Service
public class ReplyServiceImpl implements ReplyService {
	@Autowired ReplyDao dao;

	@Override
	public int getReplyCount() {
		
		return dao.getReplyCount();
	}

	@Override
	public List<Reply> getReply(long boardId) {
		
		return dao.getReply(boardId);
	}

	@Override
	public boolean insert(Reply reply) {
		return dao.insert(reply)==1;
	}

	@Override
	public boolean insertReply(Reply reply) {
		// TODO Auto-generated method stub
		return dao.insertReply(reply)==1;
	}

	@Override
	public boolean update(Reply reply) {
		// TODO Auto-generated method stub
		return dao.update(reply)==1;
	}

	@Override
	public boolean delete(Reply reply) {
		// TODO Auto-generated method stub
		return dao.delete(reply)==1;
	}

	@Override
	public boolean updateReSeq(long reRef, long reSeq) {
		HashMap<String, Long> map = new HashMap<>();
		map.put("reRef", reRef);
		map.put("reSeq", reSeq);
		int result = dao.updateReSeq(map);
		return result ==1;
	}
	
}
