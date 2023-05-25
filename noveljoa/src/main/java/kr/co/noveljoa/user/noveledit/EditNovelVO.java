package kr.co.noveljoa.user.noveledit;

public class EditNovelVO {
	private int num_novel,age,open,genre,end;
	private String title,photo,story;
	
	public EditNovelVO() {
	}
	public EditNovelVO(int num_novel, int age, int open, int genre, int end, String title, String photo, String story) {
		super();
		this.num_novel = num_novel;
		this.age = age;
		this.open = open;
		this.genre = genre;
		this.end = end;
		this.title = title;
		this.photo = photo;
		this.story = story;
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
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	
}
