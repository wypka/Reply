package com.lecture.iot.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lecture.iot.dao.ReplyDao;
import com.lecture.iot.model.Reply;

public class ReplyDaoImpl implements ReplyDao {
	private static final String NAMESPACE = "com.lecture.iot.dao.ReplyDao";
	
	@Autowired
	private SqlSessionTemplate sql;
	
	@Override
	@Transactional
	public int delete(Reply reply) {		
		return sql.update(NAMESPACE+ ".delete", reply);
	}

	@Override
	@Transactional
	public int insert(Reply reply) {
		return sql.insert(NAMESPACE+ ".insert", reply);
	}

	@Override
	@Transactional
	public int update(Reply reply) {
		return sql.update(NAMESPACE+ ".update", reply);
	}

	@Override
	@Transactional
	public int getReplyCount() {
		return sql.selectOne(NAMESPACE+".count");
	}

	@Override
	@Transactional
	public List<Reply> getReply(long boardId) {
		 
		return sql.selectList(NAMESPACE+".getReply",boardId);
	}

	@Override
	@Transactional
	public int insertReply(Reply reply) {
		
		return sql.insert(NAMESPACE+".insertReply", reply);
	}

	@Override
	@Transactional
	public int updateReSeq(HashMap map) {	
		return sql.update(NAMESPACE+".updateReSeq", map);
	}


}
