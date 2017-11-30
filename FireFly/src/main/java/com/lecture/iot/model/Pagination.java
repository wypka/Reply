package com.lecture.iot.model;

import java.io.Serializable;

public class Pagination implements Serializable {
	public static final int PER_PAGE = 2; // 1페이지당 데이터 건수
	public static final int PER_BLOCK = 10; // 1블럭당 페이지 수
	private int totalCount; // 전체 데이터 건 수
	private int page; // 현재 페이지
	private int totalPage; // 전체 페이지 수
	private int startPage; // 현재 페이지 블럭에서 시작 페이지 번호
	private int endPage; // 현재 페이지 블럭에서 마지막 페이지 번호
	private int currentBlock; // 현재 페이지 블럭
	private int totalBlock; // 전체 페이지 블럭 수
	private int prevBlockPage; // 이전 페이지 블록 시작 페이지
	private int nextBlockPage; // 다음 페이지 블록 시작 페이지
	private int perPage;
	private int perBlock;
	
	public Pagination() {
		super();
	}
	public Pagination(int currentPage, int totalCount) {
		this.totalCount = totalCount;
		this.page = currentPage;
		
		currentBlock = (int)Math.ceil((float)currentPage/PER_BLOCK); //현재 블럭
		totalPage = (int)Math.ceil((float)totalCount/PER_PAGE); //전체 페이지 수
		totalBlock = (int)Math.ceil((float)totalPage/PER_BLOCK); //전체 블록수
		
		startPage = (currentBlock-1)*PER_BLOCK + 1; // 블록 시작 페이지
		endPage = startPage + PER_BLOCK - 1; //블록 마지막 페이지
		
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		prevBlockPage = page - PER_BLOCK;
		nextBlockPage = page + PER_BLOCK;		
	}	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getCurrentBlock() {
		return currentBlock;
	}
	public void setCurrentBlock(int currentBlock) {
		this.currentBlock = currentBlock;
	}
	public int getTotalBlock() {
		return totalBlock;
	}
	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}
	public int getPrevBlockPage() {
		return prevBlockPage;
	}
	public void setPrevBlockPage(int prevBlockPage) {
		this.prevBlockPage = prevBlockPage;
	}
	public int getNextBlockPage() {
		return nextBlockPage;
	}
	public void setNextBlockPage(int nextBlockPage) {
		this.nextBlockPage = nextBlockPage;
	}	
	@Override
	public String toString() {
		return "Pagination [totalCount=" + totalCount + ", page=" + page + ", totalPage=" + totalPage + ", startPage="
				+ startPage + ", endPage=" + endPage + ", currentBlock=" + currentBlock + ", totalBlock=" + totalBlock
				+ ", prevBlockPage=" + prevBlockPage + ", nextBlockPage=" + nextBlockPage + "]";
	}
	public int getPerPage() {
		return PER_PAGE;
	}
	public int getPerBlock() {
		return PER_BLOCK;
	}
	
	
		
}
