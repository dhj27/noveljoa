package kr.co.noveljoa.user.episode.vo;

public class EpUpdateVO {
	
	private int userNum;
	private int novelNum;
	private int epNum;
	private String epTitle;
	private String detail;
	private String myComment;
	private int openStatus;
	
	
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
	public int getEpNum() {
		return epNum;
	}
	public void setEpNum(int epNum) {
		this.epNum = epNum;
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
		return "EpUpdateVO [userNum=" + userNum + ", novelNum=" + novelNum + ", epNum=" + epNum + ", epTitle=" + epTitle
				+ ", detail=" + detail + ", myComment=" + myComment + ", openStatus=" + openStatus + "]";
	}
	
	

}
