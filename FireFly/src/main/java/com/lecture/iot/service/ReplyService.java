package com.lecture.iot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lecture.iot.model.Reply;

@Service
@Transactional
public interface ReplyService {
		//카운트
		int getReplyCount();
		
		//리스트 목록
		List<Reply> getReply(long boardId);
		
		//삽입
		boolean insert(Reply reply);
		
		//대댓글
		boolean insertReply(Reply reply);
		
		//변경
		boolean update(Reply reply);
			
		//삭제(변경)
		boolean delete(Reply reply);
		
		//?
		boolean updateReSeq(long reRef, long reSeq);
		
		//게시글이 바뀌면 댓글에 대한 시퀀스는 초기화되어야 한다.(추후구현)
}
