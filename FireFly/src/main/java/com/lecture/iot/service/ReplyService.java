package com.lecture.iot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lecture.iot.model.Reply;

@Service
@Transactional
public interface ReplyService {
		//ī��Ʈ
		int getReplyCount();
		
		//����Ʈ ���
		List<Reply> getReply(long boardId);
		
		//����
		boolean insert(Reply reply);
		
		//����
		boolean insertReply(Reply reply);
		
		//����
		boolean update(Reply reply);
			
		//����(����)
		boolean delete(Reply reply);
		
		//?
		boolean updateReSeq(long reRef, long reSeq);
		
		//�Խñ��� �ٲ�� ��ۿ� ���� �������� �ʱ�ȭ�Ǿ�� �Ѵ�.(���ı���)
}
