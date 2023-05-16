package kr.co.noveljoa.user.episode.vo;

public class EpListVO {
	
	private int novelNum;
	private int sortNum;
	
	public int getNovelNum() {
		return novelNum;
	}
	public void setNovelNum(int novelNum) {
		this.novelNum = novelNum;
	}
	public int getSortNum() {
		return sortNum;
	}
	public void setSortNum(int sortNum) {
		this.sortNum = sortNum;
	}
	@Override
	public String toString() {
		return "EpListVO [novelNum=" + novelNum + ", sortNum=" + sortNum + "]";
	}
	
}
