package kr.co.noveljoa.user.login.vo;

public class InfoChangeVO {
	String id, phone;

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

	public InfoChangeVO(String id, String phone) {
		super();
		this.id = id;
		this.phone = phone;
	}

	public InfoChangeVO() {
		super();
	}

	@Override
	public String toString() {
		return "InfoChangeVO [id=" + id + ", phone=" + phone + "]";
	}
	
	
}
