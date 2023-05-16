package kr.co.noveljoa.admin.vo;

public class MLoginVO {
	private String id, password;

	public MLoginVO() {
		
	}

	public MLoginVO(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MLoginVO [id=" + id + ", password=" + password + "]";
	}
	
}
