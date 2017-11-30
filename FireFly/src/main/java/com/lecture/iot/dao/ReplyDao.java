package com.lecture.iot.dao;

import java.util.HashMap;
import java.util.List;

import com.lecture.iot.model.Reply;

public interface ReplyDao {
	//카운트
	int getReplyCount();
	
	//리스트 목록
	List<Reply> getReply(long boardId);
	
	//삽입
	int insert(Reply reply);
	
	//대댓글
	int insertReply(Reply reply);
	
	//변경
	int update(Reply reply);
		
	//삭제(변경)
	int delete(Reply reply);
	
	//?
	int updateReSeq(HashMap map);

}
