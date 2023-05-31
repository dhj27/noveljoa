package kr.co.noveljoa.user.episode.vo;

public class ReportVO {
	
	private int num_member;
	private int num_novel;
	private String id;
	
	
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ReportVO [num_member=" + num_member + ", num_novel=" + num_novel + ", id=" + id + "]";
	}
	
	
	

}
