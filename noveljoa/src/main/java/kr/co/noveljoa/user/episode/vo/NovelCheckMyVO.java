package kr.co.noveljoa.user.episode.vo;

public class NovelCheckMyVO {
	
	private int num_member;
	private int num_novel;
	//private int sortNum;
	
	
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
	@Override
	public String toString() {
		return "NovelCheckMyVO [num_member=" + num_member + ", num_novel=" + num_novel + "]";
	}
	
	
	
}
