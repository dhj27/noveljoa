package kr.co.noveljoa.user.episode.domain;

import java.sql.Date;

public class CommentDomain {
	
	private int num_member;
	private int id;
	private int num_episode;
	private String detail;
	private Date make;
	
	
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
		return "CommentDomain [num_member=" + num_member + ", id=" + id + ", num_episode=" + num_episode + ", detail="
				+ detail + ", make=" + make + "]";
	}


	
	
}
