package kr.co.noveljoa.user.episode.vo;

public class CommentInsertVO {
	
	private int num_member;
	private int num_episode;
	private String detail;
	
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "CommentInsertVO [num_member=" + num_member + ", num_episode=" + num_episode + ", detail=" + detail
				+ "]";
	}
	
}
