package kr.co.noveljoa.user.main;

public class MainDomain {
	private String photo,title,id,story;
	private int num_novel, age,liken_count,visit,rank, episode,end,genre;
	public MainDomain() {
	}
	public MainDomain(String photo, String title, String id, String story, int num_novel, int age, int liken_count,
			int visit, int rank, int episode, int end, int genre) {
		super();
		this.photo = photo;
		this.title = title;
		this.id = id;
		this.story = story;
		this.num_novel = num_novel;
		this.age = age;
		this.liken_count = liken_count;
		this.visit = visit;
		this.rank = rank;
		this.episode = episode;
		this.end = end;
		this.genre = genre;
	}
	public int getNum_novel() {
		return num_novel;
	}
	public void setNum_novel(int num_novel) {
		this.num_novel = num_novel;
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
	public int getLiken_count() {
		return liken_count;
	}
	public void setLiken_count(int liken_count) {
		this.liken_count = liken_count;
	}
	public int getVisit() {
		return visit;
	}
	public void setVisit(int visit) {
		this.visit = visit;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getEpisode() {
		return episode;
	}
	public void setEpisode(int episode) {
		this.episode = episode;
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
	
}
