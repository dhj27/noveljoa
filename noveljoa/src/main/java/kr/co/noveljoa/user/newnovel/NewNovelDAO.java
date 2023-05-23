package kr.co.noveljoa.user.newnovel;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.user.dao.MyBatisHandler;


public class NewNovelDAO {
	
	public int insertNewNovel(NewNovelVO nnVO){
		
		//1. MyBatis Handler얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		if(nnVO.getPhoto()==null) {
			nnVO.setPhoto("photo_default.png");
		}
		int cnt=ss.insert("newnovelMapper.insertNewNovel",nnVO);
		//3. transaction 완료
		if(cnt == 1) {
			ss.commit();
		}//end if
		//4. 연결끊기
		if(ss!=null) {ss.close();}//end if
				
		return cnt;
	}

}
