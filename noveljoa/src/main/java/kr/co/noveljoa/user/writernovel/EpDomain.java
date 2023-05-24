package kr.co.noveljoa.user.writernovel;

import java.sql.Date;

public class EpDomain {
	
	private int num_novel, num_episode, visit;
	private String title;
	private Date make;
	
	public EpDomain() {
		super();
	}
	public EpDomain(int num_novel, int num_episode, int visit, String title, Date make) {
		super();
		this.num_novel = num_novel;
		this.num_episode = num_episode;
		this.visit = visit;
		this.title = title;
		this.make = make;
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
	public int getVisit() {
		return visit;
	}
	public void setVisit(int visit) {
		this.visit = visit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getMake() {
		return make;
	}
	public void setMake(Date make) {
		this.make = make;
	}
	
}
