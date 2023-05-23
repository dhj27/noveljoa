package kr.co.noveljoa.user.episode.vo;

import java.util.Date;

public class NovelReportVO {
	
	private int num_member;
	private int num_novel;
	private String id;
	private int reason_code;
	private Date report_date;
	
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public int getNum_novel() {
		return num_novel;
	}
	public void setNum_novel(int num_novel) {
		this.num_novel = num_novel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getReason_code() {
		return reason_code;
	}
	public void setReason_code(int reason_code) {
		this.reason_code = reason_code;
	}
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	@Override
	public String toString() {
		return "NovelReportVO [num_member=" + num_member + ", num_novel=" + num_novel + ", id=" + id + ", reason_code="
				+ reason_code + ", report_date=" + report_date + "]";
	}
	
	
}
