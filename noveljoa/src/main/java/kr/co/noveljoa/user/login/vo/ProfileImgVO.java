package kr.co.noveljoa.user.login.vo;

public class ProfileImgVO {
	private String photo;
	private int num_member;
	public ProfileImgVO() {
		super();
	}
	public ProfileImgVO(String photo, int num_member) {
		super();
		this.photo = photo;
		this.num_member = num_member;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	@Override
	public String toString() {
		return "ProfileImgVO [photo=" + photo + ", num_member=" + num_member + "]";
	}
	
	
	
}
