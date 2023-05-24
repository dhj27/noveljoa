package kr.co.noveljoa.user.login.vo;

import java.sql.Date;

public class SignupVO {

	private String name, id, pw, email,phone;
	private Date birth;
	public SignupVO() {
		super();
	}
	public SignupVO(String name, String id, String pw, String email, String phone, Date birth) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.phone = phone;
		this.birth = birth;
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "SignupVO [name=" + name + ", id=" + id + ", pw=" + pw + ", email=" + email + ", phone=" + phone
				+ ", birth=" + birth + "]";
	}
	
	
	
}
