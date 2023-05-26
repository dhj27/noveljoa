package kr.co.noveljoa.user.episode.domain;

public class NovelDomain {
	
	private String novelTitle;
	private String age;  // 이용가
	private String id;
	private String intro;  // 소설 소개
	private String photo;
	private int open;
	private int end;
	private int genre;
	private int likeCnt;
	private int reportCnt;
	

	public String getNovelTitle() {
		return novelTitle;
	}
	public void setNovelTitle(String novelTitle) {
		this.novelTitle = novelTitle;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
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
	public int getLikeCnt() {
		return likeCnt;
	}
	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}
	public int getReportCnt() {
		return reportCnt;
	}
	public void setReportCnt(int reportCnt) {
		this.reportCnt = reportCnt;
	}

	@Override
	public String toString() {
		return "NovelDomain [novelTitle=" + novelTitle + ", age=" + age + ", id=" + id + ", intro=" + intro + ", photo="
				+ photo + ", open=" + open + ", end=" + end + ", genre=" + genre + ", likeCnt="
				+ likeCnt + ", reportCnt=" + reportCnt + "]";
	}
	

}
