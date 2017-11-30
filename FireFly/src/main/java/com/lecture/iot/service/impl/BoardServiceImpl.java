package com.lecture.iot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecture.iot.dao.BoardDao;
import com.lecture.iot.model.Board;
import com.lecture.iot.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired BoardDao dao;
	
	@Override
	public List<Board> getList() {
		return dao.selectList();
	}

	@Override
	public Board getBoard(long boardId) {
		Board board =dao.selectOne(boardId);
		increaseReadCnt(boardId);
		return board; 
	}

	@Override
	public long increaseReadCnt(long readCnt) {
		return dao.increaseReadCnt(readCnt);
	}

	@Override
	public boolean insert(Board board) {
		int result = dao.insert(board); 
		return result ==1;
	}

	@Override
	public boolean update(Board board) {
		int result =dao.update(board);
		return result ==1;
	}

	@Override
	public boolean delete(long id) {
		int result = dao.delete(id);
		return result == 1;
	}

}
