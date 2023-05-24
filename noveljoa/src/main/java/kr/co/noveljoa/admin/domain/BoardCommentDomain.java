package kr.co.noveljoa.admin.domain;

import java.sql.Date;

public class BoardCommentDomain {
	 private String id, detail;
	private Date make;
	
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
		return "BoardCommentDomain [id=" + id + ", detail=" + detail + ", make=" + make + "]";
	}
	
	
	
	

}
