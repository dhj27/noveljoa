package kr.co.noveljoa.user.episode.vo;

public class EpCreateVO {
	
	private int num_member;
	private int num_novel;
	
	private String title;
	private String story;
	private String cmt;
	private int open;
	private int visit;
	
	
	public int getNum_novel() {
		return num_novel;
	}
	public void setNum_novel(int num_novel) {
		this.num_novel = num_novel;
	}
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getVisit() {
		return visit;
	}
	public void setVisit(int visit) {
		this.visit = visit;
	}
	@Override
	public String toString() {
		return "EpCreateVO [num_novel=" + num_novel + ", num_member=" + num_member + ", title=" + title + ", story="
				+ story + ", cmt=" + cmt + ", open=" + open + ", visit=" + visit + "]";
	}
	
}
