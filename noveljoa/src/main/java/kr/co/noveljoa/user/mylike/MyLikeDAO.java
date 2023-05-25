package kr.co.noveljoa.user.mylike;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.user.dao.MyBatisHandler;


public class MyLikeDAO {
	
	public List<MyLikeDomain> selectMyLike(MyLikeVO mlVO){
		List<MyLikeDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		list=ss.selectList("mylikeMapper.selectMyLike",mlVO);
		if(ss!=null) {ss.close();}//end if
				
		return list;
	}
	public int deleteMyLike(DeleteLikeVO dlVO){
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		int cnt=ss.delete("mylikeMapper.deleteMyLike",dlVO);
		if(cnt==1) {
			ss.commit();
		}//end if
		if(ss!=null) {ss.close();}//end if
		
		return cnt;
	}

}
