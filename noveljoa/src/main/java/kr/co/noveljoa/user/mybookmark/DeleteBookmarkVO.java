package kr.co.noveljoa.user.mybookmark;

public class DeleteBookmarkVO {
	private int num_member,num_episode;
	public DeleteBookmarkVO() {
	}
	public DeleteBookmarkVO(int num_member, int num_episode) {
		super();
		this.num_member = num_member;
		this.num_episode = num_episode;
	}
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
}
