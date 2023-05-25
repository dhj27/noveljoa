package kr.co.noveljoa.admin.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.co.noveljoa.admin.dao.ManagerDAO1;
import kr.co.noveljoa.admin.domain.BoardCommentDomain;
import kr.co.noveljoa.admin.domain.CommentDomain;
import kr.co.noveljoa.admin.domain.FreeBoardDomain;
import kr.co.noveljoa.admin.domain.MemberManageDomain;
import kr.co.noveljoa.admin.domain.MemberManageInfoDomain;
import kr.co.noveljoa.admin.vo.BoardCommentVO;
import kr.co.noveljoa.admin.vo.FreeBoardVO;
import kr.co.noveljoa.admin.vo.InsertCommentVO;
import kr.co.noveljoa.admin.vo.UpdateMemVO;
import kr.co.noveljoa.admin.vo.updateBoardCommentVO;

public class ManagerService1 {
	
	public List<MemberManageDomain> memberManage(String id) {
		List<MemberManageDomain> mmList = null;
		ManagerDAO1 mDAO = new ManagerDAO1();
		try {
			mmList = mDAO.selectMemberManage(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return mmList;
	}//memberManage
	
	public MemberManageInfoDomain memberInfoAll(String id) {
		MemberManageInfoDomain mmiDomain =  null;
		ManagerDAO1 mDAO = new ManagerDAO1();
		
		mmiDomain = mDAO.selectmemberInfoAll(id);
		
		return mmiDomain;
	}//memberInfoAll
	
	public boolean stopId(String id) {
		ManagerDAO1 mDAO = new ManagerDAO1();
		int cnt = mDAO.updateStop(id);
		
		return cnt==1;
	}//stopId
	
public boolean unStopId(String id) {
	ManagerDAO1 mDAO = new ManagerDAO1();
	int cnt = mDAO.updateUnStop(id);
	
	return cnt==1;
	}//stopId

public boolean modifyMemInfo(UpdateMemVO uVO) {
	ManagerDAO1 mDAO = new ManagerDAO1();
	int cnt = mDAO.updateMemInfo(uVO);
	
	return cnt==1;
}//modifyMemInfo
	

public List<CommentDomain> commentManage(String id) {
	List<CommentDomain> cdList = null;
	ManagerDAO1 mDAO = new ManagerDAO1();
	try {
		cdList = mDAO.selectCommentManage(id);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return cdList;
}//memberManage

public boolean removeComment(int comment_num) {
	ManagerDAO1 mDAO = new ManagerDAO1();
	int cnt = mDAO.deleteComment(comment_num);
	
	return cnt==1;
}//removeComment

public List<FreeBoardDomain> printFreeBoard(Map<String, Object> paramMap) {
	List<FreeBoardDomain> fbList = null;
	ManagerDAO1 mDAO = new ManagerDAO1();
	try {
		fbList = mDAO.selectFreeBoard(paramMap);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return fbList;
}//memberManage

public boolean addFreeBoard(FreeBoardVO fbVO) {
	ManagerDAO1 mDAO = new ManagerDAO1();
	int cnt = mDAO.insertFreeBoard(fbVO);
	
	return cnt==1;
}//addFreeBoard

public List<BoardCommentDomain> printFreeBoardComment(int board_num) {
	List<BoardCommentDomain> bclist = null;
	ManagerDAO1 mDAO = new ManagerDAO1();
	try {
		bclist = mDAO.selectBoardComment(board_num);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return bclist;
}//BoardCommentDomain


public boolean addBoardComment(BoardCommentVO bcVO) {
	ManagerDAO1 mDAO = new ManagerDAO1();
	int cnt = mDAO.insertBoardComment(bcVO);
	
	return cnt==1;
}//addBoardComment


public boolean removeBoard(int board_num) {
	ManagerDAO1 mDAO = new ManagerDAO1();
	int cnt = mDAO.deleteBoard(board_num);
	
	return cnt==1;
}//removeBoard


public boolean modifyBoardComment(updateBoardCommentVO ubcVO) {
	ManagerDAO1 mDAO = new ManagerDAO1();
	int cnt = mDAO.updateBoardComment(ubcVO);
	
	return cnt==1;
}//modifyBoardComment

public boolean removeBoardComment(int board_cmt_num) {
	ManagerDAO1 mDAO = new ManagerDAO1();
	int cnt = mDAO.deleteBoardComment(board_cmt_num);
	
	return cnt==1;
}//modifyBoardComment

}
