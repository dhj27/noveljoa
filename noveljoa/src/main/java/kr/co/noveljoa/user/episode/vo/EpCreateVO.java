package kr.co.noveljoa.user.episode.vo;

public class EpCreateVO {
	
	private int userNum;
	private int novelNum;
	private String epTitle;
	private String detail;
	private String myComment;
	private int openStatus;
	private int views;
	
	
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public int getNovelNum() {
		return novelNum;
	}
	public void setNovelNum(int novelNum) {
		this.novelNum = novelNum;
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
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	@Override
	public String toString() {
		return "EpCreateVO [userNum=" + userNum + ", novelNum=" + novelNum + ", epTitle=" + epTitle + ", detail="
				+ detail + ", myComment=" + myComment + ", openStatus=" + openStatus + ", views=" + views + "]";
	}
	
}
