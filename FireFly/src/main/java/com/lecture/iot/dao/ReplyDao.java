package com.lecture.iot.dao;

import java.util.HashMap;
import java.util.List;

import com.lecture.iot.model.Reply;

public interface ReplyDao {
	//ī��Ʈ
	int getReplyCount();
	
	//����Ʈ ���
	List<Reply> getReply(long boardId);
	
	//����
	int insert(Reply reply);
	
	//����
	int insertReply(Reply reply);
	
	//����
	int update(Reply reply);
		
	//����(����)
	int delete(Reply reply);
	
	//?
	int updateReSeq(HashMap map);

}
