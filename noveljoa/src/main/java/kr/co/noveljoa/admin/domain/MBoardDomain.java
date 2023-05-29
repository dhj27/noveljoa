package kr.co.noveljoa.admin.domain;

import java.sql.Date;

public class MBoardDomain {

	private int boardNum, views, reply;
	private String id, boardTitle; 
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
	public int getReply() {
		return reply;
	}
	public void setReply(int reply) {
		this.reply = reply;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "MBoardDomain [boardNum=" + boardNum + ", views=" + views + ", reply=" + reply + ", id=" + id
				+ ", boardTitle=" + boardTitle + ", createDate=" + createDate + "]";
	}
	
	
	
}
