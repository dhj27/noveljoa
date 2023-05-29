package kr.co.noveljoa.user.board.domain;

import java.sql.Date;

public class BoardCommentDomain {
	 private String id, detail, manager_cmt;
	 private  int board_cmt_num;
	private Date make;
	
	
	
	public String getManager_cmt() {
		return manager_cmt;
	}
	public void setManager_cmt(String manager_cmt) {
		this.manager_cmt = manager_cmt;
	}
	public int getBoard_cmt_num() {
		return board_cmt_num;
	}
	public void setBoard_cmt_num(int board_cmt_num) {
		this.board_cmt_num = board_cmt_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
		return "BoardCommentDomain [id=" + id + ", detail=" + detail + ", manager_cmt=" + manager_cmt
				+ ", board_cmt_num=" + board_cmt_num + ", make=" + make + "]";
	}
	

	
	
	
	
	

}
