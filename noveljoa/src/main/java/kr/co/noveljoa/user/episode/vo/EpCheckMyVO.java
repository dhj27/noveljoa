package kr.co.noveljoa.user.episode.vo;

public class EpCheckMyVO {
	
	private int num_member;
	private int num_novel;
	private int num_episode;
	
	
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
	@Override
	public String toString() {
		return "EpCheckMyVO [num_member=" + num_member + ", num_novel=" + num_novel + ", num_episode=" + num_episode
				+ "]";
	}

}
