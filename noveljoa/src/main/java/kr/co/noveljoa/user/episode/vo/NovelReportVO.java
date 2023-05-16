package kr.co.noveljoa.user.episode.vo;

import java.util.Date;

public class NovelReportVO {
	
	private int userNum;
	private int novelNum;
	private int reportCode;
	private Date reportDate;
	
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public int getNovelNum() {
		return novelNum;
	}
	public void setNovelNum(int novelNum) {
		this.novelNum = novelNum;
	}
	public int getReportCode() {
		return reportCode;
	}
	public void setReportCode(int reportCode) {
		this.reportCode = reportCode;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	@Override
	public String toString() {
		return "NovelReportVO [userNum=" + userNum + ", novelNum=" + novelNum + ", reportCode=" + reportCode
				+ ", reportDate=" + reportDate + "]";
	}

	
}
