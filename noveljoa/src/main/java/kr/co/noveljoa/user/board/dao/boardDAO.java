package kr.co.noveljoa.user.board.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.board.domain.BoardCommentDomain;
import kr.co.noveljoa.user.board.domain.FreeBoardDomain;
import kr.co.noveljoa.user.board.vo.BoardCommentVO;
import kr.co.noveljoa.user.board.vo.FreeBoardVO;
import kr.co.noveljoa.user.board.vo.updateBoardCommentVO;


@Component
public class boardDAO {
	

	
	public List<FreeBoardDomain> selectFreeBoard(Map<String, Object> paramMap) throws SQLException {
		List<FreeBoardDomain> fbList = null;  
		//1. MyBatis Handler 얻기
		SqlSession ss = BoardMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 쿼리 수행 후 결과 얻기
		fbList=ss.selectList("kr.co.noveljoa.user.board.Mapper.selectBoard", paramMap);
		
		ss.commit();
		//3. MyBatis Handler 닫기
				if(ss != null) {
					ss.close();
				}//end if

		
		return fbList;
	}//selectFreeBoard
	
	public int insertFreeBoard( FreeBoardVO fbVO ) {
		//1. MyBatis Handler 얻기

		SqlSession ss = BoardMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		int cnt = ss.insert("kr.co.noveljoa.user.board.Mapper.insertBoard", fbVO);
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
		SqlSession ss = BoardMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 쿼리 수행 후 결과 얻기
		bcList=ss.selectList("kr.co.noveljoa.user.board.Mapper.selectBoardComment", board_num);
		
		ss.commit();
		//3. MyBatis Handler 닫기
				if(ss != null) {
					ss.close();
				}//end if

		
		return bcList;
	}//selectBoardComment
	
	
	public int insertBoardComment( BoardCommentVO bcVO ) {
		//1. MyBatis Handler 얻기

		SqlSession ss = BoardMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		int cnt = ss.insert("kr.co.noveljoa.user.board.Mapper.insertBoardComment", bcVO);
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
				SqlSession ss = BoardMyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. 쿼리 수행 후 결과 얻기
				int cnt = ss.update("kr.co.noveljoa.user.board.Mapper.deleteBoard",board_num);
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
				SqlSession ss = BoardMyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. 쿼리 수행 후 결과 얻기
				int cnt = ss.update("kr.co.noveljoa.user.board.Mapper.updateBoardComment",ubcVO);
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
				SqlSession ss = BoardMyBatisHandler.getInstance().getMyBatisHandler(false);
				//2. 쿼리 수행 후 결과 얻기
				int cnt = ss.update("kr.co.noveljoa.user.board.Mapper.deleteBoardComment",board_cmt_num);
				if( cnt==1 ) {
				ss.commit();
				}//end if
				//3. MyBatis Handler 닫기
				if(ss!=null) {
					ss.close();
				}
				
				return cnt;
	}//updateComment
	
	public int updateBoardCnt(int board_num) {
		//1. MyBatis Handler 얻기
		SqlSession ss = BoardMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		int cnt = ss.update("kr.co.noveljoa.user.board.Mapper.updateBoardCnt",board_num);
		if( cnt==1 ) {
		ss.commit();
		}//end if
		//3. MyBatis Handler 닫기
		if(ss!=null) {
			ss.close();
		}
		
		return cnt;
		
	}
	
	
	
//	//테스트
//	 public static void main(String[] args) throws SQLException {
//		  
//			  boardDAO d=new boardDAO();
//			  Map<String, Object> paramMap = new HashMap<String, Object>();
//				
//				 paramMap.put("id","dddd");
//				   paramMap.put("board_num", 1);
//			  d.selectFreeBoard(paramMap);
//		  
//		  }//main
	

}
