package com.lecture.iot.service;

import java.util.List;

import com.lecture.iot.model.Member;

public interface MemberService {

	List<Member> getList();

	Member getMember(String userId);
	
	int getCount();

	boolean insert(Member member);

	boolean update(Member member);

	boolean delete(String userId);
	
	

}