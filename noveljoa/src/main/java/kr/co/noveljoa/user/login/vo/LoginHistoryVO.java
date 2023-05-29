package kr.co.noveljoa.user.login.vo;

import java.sql.Date;

public class LoginHistoryVO {
	int num_member;
	String ip,os;
	Date visit;
	public LoginHistoryVO(int num_member, String ip, String os, Date visit) {
		super();
		this.num_member = num_member;
		this.ip = ip;
		this.os = os;
		this.visit = visit;
	}
	public LoginHistoryVO() {
		super();
	}
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public Date getVisit() {
		return visit;
	}
	public void setVisit(Date visit) {
		this.visit = visit;
	}
	@Override
	public String toString() {
		return "LoginHistoryVO [num_member=" + num_member + ", ip=" + ip + ", os=" + os + ", visit=" + visit + "]";
	}
	
	
	
}
