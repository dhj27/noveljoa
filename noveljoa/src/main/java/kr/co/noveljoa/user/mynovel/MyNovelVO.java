package kr.co.noveljoa.user.mynovel;

public class MyNovelVO {
	private int order_novel;
	private String num_member;
	public MyNovelVO() {
		super();
	}
	public MyNovelVO(int order_novel, String num_member) {
		super();
		this.order_novel = order_novel;
		this.num_member = num_member;
	}
	public int getOrder_novel() {
		return order_novel;
	}
	public void setOrder_novel(int order_novel) {
		this.order_novel = order_novel;
	}
	public String getNum_member() {
		return num_member;
	}
	public void setNum_member(String num_member) {
		this.num_member = num_member;
	}
	@Override
	public String toString() {
		return "MyNovelVO [order_novel=" + order_novel + ", num_member=" + num_member + "]";
	}
	
}
