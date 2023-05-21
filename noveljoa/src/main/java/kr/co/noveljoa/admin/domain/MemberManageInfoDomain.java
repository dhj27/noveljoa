package kr.co.noveljoa.admin.domain;

import java.util.Date;

public class MemberManageInfoDomain {
	private String thumbnail, id, name, email, phone;
	private Date birthDate, visitDate, joinDate, susPeriod;
	private int novelCnt, commentCnt, num_member;
	

	
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getSusPeriod() {
		return susPeriod;
	}
	public void setSusPeriod(Date susPeriod) {
		this.susPeriod = susPeriod;
	}
	public int getNovelCnt() {
		return novelCnt;
	}
	public void setNovelCnt(int novelCnt) {
		this.novelCnt = novelCnt;
	}
	public int getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}

	@Override
	public String toString() {
		return "MemberManageInfoDomain [thumbnail=" + thumbnail + ", id=" + id + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + ", birthDate=" + birthDate + ", visitDate=" + visitDate + ", joinDate="
				+ joinDate + ", susPeriod=" + susPeriod + ", novelCnt=" + novelCnt + ", commentCnt=" + commentCnt
				+  "]";
	}
	
	
}
