package kr.co.noveljoa.user.episode.domain;

public class EpMyDomain {
	
	private String novelTitle;
	private String epTitle;
	private String detail;
	private String myComment;
	private int openStatus;
	
	public EpMyDomain() {}
	
	public EpMyDomain(String novelTitle, String epTitle, String detail, String myComment, int openStatus) {
		this.novelTitle = novelTitle;
		this.epTitle = epTitle;
		this.detail = detail;
		this.myComment = myComment;
		this.openStatus = openStatus;
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getMyComment() {
		return myComment;
	}
	public void setMyComment(String myComment) {
		this.myComment = myComment;
	}
	public int getOpenStatus() {
		return openStatus;
	}
	public void setOpenStatus(int openStatus) {
		this.openStatus = openStatus;
	}
	@Override
	public String toString() {
		return "EpMyDomain [novelTitle=" + novelTitle + ", epTitle=" + epTitle + ", detail=" + detail + ", myComment="
				+ myComment + ", openStatus=" + openStatus + "]";
	}
	
}
