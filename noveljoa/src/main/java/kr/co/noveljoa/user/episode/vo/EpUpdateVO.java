package kr.co.noveljoa.user.episode.vo;

public class EpUpdateVO {
	
	private int num_novel;
	private int num_member;
	private int num_episode;
	
	private String title;
	private String story;
	private String cmt;
	private int open;
	
	
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
	@Override
	public String toString() {
		return "EpUpdateVO [num_novel=" + num_novel + ", num_member=" + num_member + ", num_episode=" + num_episode
				+ ", title=" + title + ", story=" + story + ", cmt=" + cmt + ", open=" + open + "]";
	}
	
}
