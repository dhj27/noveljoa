package kr.co.noveljoa.user.login.domain;

import java.sql.Date;

public class InfoDomain {

	private String name,id,phone,email;
	private Date birth;
	
	public InfoDomain() {
		super();
	}

	public InfoDomain(String name, String id, String phone, String email, Date birth) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.email = email;
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

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "InfoDomain [name=" + name + ", id=" + id + ", phone=" + phone + ", email=" + email + ", birth=" + birth
				+ "]";
	}
	
	
	
}
