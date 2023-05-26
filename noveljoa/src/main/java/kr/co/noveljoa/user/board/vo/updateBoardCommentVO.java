package kr.co.noveljoa.user.board.vo;

public class updateBoardCommentVO {
	private String detail;
	private int num_member, board_cmt_num;
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public int getBoard_cmt_num() {
		return board_cmt_num;
	}
	public void setBoard_cmt_num(int board_cmt_num) {
		this.board_cmt_num = board_cmt_num;
	}
	@Override
	public String toString() {
		return "updateBoardCommentVO [detail=" + detail + ", num_member=" + num_member + ", board_cmt_num="
				+ board_cmt_num + "]";
	}

	
	
	
	
	
	
	

}
