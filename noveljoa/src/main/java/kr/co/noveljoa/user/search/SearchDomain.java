package kr.co.noveljoa.user.search;

import java.sql.Date;

public class SearchDomain {
	private String photo,title,id;
	private int num_novel, age, num_episodes,end,genre;
	private Date max_make;
	public SearchDomain() {
	}
	public SearchDomain(String photo, String title, String id, int num_novel, int age, int num_episodes, int end,
			int genre, Date max_make) {
		super();
		this.photo = photo;
		this.title = title;
		this.id = id;
		this.num_novel = num_novel;
		this.age = age;
		this.num_episodes = num_episodes;
		this.end = end;
		this.genre = genre;
		this.max_make = max_make;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getNum_episodes() {
		return num_episodes;
	}
	public void setNum_episodes(int num_episodes) {
		this.num_episodes = num_episodes;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public Date getMax_make() {
		return max_make;
	}
	public void setMax_make(Date max_make) {
		this.max_make = max_make;
	}
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
}
