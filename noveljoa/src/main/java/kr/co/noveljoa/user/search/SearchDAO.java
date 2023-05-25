package kr.co.noveljoa.user.search;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.user.dao.MyBatisHandler;


public class SearchDAO {
	
	public List<SearchDomain> selectRanking(SearchVO rVO){
		List<SearchDomain> list=null;
		
		//1. MyBatis Handler얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		list=ss.selectList("rankingMapper.selectRanking",rVO);
		//3. transaction 완료
//		if(list!=null) {
//			ss.commit();
//		}//end if
		//4. 연결끊기
		if(ss!=null) {ss.close();}//end if
				
		return list;
	}

}
