package com.lecture.iot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecture.iot.dao.MemberDao;
import com.lecture.iot.dao.impl.MemberDaoImpl;
import com.lecture.iot.model.Member;
import com.lecture.iot.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao dao;
	
	@Override
	public List<Member> getList() {
		
		return dao.selectList();
	}

	@Override
	public Member getMember(String userId) {
		// TODO Auto-generated method stub
		return dao.selectOne(userId);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return dao.selectCount();
	}

	@Override
	public boolean insert(Member member) {
		int reuslt = dao.insert(member);
		return reuslt == 1;
	}

	@Override
	public boolean update(Member member) {
		int reuslt = dao.update(member);
		return reuslt == 1;
	}

	@Override
	public boolean delete(String userId) {
		int result = dao.delete(userId);
		return result == 1;
	}

}
