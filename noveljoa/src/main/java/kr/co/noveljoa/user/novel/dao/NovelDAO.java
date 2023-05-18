package kr.co.noveljoa.user.novel.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.user.novel.domain.NovelDomain;
import kr.co.noveljoa.user.novel.vo.NovelVO;


public class NovelDAO {
	
	public int insertNovel(NovelVO nVO){
		
		//1. MyBatis Handler얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		int cnt=ss.insert("kr.co.noveljoa.user.novel.dao.noveljoa.novelMapper.insertNovel",nVO);
		//3. transaction 완료
		if(cnt==1) {
			ss.commit();
		}//end if
		//4. 연결끊기
		if(ss!=null) {ss.close();}//end if
		
		return cnt;
	}
	
	public List<NovelDomain> selectNovel(){
		List<NovelDomain> list=new ArrayList<NovelDomain>();
		
		//1. MyBatis Handler얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		list=ss.selectList("kr.co.noveljoa.user.novel.dao.noveljoa.novelMapper.selectNovel");
		//3. transaction 완료
		if(list!=null) {
			ss.commit();
		}//end if
		//4. 연결끊기
		if(ss!=null) {ss.close();}//end if
				
		return list;
	}

}
