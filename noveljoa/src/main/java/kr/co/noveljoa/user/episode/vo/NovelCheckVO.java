package kr.co.noveljoa.user.episode.vo;

public class NovelCheckVO {
	
	private int userNum;
	private int novelNum;
	
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
	
	@Override
	public String toString() {
		return "NovelCheckVO [userNum=" + userNum + ", novelNum=" + novelNum + "]";
	}
	
}
