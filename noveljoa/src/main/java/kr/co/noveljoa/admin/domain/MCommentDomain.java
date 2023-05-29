package kr.co.noveljoa.admin.domain;

import java.sql.Date;

public class MCommentDomain {
	private int cmtNum;
	private String id, cmtDetail, managerCmt;
	private Date createDate;
	
	public int getCmtNum() {
		return cmtNum;
	}
	public void setCmtNum(int cmtNum) {
		this.cmtNum = cmtNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCmtDetail() {
		return cmtDetail;
	}
	public void setCmtDetail(String cmtDetail) {
		this.cmtDetail = cmtDetail;
	}
	public String getManagerCmt() {
		return managerCmt;
	}
	public void setManagerCmt(String managerCmt) {
		this.managerCmt = managerCmt;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "MCommentDomain [cmtNum=" + cmtNum + ", id=" + id + ", cmtDetail=" + cmtDetail + ", managerCmt="
				+ managerCmt + ", createDate=" + createDate + "]";
	}
	
}
