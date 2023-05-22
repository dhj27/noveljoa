package kr.co.noveljoa.user.episode.domain;

import java.util.Date;

public class EpListMyDomain {
	
	private String title;
	private int open;
	private int visit;
	private Date make;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getVisit() {
		return visit;
	}
	public void setVisit(int visit) {
		this.visit = visit;
	}
	public Date getMake() {
		return make;
	}
	public void setMake(Date make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "EpListMyDomain [title=" + title + ", open=" + open + ", visit=" + visit + ", make=" + make + "]";
	}
	
	
}
