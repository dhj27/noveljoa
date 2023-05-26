package kr.co.noveljoa.user.mybookmark;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.user.dao.MyBatisHandler;


public class MyBookmarkDAO {
	
	public List<MyBookmarkDomain> selectMyBookmark(MyBookmarkVO mbVO){
		List<MyBookmarkDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		list=ss.selectList("mybookmarkMapper.selectMyBookmark",mbVO);
		if(ss!=null) {ss.close();}//end if
				
		return list;
	}
	public int deleteMyBookmark(DeleteBookmarkVO dbVO){
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		int cnt=ss.delete("mybookmarkMapper.deleteMyBookmark",dbVO);
		if(cnt==1) {
			ss.commit();
		}//end if
		if(ss!=null) {ss.close();}//end if
		
		return cnt;
	}

}
