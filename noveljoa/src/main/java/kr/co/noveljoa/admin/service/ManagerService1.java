package kr.co.noveljoa.admin.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.admin.dao.ManagerDAO1;
import kr.co.noveljoa.admin.domain.CommentDomain;
import kr.co.noveljoa.admin.domain.MemberManageDomain;
import kr.co.noveljoa.admin.domain.MemberManageInfoDomain;
import kr.co.noveljoa.admin.vo.InsertCommentVO;
import kr.co.noveljoa.admin.vo.UpdateMemVO;

@Component
public class ManagerService1 {
	
	@Autowired(required = false)
	private ManagerDAO1 mDAO;
	
	public List<MemberManageDomain> memberManage(String id) {
		List<MemberManageDomain> mmList = null;
		try {
			mmList = mDAO.selectMemberManage(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return mmList;
	}//memberManage
	
	public MemberManageInfoDomain memberInfoAll(String id) {
		MemberManageInfoDomain mmiDomain =  null;
		
		mmiDomain = mDAO.selectmemberInfoAll(id);
		
		return mmiDomain;
	}//memberInfoAll
	
	public boolean stopId(String id) {
		int cnt = mDAO.updateStop(id);
		
		return cnt==1;
	}//stopId
	
public boolean unStopId(String id) {
	int cnt = mDAO.updateUnStop(id);
	
	return cnt==1;
	}//stopId

public boolean modifyMemInfo(UpdateMemVO uVO) {
	int cnt = mDAO.updateMemInfo(uVO);
	
	return cnt==1;
}//modifyMemInfo
	

public List<CommentDomain> commentManage(String id) {
	List<CommentDomain> cdList = null;
	try {
		cdList = mDAO.selectCommentManage(id);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return cdList;
}//memberManage

public boolean removeComment(int comment_num) {
	int cnt = mDAO.deleteComment(comment_num);
	
	return cnt==1;
}//removeComment



}
