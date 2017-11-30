package com.lecture.iot.model;

import java.io.Serializable;
import java.util.Date;

public class Reply implements Serializable{
	static long reply_seq=0;
    private long replyId;
    private long boardId;
    private String writer;
    private String password;
    private String content;
    private long reRef;
    private long reDepth;
    private long reSeq;
    private Date regDate;
    
	public long getReplyId() {
		return replyId;
	}
	public void setReplyId(long replyId) {
		this.replyId = reply_seq++;
	}
	public long getBoardId() {
		return boardId;
	}
	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getReRef() {
		return reRef;
	}
	public void setReRef(long reRef) {
		this.reRef = reRef;
	}
	public long getReDepth() {
		return reDepth;
	}
	public void setReDepth(long reDepth) {
		this.reDepth = reDepth;
	}
	public long getReSeq() {
		return reSeq;
	}
	public void setReSeq(long reSeq) {
		this.reSeq = reSeq;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Reply(long replyId, long boardId, String writer, String password, String content, long reRef, long reDepth,
			long reSeq) {
		super();
		this.replyId = reply_seq++;
		this.boardId = boardId;
		this.writer = writer;
		this.password = password;
		this.content = content;
		this.reRef = reRef;
		this.reDepth = reDepth;
		this.reSeq = reSeq;
		this.regDate = new Date();
	}
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
