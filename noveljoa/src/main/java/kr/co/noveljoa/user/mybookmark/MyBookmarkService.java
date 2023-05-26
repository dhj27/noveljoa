package kr.co.noveljoa.user.mybookmark;

import java.util.List;

public class MyBookmarkService {
	
	private MyBookmarkDAO mlDAO;
	
	public MyBookmarkService(MyBookmarkDAO mlDAO) {
		this.mlDAO=mlDAO;
	}
	public List<MyBookmarkDomain> search(MyBookmarkVO mlVO) {
		List<MyBookmarkDomain> list=mlDAO.selectMyBookmark(mlVO);
		
		return list;
	}
	public void delete(DeleteBookmarkVO dlVO) {
		mlDAO.deleteMyBookmark(dlVO);
	}

}
