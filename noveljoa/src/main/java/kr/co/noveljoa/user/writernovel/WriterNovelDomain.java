package kr.co.noveljoa.user.writernovel;

public class WriterNovelDomain {
	private String photo,title,story;
	private int age,end,open,genre;
	
	public WriterNovelDomain() {
	}
	public WriterNovelDomain(String photo, String title, String story, int age, int end, int open, int genre) {
		super();
		this.photo = photo;
		this.title = title;
		this.story = story;
		this.age = age;
		this.end = end;
		this.open = open;
		this.genre = genre;
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
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	
}
