package kr.co.noveljoa.admin.domain;

import java.util.Date;

public class MBoardDetailDomain {

	private int boardNum, views;
	private String id, boardTitle, boardDetail; 
	private Date createDate;
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardDetail() {
		return boardDetail;
	}
	public void setBoardDetail(String boardDetail) {
		this.boardDetail = boardDetail;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "MBoardDetailDomain [boardNum=" + boardNum + ", views=" + views + ", id=" + id + ", boardTitle="
				+ boardTitle + ", boardDetail=" + boardDetail + ", createDate=" + createDate + "]";
	}
	

	
}
