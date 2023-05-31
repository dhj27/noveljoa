package kr.co.noveljoa.user.episode.domain;

public class EpLookDomain {
	
	private int num_member;
	private int num_novel;
	private int num_episode;
	
	private String novelTitle;
	private String epTitle;
	private String epDetail;
	private String cmt;
	
	private int bookmark;
	
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
	public String getNovelTitle() {
		return novelTitle;
	}
	public void setNovelTitle(String novelTitle) {
		this.novelTitle = novelTitle;
	}
	public String getEpTitle() {
		return epTitle;
	}
	public void setEpTitle(String epTitle) {
		this.epTitle = epTitle;
	}
	public String getEpDetail() {
		return epDetail;
	}
	public void setEpDetail(String epDetail) {
		this.epDetail = epDetail;
	}
	public int getBookmark() {
		return bookmark;
	}
	public void setBookmark(int bookmark) {
		this.bookmark = bookmark;
	}
	
	
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	@Override
	public String toString() {
		return "EpLookDomain [num_member=" + num_member + ", num_novel=" + num_novel + ", num_episode=" + num_episode
				+ ", novelTitle=" + novelTitle + ", epTitle=" + epTitle + ", epDetail=" + epDetail + ", cmt=" + cmt
				+ ", bookmark=" + bookmark + "]";
	}

	

}
