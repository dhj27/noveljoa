package kr.co.noveljoa.user.newnovel;

public class NewNovelVO {
	private int num_member,age,open,genre;
	private String title,photo,story;
	
	public NewNovelVO() {
	}

	public NewNovelVO(int num_member, int age, int open, int genre, String title, String photo, String story) {
		super();
		this.num_member = num_member;
		this.age = age;
		this.open = open;
		this.genre = genre;
		this.title = title;
		this.photo = photo;
		this.story = story;
	}

	public int getNum_member() {
		return num_member;
	}

	public void setNum_member(int num_member) {
		this.num_member = num_member;
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

	@Override
	public String toString() {
		return "NewNovelVO [num_member=" + num_member + ", age=" + age + ", open=" + open + ", genre=" + genre
				+ ", title=" + title + ", photo=" + photo + ", story=" + story + "]";
	}
	
}
