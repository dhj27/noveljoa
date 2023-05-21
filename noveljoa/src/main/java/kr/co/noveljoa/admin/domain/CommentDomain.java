package kr.co.noveljoa.admin.domain;

import java.sql.Date;

public class CommentDomain {
	private int comment_num;
	private String id, detail, title;
	private Date make;
	

	public int getComment_num() {
		return comment_num;
	}
	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "CommentDomain [comment_num=" + comment_num + ", id=" + id + ", detail=" + detail + ", title=" + title
				+ ", make=" + make + "]";
	}
	
	
	

}
