package kr.co.noveljoa.admin.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.noveljoa.admin.dao.ManagerDAO1;
import kr.co.noveljoa.admin.domain.CommentDomain;
import kr.co.noveljoa.admin.domain.FreeBoardDomain;
import kr.co.noveljoa.admin.domain.MemberManageDomain;
import kr.co.noveljoa.admin.domain.MemberManageInfoDomain;
import kr.co.noveljoa.admin.vo.FreeBoardVO;
import kr.co.noveljoa.admin.vo.UpdateMemVO;

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

public List<FreeBoardDomain> printFreeBoard(int board_num) {
	List<FreeBoardDomain> fbList = null;
	ManagerDAO1 mDAO = new ManagerDAO1();
	try {
		fbList = mDAO.selectFreeBoard(board_num);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return fbList;
}//memberManage

public boolean addFreeBoard(FreeBoardVO fbVO) {
	ManagerDAO1 mDAO = new ManagerDAO1();
	int cnt = mDAO.insertFreeBoard(fbVO);
	
	return cnt==1;
}//removeComment

}
