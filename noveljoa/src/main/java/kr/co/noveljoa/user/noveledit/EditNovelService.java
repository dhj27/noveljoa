package kr.co.noveljoa.user.noveledit;

public class EditNovelService {
	
	private EditNovelDAO enDAO;
	
	public EditNovelService(EditNovelDAO enDAO) {
		this.enDAO=enDAO;
	}
	public void insert(EditNovelVO enVO) {
		enDAO.updateEditNovel(enVO);
	}
	public int delete(int num_novel) {
		int cnt=enDAO.deleteNovel(num_novel);
		return cnt;
	}

}
