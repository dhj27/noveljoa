package kr.co.noveljoa.user.writernovel;

public class WriterNovelVO {
	private int order_novel;
	private String user_num_member;
	public WriterNovelVO() {
		super();
	}
	public WriterNovelVO(int order_novel, String user_num_member) {
		super();
		this.order_novel = order_novel;
		this.user_num_member = user_num_member;
	}
	public int getOrder_novel() {
		return order_novel;
	}
	public void setOrder_novel(int order_novel) {
		this.order_novel = order_novel;
	}
	public String getUser_num_member() {
		return user_num_member;
	}
	public void setUser_num_member(String user_num_member) {
		this.user_num_member = user_num_member;
	}
	@Override
	public String toString() {
		return "MyNovelVO [order_novel=" + order_novel + ", user_num_member=" + user_num_member + "]";
	}
	
}
