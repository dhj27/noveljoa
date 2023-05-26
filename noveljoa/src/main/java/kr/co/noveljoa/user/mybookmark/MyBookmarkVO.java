package kr.co.noveljoa.user.mybookmark;

public class MyBookmarkVO {
	private int num_member,type;
	private String search;
	public MyBookmarkVO() {
	}
	public MyBookmarkVO(int num_member, int type, String search) {
		super();
		this.num_member = num_member;
		this.type = type;
		this.search = search;
	}
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
}
