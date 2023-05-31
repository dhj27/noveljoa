package kr.co.noveljoa.user.episode.vo;

public class NovelReportVO {
	
	private int num_novel;
	private String id;
	private int reason_code;
	
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
	@Override
	public String toString() {
		return "NovelReportVO [num_novel=" + num_novel + ", id=" + id + ", reason_code=" + reason_code + "]";
	}
	
	
}
