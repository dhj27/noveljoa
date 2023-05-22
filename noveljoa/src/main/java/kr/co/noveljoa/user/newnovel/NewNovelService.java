package kr.co.noveljoa.user.newnovel;

public class NewNovelService {
	
	private NewNovelDAO nnDAO;
	
	public NewNovelService(NewNovelDAO nnDAO) {
		this.nnDAO=nnDAO;
	}
	public void insert(NewNovelVO nnVO) {
		nnDAO.insertNewNovel(nnVO);
	}

}
