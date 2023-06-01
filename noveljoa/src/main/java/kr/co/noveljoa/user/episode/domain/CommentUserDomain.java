package kr.co.noveljoa.user.episode.domain;

import java.sql.Date;

public class CommentUserDomain {
	
	private int comment_num;
	private String id;
	private int num_episode;
	private String detail;
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
	public int getNum_episode() {
		return num_episode;
	}
	public void setNum_episode(int num_episode) {
		this.num_episode = num_episode;
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
		return "CommentUserDomain [comment_num=" + comment_num + ", id=" + id + ", num_episode=" + num_episode
				+ ", detail=" + detail + ", make=" + make + "]";
	}
	
}
