package kr.co.noveljoa.admin.vo;

import java.sql.Date;

public class InsertMVO {
	private String id, password;
	private Date input_date;
	
	
	public InsertMVO() {
		
	}


	public InsertMVO(String id, String password, Date input_date) {
		super();
		this.id = id;
		this.password = password;
		this.input_date = input_date;
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


	public Date getInput_date() {
		return input_date;
	}


	public void setInput_date(Date input_date) {
		this.input_date = input_date;
	}


	@Override
	public String toString() {
		return "InjectionVO [id=" + id + ", password=" + password + ", input_date=" + input_date + "]";
	}


	
	
}
