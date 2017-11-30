package com.lecture.iot.dao;

import java.util.List;

import com.lecture.iot.model.Member;

public interface MemberDao {
	//mapper�� id�� �����ϰ� �޼��� �� ����
	int selectCount();
	List<Member> selectList();
	Member selectOne(String userId);
	int insert(Member member);
	int update(Member member);
	int delete(String userId);
}
