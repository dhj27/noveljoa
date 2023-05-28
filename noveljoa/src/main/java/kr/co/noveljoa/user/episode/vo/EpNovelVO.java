package kr.co.noveljoa.user.episode.vo;

public class EpNovelVO {
	
	private int num_novel;
	private String novelTitle;
	
	public int getNum_novel() {
		return num_novel;
	}
	public void setNum_novel(int num_novel) {
		this.num_novel = num_novel;
	}
	public String getNovelTitle() {
		return novelTitle;
	}
	public void setNovelTitle(String novelTitle) {
		this.novelTitle = novelTitle;
	}
	@Override
	public String toString() {
		return "EpNovelVO [num_novel=" + num_novel + ", novelTitle=" + novelTitle + "]";
	}
	
}
