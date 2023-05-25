package kr.co.noveljoa.user.mylike;

import java.util.List;

public class MyLikeService {
	
	private MyLikeDAO mlDAO;
	
	public MyLikeService(MyLikeDAO mlDAO) {
		this.mlDAO=mlDAO;
	}
	public List<MyLikeDomain> search(MyLikeVO mlVO) {
		List<MyLikeDomain> list=mlDAO.selectMyLike(mlVO);
		
		return list;
	}
	public void delete(DeleteLikeVO dlVO) {
		mlDAO.deleteMyLike(dlVO);
	}

}
