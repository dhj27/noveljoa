package kr.co.noveljoa.user.main;

public class MainVO {
	private int type,genre;
	public MainVO() {
	}
	public MainVO(int type, int genre) {
		super();
		this.type = type;
		this.genre = genre;
	}
	public int gettype() {
		return type;
	}
	public void settype(int type) {
		this.type = type;
	}
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
}
