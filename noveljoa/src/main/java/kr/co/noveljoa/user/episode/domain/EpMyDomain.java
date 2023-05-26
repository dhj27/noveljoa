package kr.co.noveljoa.user.episode.domain;

public class EpMyDomain {
	
	private String novelTitle;
	private String epTitle;
	private String epDetail;
	private String cmt;
	private int open;
	
	public String getNovelTitle() {
		return novelTitle;
	}
	public void setNovelTitle(String novelTitle) {
		this.novelTitle = novelTitle;
	}
	public String getEpTitle() {
		return epTitle;
	}
	public void setEpTitle(String epTitle) {
		this.epTitle = epTitle;
	}
	public String getEpDetail() {
		return epDetail;
	}
	public void setEpDetail(String epDetail) {
		this.epDetail = epDetail;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	@Override
	public String toString() {
		return "EpMyDomain [novelTitle=" + novelTitle + ", epTitle=" + epTitle + ", epDetail=" + epDetail
				+ ", cmt=" + cmt + ", open=" + open + "]";
	}
	
}
