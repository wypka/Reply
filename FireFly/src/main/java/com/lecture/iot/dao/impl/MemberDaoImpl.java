package com.lecture.iot.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lecture.iot.dao.MemberDao;
import com.lecture.iot.model.Member;



public class MemberDaoImpl implements MemberDao {
	private static final String NAMESPACE = "com.lecture.iot.dao.MemberDao";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Member> selectList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE + ".selectList" );
	}

	@Override
	public Member selectOne(String userId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE + ".selectOne", userId);
	}

	@Override
	@Transactional
	public int insert(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE + ".insert", member);
	}

	@Override
	@Transactional
	public int update(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE + ".update" , member);
	}

	@Override
	@Transactional
	public int delete(String userId) {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE + ".delete" , userId);
	}

}
