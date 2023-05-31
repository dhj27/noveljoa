package kr.co.noveljoa.user.noveledit;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.user.dao.MyBatisHandler;


public class EditNovelDAO {
	
	public int updateEditNovel(EditNovelVO enVO){
		
		//1. MyBatis Handler얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		if(enVO.getPhoto()==null) {
			enVO.setPhoto("photo_default.png");
		}
		int cnt=ss.update("editnovelMapper.updateEditNovel",enVO);
		//3. transaction 완료
		if(cnt == 1) {
			ss.commit();
		}//end if
		//4. 연결끊기
		if(ss!=null) {ss.close();}//end if
				
		return cnt;
	}
	public int deleteNovel(int num_novel){
		
		//1. MyBatis Handler얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		int cnt=ss.delete("editnovelMapper.deleteNovel",num_novel);
		//3. transaction 완료
		if(cnt == 1) {
			ss.commit();
		}//end if
		//4. 연결끊기
		if(ss!=null) {ss.close();}//end if
		
		return cnt;
	}

}
