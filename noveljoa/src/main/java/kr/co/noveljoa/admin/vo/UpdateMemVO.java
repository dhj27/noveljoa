package kr.co.noveljoa.admin.vo;

public class UpdateMemVO {
	
	private int num_member;
	private String id, name, phone, email;
	
	
	
	public UpdateMemVO(int num_member, String id, String name, String phone, String email) {
		super();
		this.num_member = num_member;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UpdateMemVO [num_member=" + num_member + ", id=" + id + ", name=" + name + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	

}
