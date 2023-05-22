package kr.co.noveljoa.user.episode.vo;

public class NovelCheckMyVO {
	
	private int userNum;
	private int novelNum;
	//private int sortNum;
	
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
		return "NovelCheckMyVO [userNum=" + userNum + ", novelNum=" + novelNum + "]";
	}

	
}
