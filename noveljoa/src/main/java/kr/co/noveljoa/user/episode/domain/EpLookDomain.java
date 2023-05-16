package kr.co.noveljoa.user.episode.domain;

public class EpLookDomain {
	
	private String novelTitle;
	private String epTitle;
	private String epDetail;
	private int bookmark;
	private String comment;
	
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "EpLookDomain [novelTitle=" + novelTitle + ", epTitle=" + epTitle + ", epDetail=" + epDetail
				+ ", bookmark=" + bookmark + ", comment=" + comment + "]";
	}
	
	

}
