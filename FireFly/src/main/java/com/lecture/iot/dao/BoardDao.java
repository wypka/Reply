package com.lecture.iot.dao;

import java.util.List;

import com.lecture.iot.model.Board;

public interface BoardDao {
	Board selectOne(long id);
	
	List<Board> selectList();
	long selectCount();
	int insert(Board board);
	int update(Board board);
	int increaseReadCnt(long id);
	int delete(long id);
}
