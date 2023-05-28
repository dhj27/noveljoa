package kr.co.noveljoa.user.board.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.board.dao.boardDAO;
import kr.co.noveljoa.user.board.domain.BoardCommentDomain;
import kr.co.noveljoa.user.board.domain.FreeBoardDomain;
import kr.co.noveljoa.user.board.vo.BoardCommentVO;
import kr.co.noveljoa.user.board.vo.FreeBoardVO;
import kr.co.noveljoa.user.board.vo.updateBoardCommentVO;


@Component
public class BoardService {
	
	@Autowired(required = false)
	private boardDAO mDAO;
	

public List<FreeBoardDomain> printFreeBoard(Map<String, Object> paramMap) {
	List<FreeBoardDomain> fbList = null;
	try {
		fbList = mDAO.selectFreeBoard(paramMap);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return fbList;
}//memberManage

public boolean addFreeBoard(FreeBoardVO fbVO) {
	int cnt = mDAO.insertFreeBoard(fbVO);
	
	return cnt==1;
}//addFreeBoard

public List<BoardCommentDomain> printFreeBoardComment(int board_num) {
	List<BoardCommentDomain> bclist = null;
	try {
		bclist = mDAO.selectBoardComment(board_num);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return bclist;
}//BoardCommentDomain


public boolean addBoardComment(BoardCommentVO bcVO) {
	int cnt = mDAO.insertBoardComment(bcVO);
	
	return cnt==1;
}//addBoardComment


public boolean removeBoard(int board_num) {
	int cnt = mDAO.deleteBoard(board_num);
	
	return cnt==1;
}//removeBoard


public boolean modifyBoardComment(updateBoardCommentVO ubcVO) {
	int cnt = mDAO.updateBoardComment(ubcVO);
	
	return cnt==1;
}//modifyBoardComment

public boolean removeBoardComment(int board_cmt_num) {
	int cnt = mDAO.deleteBoardComment(board_cmt_num);
	
	return cnt==1;
}//removeBoardComment


public void modifyBoardCnt(int board_num) {
	int cnt = mDAO.updateBoardCnt(board_num);
	
}//modifyBoardCnt

}
