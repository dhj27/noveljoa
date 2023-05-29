package kr.co.noveljoa.admin.vo;

public class MBoardCmtVO {
	private int cmtNum;
	private String managerCmt;
	
	public int getCmtNum() {
		return cmtNum;
	}
	public void setCmtNum(int cmtNum) {
		this.cmtNum = cmtNum;
	}
	public String getManagerCmt() {
		return managerCmt;
	}
	public void setManagerCmt(String managerCmt) {
		this.managerCmt = managerCmt;
	}
	@Override
	public String toString() {
		return "MBoardCmtVO [cmtNum=" + cmtNum + ", managerCmt=" + managerCmt + "]";
	}
	
}
