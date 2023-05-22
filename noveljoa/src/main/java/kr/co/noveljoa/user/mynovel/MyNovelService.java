package kr.co.noveljoa.user.mynovel;

import java.util.List;

public class MyNovelService {
	
	private MyNovelDAO mnDAO;
	
	public MyNovelService(MyNovelDAO mnDAO) {
		this.mnDAO=mnDAO;
	}
	public List<MyNovelDomain> search(MyNovelVO mnVO) {
		List<MyNovelDomain> list=mnDAO.selectMyNovel(mnVO);
		
		return list;
	}

}
