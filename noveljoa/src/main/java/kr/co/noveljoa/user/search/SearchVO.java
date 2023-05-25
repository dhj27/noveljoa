package kr.co.noveljoa.user.search;

public class SearchVO {
	private int type,genre;
	private String search;
	public SearchVO() {
	}
	public SearchVO(int type, int genre, String search) {
		super();
		this.type = type;
		this.genre = genre;
		this.search = search;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
}
