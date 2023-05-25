package kr.co.noveljoa.user.mylike;

public class DeleteLikeVO {
	private int num_member,num_novel;
	public DeleteLikeVO() {
	}
	public DeleteLikeVO(int num_member, int num_novel) {
		super();
		this.num_member = num_member;
		this.num_novel = num_novel;
	}
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
}
