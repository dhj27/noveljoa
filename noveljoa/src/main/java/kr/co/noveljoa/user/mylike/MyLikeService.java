package kr.co.noveljoa.user.mylike;

import java.util.List;

public class MyLikeService {
	
	private MyLikeDAO mlDAO;
	
	public MyLikeService(MyLikeDAO mlDAO) {
		this.mlDAO=mlDAO;
	}
	public List<MyLikeDomain> search(MyLikeVO rVO) {
		List<MyLikeDomain> list=mlDAO.selectMyLike(rVO);
		
		return list;
	}
	public void delete(MyLikeVO rVO) {
		mlDAO.deleteMyLike(rVO);
	}

}
