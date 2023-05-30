package kr.co.noveljoa.admin.service;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import kr.co.noveljoa.admin.dao.MBoardDAO;
import kr.co.noveljoa.admin.domain.MBoardDetailDomain;
import kr.co.noveljoa.admin.domain.MBoardDomain;
import kr.co.noveljoa.admin.domain.MCommentDomain;
import kr.co.noveljoa.admin.vo.MBoardCmtVO;
@Component
public class MBoardService {

	@Autowired(required = false)
	private MBoardDAO mbDAO;
	
	public List<MBoardDomain> selectAllBoard() {
	    List<MBoardDomain> boardList = null;
	    MBoardDAO mbDAO = new MBoardDAO();
	    boardList = mbDAO.selectBoardList(null);
	    
	    return boardList;
	}//selectAllBoard

	public List<MBoardDomain> searchMessageBoard(String id) {
	    List<MBoardDomain> boardList = null;
	    MBoardDAO mbDAO = new MBoardDAO();
	    boardList = mbDAO.selectBoardList(id);
	    
	    return boardList;
	}//searchMessageBoard
	
	public MBoardDetailDomain selectDetail(int boardNum) {
		MBoardDetailDomain qna=mbDAO.selectBoardDetail(boardNum);
		
		return qna;
	}//selectDetail
	
	public boolean removeBoard(int boardNum) {
		int cnt=mbDAO.deleteBoard(boardNum);
		
		return cnt == 1;
	}//removeBoard
	
	public List<MCommentDomain> selectBoardMent(int boardNum) {
	    List<MCommentDomain> cmtList = null;
	    try {
	        cmtList = mbDAO.selectMent(boardNum);
	    } catch (PersistenceException e) {
	    }
	    return cmtList;
	}//selectBoardMent
	
	public boolean enrollMent(MBoardCmtVO mbcVO) {
		int cnt=mbDAO.insertMent(mbcVO);
		
		return cnt == 1;
	}//enrollMent
	
	public boolean editMent(MBoardCmtVO mbcVO) {
		int cnt=mbDAO.updateMent(mbcVO);
		
		return cnt == 1;
	}//editMent
	
	public boolean removeMent(MBoardCmtVO mbcVO) {
		int cnt=mbDAO.deleteMent(mbcVO);
		
		return cnt == 1;
	}//removeMent
	
	
}
