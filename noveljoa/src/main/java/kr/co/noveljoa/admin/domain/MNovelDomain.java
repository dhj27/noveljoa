package kr.co.noveljoa.admin.domain;

import java.sql.Date;

public class MNovelDomain {
	private String novelTitle, id;
	private int novelNum, likeCnt, reportCnt;
	private Date createDate;
	
	
	public String getNovelTitle() {
		return novelTitle;
	}
	public void setNovelTitle(String novelTitle) {
		this.novelTitle = novelTitle;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNovelNum() {
		return novelNum;
	}
	public void setNovelNum(int novelNum) {
		this.novelNum = novelNum;
	}
	public int getLikeCnt() {
		return likeCnt;
	}
	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}
	public int getReportCnt() {
		return reportCnt;
	}
	public void setReportCnt(int reportCnt) {
		this.reportCnt = reportCnt;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "MNovelDomain [novelTitle=" + novelTitle + ", id=" + id + ", novelNum=" + novelNum + ", likeCnt="
				+ likeCnt + ", reportCnt=" + reportCnt + ", createDate=" + createDate + "]";
	}
	
	
}
