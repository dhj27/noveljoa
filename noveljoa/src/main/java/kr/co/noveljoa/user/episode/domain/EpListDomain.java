package kr.co.noveljoa.user.episode.domain;

import java.util.Date;

public class EpListDomain {
	
	private int num_member;
	private int num_novel;
	private int num_episode;
	
	private int epCnt;
	private String epTitle;
	private int views;
	private Date date;
	private int bookmark;
	
	
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public int getNum_novel() {
		return num_novel;
	}
	public void setNum_novel(int num_novel) {
		this.num_novel = num_novel;
	}
	public int getNum_episode() {
		return num_episode;
	}
	public void setNum_episode(int num_episode) {
		this.num_episode = num_episode;
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
		return "EpListDomain [num_member=" + num_member + ", num_novel=" + num_novel + ", num_episode=" + num_episode
				+ ", epCnt=" + epCnt + ", epTitle=" + epTitle + ", views=" + views + ", date=" + date + ", bookmark="
				+ bookmark + "]";
	}
	
}
