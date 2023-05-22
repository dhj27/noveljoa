package kr.co.noveljoa.user.mynovel;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.user.dao.MyBatisHandler;


public class MyNovelDAO {
	
	public List<MyNovelDomain> selectMyNovel(MyNovelVO mnVO){
		List<MyNovelDomain> list=null;

		//1. MyBatis Handler얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		list=ss.selectList("myNovelMapper.selectMyNovel",mnVO);
		//3. transaction 완료
//		if(list!=null) {
//			ss.commit();
//		}//end if
		//4. 연결끊기
		if(ss!=null) {ss.close();}//end if
				
		return list;
	}

}
