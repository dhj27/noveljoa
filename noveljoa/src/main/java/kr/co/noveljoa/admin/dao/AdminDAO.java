package kr.co.noveljoa.admin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.noveljoa.admin.domain.MNovelDomain;
import kr.co.noveljoa.admin.domain.MNovelLookDomain;
@Component
public class AdminDAO {
	
	public List<MNovelDomain> novelManage(String id) throws PersistenceException{
		List<MNovelDomain> novelList=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		if (id != null) {
			novelList=ss.selectList("kr.co.noveljoa.admin.Mapper.searchNovel", id);
		} else {
			novelList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectAllNovel");
		}//end else	
		//3. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return novelList;
	}//novelManage

	public MNovelLookDomain reportManage(int novelNum) throws PersistenceException{
		MNovelLookDomain report=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		report=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectReport", novelNum);
		//3. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return report;
	}//reportManage
	
	public int deleteReportNovel(int novelNum) throws PersistenceException{
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		cnt=ss.update("kr.co.noveljoa.admin.Mapper.deleteNovel", novelNum);
		//3. transaction 처리
		if(cnt == 1) {ss.commit();}//end if
		//4. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return cnt;
	}//deleteReportNovel
	
	public int updatePublicNovel(int novelNum) throws PersistenceException{
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		cnt=ss.update("kr.co.noveljoa.admin.Mapper.updatePublic", novelNum);
		//3. transaction 처리
		if(cnt == 1) {ss.commit();}//end if
		//4. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return cnt;
	}//updatePublicNovel
	
	public int updatePrivateNovel(int novelNum) throws PersistenceException{
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		cnt=ss.update("kr.co.noveljoa.admin.Mapper.updatePrivate", novelNum);
		//3. transaction 처리
		if(cnt == 1) {ss.commit();}//end if
		//4. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return cnt;
	}//updatePrivateNovel
	
	
}//class
