package kr.co.noveljoa.admin.vo;

public class MBoardCmtVO {
	private int boardNum, cmtNum;
	private String managerCmt;
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
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
		return "MBoardCmtVO [boardNum=" + boardNum + ", cmtNum=" + cmtNum + ", managerCmt=" + managerCmt + "]";
	}
	

	
}
