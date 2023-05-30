package kr.co.noveljoa.admin.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.javassist.expr.NewArray;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.co.noveljoa.admin.domain.MBoardDetailDomain;
import kr.co.noveljoa.admin.domain.MBoardDomain;
import kr.co.noveljoa.admin.domain.MCommentDomain;
import kr.co.noveljoa.admin.vo.MBoardCmtVO;

@Component
public class MBoardDAO {

	public List<MBoardDomain> selectBoardList(String id) {
	    List<MBoardDomain> boardList = null;
	    
	    //1. MyBatis Handler 얻기
	    SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
	    //2. 쿼리 수행 후 결과 얻기
	    if (id != null) {
	        boardList = ss.selectList("kr.co.noveljoa.admin.Mapper.searchBoard", id);
	    } else {
	        boardList = ss.selectList("kr.co.noveljoa.admin.Mapper.selectAllBoard");
	    }//end else
	    //3. MyBatis Handler 닫기
	    if (ss != null) {ss.close();}//end if
	    
	    return boardList;
	}//selectBoardList
	
	public MBoardDetailDomain selectBoardDetail(int boardNum) throws PersistenceException{
		MBoardDetailDomain qna=null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		qna=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectQNA", boardNum);
		//3. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return qna;
	}//selectBoardDetail
	
	public int deleteBoard(int boardNum) throws PersistenceException{
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		cnt=ss.update("kr.co.noveljoa.admin.Mapper.deleteBoard", boardNum);
		//3. transaction 처리
		if(cnt == 1) {ss.commit();}//end if
		//4. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return cnt;
	}//deleteBoard
	
	public List<MCommentDomain> selectMent(int boardNum) throws PersistenceException {
	    List<MCommentDomain> cmtList = null;
	    SqlSession ss = null;
	    try {
	        ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
	        cmtList = ss.selectList("kr.co.noveljoa.admin.Mapper.selectCmt", boardNum);
	    } catch (Exception e) {
	    } finally {
	        if (ss != null) {ss.close();}//end if
	    }//end finally
	    
	    return cmtList;
	}//selectMent
	
	public int insertMent(MBoardCmtVO mbcVO) throws PersistenceException{
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		cnt = ss.insert("kr.co.noveljoa.admin.Mapper.insertCmt", mbcVO);
		//3. transaction 처리
		if(cnt == 1) {ss.commit();}//end if
		//4. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return cnt;
	}//insertMent
	
	public int updateMent(MBoardCmtVO mbcVO) throws PersistenceException{
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		cnt = ss.update("kr.co.noveljoa.admin.Mapper.modifyCmt", mbcVO);
		//3. transaction 처리
		if(cnt == 1) {ss.commit();}//end if
		//4. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return cnt;
	}//updateMent
	
	public int deleteMent(MBoardCmtVO mbcVO) throws PersistenceException{
		int cnt=0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss=ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. Handler 사용
		cnt = ss.delete("kr.co.noveljoa.admin.Mapper.deleteCmt", mbcVO);
		//3. transaction 처리
		if(cnt == 1) {ss.commit();}//end if
		//4. MyBatis Handler 닫기 
		if(ss != null) {ss.close();}//end if
		
		return cnt;
	}//deleteMent

	
}
