package kr.co.noveljoa.user.episode.domain;

import java.util.Date;

// 에피소드 리스트 출력
public class EpListDomain {
	
	private int num_novel;
	private int num_episode;
	
	private String title;
	private int visit;
	private Date make;
	
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		return "EpListDomain [num_novel=" + num_novel + ", num_episode=" + num_episode + ", title="
				+ title + ", visit=" + visit + ", make=" + make + "]";
	}
	
	
}
