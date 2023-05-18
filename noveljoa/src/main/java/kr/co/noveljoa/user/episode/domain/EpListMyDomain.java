package kr.co.noveljoa.user.episode.domain;

import java.util.Date;

public class EpListMyDomain {
	
	private String epTitle;
	private int openStatus;
	private int views;
	private Date date;
	
	public EpListMyDomain() {}
	
	public EpListMyDomain(String epTitle, int openStatus, int views, Date date) {
		this.epTitle = epTitle;
		this.openStatus = openStatus;
		this.views = views;
		this.date = date;
	}
	public String getEpTitle() {
		return epTitle;
	}
	public void setEpTitle(String epTitle) {
		this.epTitle = epTitle;
	}
	public int getOpenStatus() {
		return openStatus;
	}
	public void setOpenStatus(int openStatus) {
		this.openStatus = openStatus;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "EpListMyDomain [epTitle=" + epTitle + ", openStatus=" + openStatus + ", views=" + views + ", date="
				+ date + "]";
	}

}
