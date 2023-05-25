package kr.co.noveljoa.user.search;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.user.dao.MyBatisHandler;


public class SearchDAO {
	
	public List<SearchDomain> selectSearch(SearchVO sVO){
		List<SearchDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		list=ss.selectList("searchMapper.selectSearch",sVO);
		if(ss!=null) {ss.close();}//end if
				
		return list;
	}

}
