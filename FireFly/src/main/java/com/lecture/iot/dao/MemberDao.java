package com.lecture.iot.dao;

import java.util.List;

import com.lecture.iot.model.Member;

public interface MemberDao {
	//mapper의 id와 동일하게 메서드 명 지정
	int selectCount();
	List<Member> selectList();
	Member selectOne(String userId);
	int insert(Member member);
	int update(Member member);
	int delete(String userId);
}
