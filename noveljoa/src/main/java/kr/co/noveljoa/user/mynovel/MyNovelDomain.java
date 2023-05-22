package kr.co.noveljoa.user.mynovel;

public class MyNovelDomain {
	private String photo,title;
	private int num_novel, age, open, end;
	public MyNovelDomain() {
	}
	public MyNovelDomain(String photo, String title, int num_novel, int age, int open, int end) {
		super();
		this.photo = photo;
		this.title = title;
		this.num_novel = num_novel;
		this.age = age;
		this.open = open;
		this.end = end;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNum_novel() {
		return num_novel;
	}
	public void setNum_novel(int num_novel) {
		this.num_novel = num_novel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
}
