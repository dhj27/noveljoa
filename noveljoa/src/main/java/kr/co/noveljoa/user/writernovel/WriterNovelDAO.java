package kr.co.noveljoa.user.writernovel;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.user.dao.MyBatisHandler;


public class WriterNovelDAO {
	
	public WriterNovelDomain selectWriterNovel(int num_novel){
		WriterNovelDomain wnd=null;
		
		//1. MyBatis Handler얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		wnd=ss.selectOne("writerNovelMapper.selectWriterNovel",num_novel);
		//3. transaction 완료
//		if(list!=null) {
//			ss.commit();
//		}//end if
		//4. 연결끊기
		if(ss!=null) {ss.close();}//end if
				
		return wnd;
	}
	public int countEp(int num_novel){
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		int cnt=ss.selectOne("writerNovelMapper.selectCountEp",num_novel);
		if(ss!=null) {ss.close();}//end if
		
		return cnt;
	}
	public List<EpDomain> selectAllEp(int num_novel){
		List<EpDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		list=ss.selectList("writerNovelMapper.selectAllEp",num_novel);
		if(ss!=null) {ss.close();}//end if
		
		return list;
	}

}
