package kr.co.noveljoa.user.writernovel;

public class WriterNovelService {
	
	private WriterNovelDAO wnDAO;
	
	public WriterNovelService(WriterNovelDAO wnDAO) {
		this.wnDAO=wnDAO;
	}
	public WriterNovelDomain search(int num_novel) {
		WriterNovelDomain wnd=wnDAO.selectWriterNovel(num_novel);
		
		return wnd;
	}
	public int countEp(int num_novel) {
		int cnt=wnDAO.countEp(num_novel);
		
		return cnt;
	}

}
