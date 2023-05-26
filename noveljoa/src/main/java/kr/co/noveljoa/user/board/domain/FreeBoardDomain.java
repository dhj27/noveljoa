package kr.co.noveljoa.user.board.domain;

import java.sql.Date;

public class FreeBoardDomain {
	private int board_num, num_member, views;
	private String title, detail, id;
	private Date make;
   	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
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
	public Date getMake() {
		return make;
	}
	public void setMake(Date make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "FreeBoardDomain [board_num=" + board_num + ", num_member=" + num_member + ", views=" + views
				+ ", title=" + title + ", detail=" + detail + ", id=" + id + ", make=" + make + "]";
	}
	


	
	


}
