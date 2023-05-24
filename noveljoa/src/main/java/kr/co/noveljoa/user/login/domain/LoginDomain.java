package kr.co.noveljoa.user.login.domain;

public class LoginDomain {
	
	private int num_member;
	private String name,id,photo;
	
	public LoginDomain() {
		super();
	}
	public LoginDomain(int num_member, String name, String id, String photo) {
		super();
		this.num_member = num_member;
		this.name = name;
		this.id = id;
		this.photo = photo;
	}
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "LoginDomain [num_member=" + num_member + ", name=" + name + ", id=" + id + ", photo=" + photo + "]";
	}

	
	
}
