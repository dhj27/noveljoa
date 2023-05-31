package kr.co.noveljoa.user.episode.vo;

public class CommentCheckMyVO {
	
	private int num_member;
	private int num_episode;
	
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public int getNum_episode() {
		return num_episode;
	}
	public void setNum_episode(int num_episode) {
		this.num_episode = num_episode;
	}
	@Override
	public String toString() {
		return "CommentCheckMyVO [num_member=" + num_member + ", num_episode=" + num_episode + "]";
	}
	
}
