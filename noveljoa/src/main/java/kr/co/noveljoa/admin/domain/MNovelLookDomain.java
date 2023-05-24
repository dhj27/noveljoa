package kr.co.noveljoa.admin.domain;

public class MNovelLookDomain {

	private String novelTitle, id, thumbnail, intro;
	private int ageAble, reportReason, reportCnt, novelNum;
	
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
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public int getAgeAble() {
		return ageAble;
	}
	public void setAgeAble(int ageAble) {
		this.ageAble = ageAble;
	}
	public int getReportReason() {
		return reportReason;
	}
	public void setReportReason(int reportReason) {
		this.reportReason = reportReason;
	}
	public int getReportCnt() {
		return reportCnt;
	}
	public void setReportCnt(int reportCnt) {
		this.reportCnt = reportCnt;
	}
	public int getNovelNum() {
		return novelNum;
	}
	public void setNovelNum(int novelNum) {
		this.novelNum = novelNum;
	}
	@Override
	public String toString() {
		return "MNovelLookDomain [novelTitle=" + novelTitle + ", id=" + id + ", thumbnail=" + thumbnail + ", intro="
				+ intro + ", ageAble=" + ageAble + ", reportReason=" + reportReason + ", reportCnt=" + reportCnt
				+ ", novelNum=" + novelNum + "]";
	}

	
}
