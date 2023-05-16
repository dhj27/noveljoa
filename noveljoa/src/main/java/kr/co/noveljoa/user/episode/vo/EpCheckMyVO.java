package kr.co.noveljoa.user.episode.vo;

public class EpCheckMyVO {
	
	private int userNum;
	private int novelNum;
	private int epNum;
	
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
	@Override
	public String toString() {
		return "EpCheckMyVO [userNum=" + userNum + ", novelNum=" + novelNum + ", epNum=" + epNum + "]";
	}
	
	

}
