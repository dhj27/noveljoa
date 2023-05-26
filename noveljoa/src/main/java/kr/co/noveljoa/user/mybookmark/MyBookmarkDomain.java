package kr.co.noveljoa.user.mybookmark;

import java.sql.Date;

public class MyBookmarkDomain {
	
	private String photo,title,etitle;
	private int age,open,end,genre,num_episode,num_novel,eopen;
	private Date emake;
	
	public MyBookmarkDomain() {
	}
	public MyBookmarkDomain(String photo, String title, String etitle, int age, int open, int end, int genre,
			int num_episode, int num_novel, int eopen, Date emake) {
		super();
		this.photo = photo;
		this.title = title;
		this.etitle = etitle;
		this.age = age;
		this.open = open;
		this.end = end;
		this.genre = genre;
		this.num_episode = num_episode;
		this.num_novel = num_novel;
		this.eopen = eopen;
		this.emake = emake;
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
	public String getEtitle() {
		return etitle;
	}
	public void setEtitle(String etitle) {
		this.etitle = etitle;
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
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	public int getNum_episode() {
		return num_episode;
	}
	public void setNum_episode(int num_episode) {
		this.num_episode = num_episode;
	}
	public int getNum_novel() {
		return num_novel;
	}
	public void setNum_novel(int num_novel) {
		this.num_novel = num_novel;
	}
	public int getEopen() {
		return eopen;
	}
	public void setEopen(int eopen) {
		this.eopen = eopen;
	}
	public Date getEmake() {
		return emake;
	}
	public void setEmake(Date emake) {
		this.emake = emake;
	}
	
}
