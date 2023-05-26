package kr.co.noveljoa.user.board.vo;

import java.sql.Date;

public class FreeBoardVO {

	
	private int num_member, views;
	private String title, detail, uid;
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "FreeBoardVO [num_member=" + num_member + ", views=" + views + ", title=" + title + ", detail=" + detail
				+ ", uid=" + uid + "]";
	}
	
	
	

	
	
	

}
