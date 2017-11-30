package com.lecture.iot.service;

import java.util.List;

import com.lecture.iot.model.Board;

public interface BoardService {

	List<Board> getList();

	Board getBoard(long boardId);
	
	long increaseReadCnt(long boardId);

	boolean insert(Board board);

	boolean update(Board board);

	boolean delete(long boardId);

}