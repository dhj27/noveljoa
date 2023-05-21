package kr.co.noveljoa.admin.domain;

import java.sql.Date;

public class MLoginDomain {
	
	private String id;
	private Date create_date;
	

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "MLoginDomain [id=" + id + ", create_date=" + create_date + "]";
	}
	
	
}
