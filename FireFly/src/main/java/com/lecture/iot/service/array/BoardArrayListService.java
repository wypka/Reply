package com.lecture.iot.service.array;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lecture.iot.model.Board;
import com.lecture.iot.service.BoardService;

@Service
public class BoardArrayListService implements BoardService {

	static List<Board> list = new ArrayList();
	static {
		list.add(new Board("테스트 1", "관리자", "내용1"));
		list.add(new Board("테스트 2", "관리자", "내용2"));
		list.add(new Board("테스트 3", "관리자", "내용3"));

	}

	@Override
	public List<Board> getList() {
		return list;
	}

	@Override
	public Board getBoard(long boadId) {
		int index = getIndex(boadId);
		if (index != -1) {
			Board board = list.get(index);			
			board.setReadCnt(increaseReadCnt(board.getReadCnt()));
			return board;
		}
		return null;

	}

	@Override
	public boolean insert(Board board) {
		list.add(board);
		return true;

	}

	@Override
	public boolean update(Board board) {
		int index = getIndex(board.getId());
		if (index != -1) {
			list.set(index, board);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(long boardId) {
		int index = getIndex(boardId);
		if (index != -1) {
			list.remove(index);
			return true;
		}
		return false;
	}

	private int getIndex(long boardId) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == boardId) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public long increaseReadCnt(long readCnt) {
		
		return readCnt++;
	}
}
