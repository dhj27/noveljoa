package kr.co.noveljoa.user.episode.domain;

import java.util.Date;

public class EpListDomain {
	
	private int epCnt;
	private String epTitle;
	private int views;
	private Date date;
	private int bookmark;
	
	public EpListDomain() {}	
	
	public EpListDomain(int epCnt, String epTitle, int views, Date date, int bookmark) {
		this.epCnt = epCnt;
		this.epTitle = epTitle;
		this.views = views;
		this.date = date;
		this.bookmark = bookmark;
	}
	public int getEpCnt() {
		return epCnt;
	}
	
	public void setEpCnt(int epCnt) {
		this.epCnt = epCnt;
	}
	public String getEpTitle() {
		return epTitle;
	}
	public void setEpTitle(String epTitle) {
		this.epTitle = epTitle;
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
	public int getBookmark() {
		return bookmark;
	}
	public void setBookmark(int bookmark) {
		this.bookmark = bookmark;
	}
	@Override
	public String toString() {
		return "EpListDomain [epCnt=" + epCnt + ", epTitle=" + epTitle + ", views=" + views + ", date=" + date
				+ ", bookmark=" + bookmark + "]";
	}
	
}
