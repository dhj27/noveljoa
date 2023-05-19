package kr.co.noveljoa.user.login.vo;

public class IdSearchVO {

	private String name,phone;

	public IdSearchVO(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public IdSearchVO() {
		super();
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

	@Override
	public String toString() {
		return "IdSearchVO [name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}
