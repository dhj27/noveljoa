package kr.co.noveljoa.admin.vo;

public class InsertCommentVO {
	
	
	
	public InsertCommentVO(int board_num, int num_member, String detail) {
		super();
		this.board_num = board_num;
		this.num_member = num_member;
		this.detail = detail;
	}
	private int board_num, num_member;
	private String detail;
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public int getNum_member() {
		return num_member;
	}
	public void setNum_member(int num_member) {
		this.num_member = num_member;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "InsertCommentVO [board_num=" + board_num + ", num_member=" + num_member + ", detail=" + detail + "]";
	}
	
	
	
	

}
