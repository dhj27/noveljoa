package kr.co.noveljoa.user.login.vo;

public class PasswordChangeVO {

	String id, pw;

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

	public PasswordChangeVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public PasswordChangeVO() {
		super();
	}

	@Override
	public String toString() {
		return "PasswordChange [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
}
