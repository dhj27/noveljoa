package kr.co.noveljoa.user.login.vo;

public class PasswordTempVO {

	private String pw;
	private String id;
	public PasswordTempVO() {
		super();
	}
	public PasswordTempVO(String pw, String id) {
		super();
		this.pw = pw;
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PassworedTemp [pw=" + pw + ", id=" + id + "]";
	}
	
	
	
}
