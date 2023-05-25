package kr.co.noveljoa.admin.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.admin.domain.BoardCommentDomain;
import kr.co.noveljoa.admin.domain.CommentDomain;
import kr.co.noveljoa.admin.domain.FreeBoardDomain;
import kr.co.noveljoa.admin.domain.MemberManageDomain;
import kr.co.noveljoa.admin.domain.MemberManageInfoDomain;
import kr.co.noveljoa.admin.vo.BoardCommentVO;
import kr.co.noveljoa.admin.vo.FreeBoardVO;
import kr.co.noveljoa.admin.vo.InsertCommentVO;
import kr.co.noveljoa.admin.vo.InsertMVO;
import kr.co.noveljoa.admin.vo.UpdateMemVO;
import kr.co.noveljoa.admin.vo.updateBoardCommentVO;

public class ManagerDAO1 {
	
	public List<MemberManageDomain> selectMemberManage(String id) throws SQLException {
		List<MemberManageDomain> mmList = null;  
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 쿼리 수행 후 결과 얻기
		if(id!=null && id!="" ) {
			mmList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectOneMember",id);
		}else {
			mmList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectAllMember");
		}
		
		ss.commit();
		//3. MyBatis Handler 닫기
				if(ss != null) {
					ss.close();
				}//end if

		
		return mmList;
	}//selectLogin
	
	
	
	public MemberManageInfoDomain selectmemberInfoAll(String id) {
		MemberManageInfoDomain mmiDomain = null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		mmiDomain = ss.selectOne("kr.co.noveljoa.admin.Mapper.selectMemInfo",id);
		
		ss.commit();
		//3. MyBatis Handler 닫기
		if(ss!=null) {
			ss.close();
		}
		
		
	    return mmiDomain;
	}
	
	//정지
	public int updateStop(String id) {
		int cnt = 0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		cnt = ss.update("kr.co.noveljoa.admin.Mapper.updateStop",id);
		if( cnt==1 ) {
		ss.commit();
		}//end if
		//3. MyBatis Handler 닫기
		if(ss!=null) {
			ss.close();
		}
		
		
		return cnt;
	}
	
	//정지해제
	public int updateUnStop(String id) {
		int cnt = 0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		cnt = ss.update("kr.co.noveljoa.admin.Mapper.updateUnStop",id);
		if( cnt==1 ) {
		ss.commit();
		}//end if
		//3. MyBatis Handler 닫기
		if(ss!=null) {
			ss.close();
		}
		
		return cnt;
	}
	
	public int updateMemInfo(UpdateMemVO uVO) {
		int cnt = 0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		cnt = ss.update("kr.co.noveljoa.admin.Mapper.updateMemInfo",uVO);
		if( cnt==1 ) {
		ss.commit();
		}//end if
		//3. MyBatis Handler 닫기
		if(ss!=null) {
			ss.close();
		}
		
		return cnt;
	}
	
	
	public List<CommentDomain> selectCommentManage(String id) throws SQLException {
		List<CommentDomain> cdList = null;  
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//동적 쿼리 사용
		cdList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectMComment", id);
		
		ss.commit();
		//3. MyBatis Handler 닫기
				if(ss != null) {
					ss.close();
				}//end if

		
		return cdList;
	}//selectCommentManage
	
	public int deleteComment( int comment_num ) {
		int cnt = 0;
		
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		cnt = ss.update("kr.co.noveljoa.admin.Mapper.deleteComment",comment_num);
		if( cnt==1 ) {
		ss.commit();
		}//end if
		//3. MyBatis Handler 닫기
		if(ss!=null) {
			ss.close();
		}
		
		return cnt;
	}
	
	public List<FreeBoardDomain> selectFreeBoard(Map<String, Object> paramMap) throws SQLException {
		List<FreeBoardDomain> fbList = null;  
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 쿼리 수행 후 결과 얻기
		fbList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectBoard", paramMap);
		
		ss.commit();
		//3. MyBatis Handler 닫기
				if(ss != null) {
					ss.close();
				}//end if

		
		return fbList;
	}//selectFreeBoard
	
	public int insertFreeBoard( FreeBoardVO fbVO ) {
		//1. MyBatis Handler 얻기

		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		int cnt = ss.insert("kr.co.noveljoa.admin.Mapper.insertBoard", fbVO);
		//3. MyBatis Handler 닫기
		if( cnt==1 ) {
			ss.commit();
		}//end if
		if(ss != null) {
			ss.close();
		}//end if
		return cnt;
	}//insertFreeBoard
	
	public List<BoardCommentDomain> selectBoardComment(int board_num) throws SQLException {
		List<BoardCommentDomain> bcList = null;  
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 쿼리 수행 후 결과 얻기
		bcList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectBoardComment", board_num);
		
		ss.commit();
		//3. MyBatis Handler 닫기
				if(ss != null) {
					ss.close();
				}//end if

		
		return bcList;
	}//selectBoardComment
	
	
	public int insertBoardComment( BoardCommentVO bcVO ) {
		//1. MyBatis Handler 얻기

		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		int cnt = ss.insert("kr.co.noveljoa.admin.Mapper.insertBoardComment", bcVO);
		//3. MyBatis Handler 닫기
		if( cnt==1 ) {
			ss.commit();
		}//end if
		if(ss != null) {
			ss.close();
		}//end if
		return cnt;
	}//insertFreeBoard
	
	
	public int deleteBoard(int board_num) {
		
		//1. MyBatis Handler 얻기
				SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. 쿼리 수행 후 결과 얻기
				int cnt = ss.update("kr.co.noveljoa.admin.Mapper.deleteBoard",board_num);
				if( cnt==1 ) {
				ss.commit();
				}//end if
				//3. MyBatis Handler 닫기
				if(ss!=null) {
					ss.close();
				}
				
				return cnt;
	}//updateComment
	
	
	public int updateBoardComment(updateBoardCommentVO ubcVO) {
		
		//1. MyBatis Handler 얻기
				SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. 쿼리 수행 후 결과 얻기
				int cnt = ss.update("kr.co.noveljoa.admin.Mapper.updateBoardComment",ubcVO);
				if( cnt==1 ) {
				ss.commit();
				}//end if
				//3. MyBatis Handler 닫기
				if(ss!=null) {
					ss.close();
				}
				
				return cnt;
	}//updateComment
	
	
	public int deleteBoardComment(int board_cmt_num) {
		
		//1. MyBatis Handler 얻기
				SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. 쿼리 수행 후 결과 얻기
				int cnt = ss.update("kr.co.noveljoa.admin.Mapper.deleteBoardComment",board_cmt_num);
				if( cnt==1 ) {
				ss.commit();
				}//end if
				//3. MyBatis Handler 닫기
				if(ss!=null) {
					ss.close();
				}
				
				return cnt;
	}//updateComment
	
	
//	//테스트
//	 public static void main(String[] args) throws SQLException {
//		  
//			  ManagerDAO1 mDAO = new ManagerDAO1(); 
//			  int cnt = mDAO.deleteBoardComment(27);
//			  
//			  System.out.println(cnt);
//		  
//		  }//main
	

}
