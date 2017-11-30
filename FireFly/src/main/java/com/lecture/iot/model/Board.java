
package com.lecture.iot.model;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable{
	static long boardId = 0;
	
	private long id ;
	private String title;
	private String writer;
	private Date regDate;
	private String content;
	private long readCnt;
	
	public long getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(long readCnt) {
		this.readCnt = readCnt;
	}
	public Board() {
		super();
		this.id = boardId++;
		this.regDate = new Date();
	}
	public static long getBoardId() {
		return boardId;
	}
	public static void setBoardId(long boardId) {
		Board.boardId = boardId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public Board(String title, String writer, String content) {
		super();
		this.id= boardId++;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date();
		
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
