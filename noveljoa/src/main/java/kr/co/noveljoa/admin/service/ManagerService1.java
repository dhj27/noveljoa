package kr.co.noveljoa.admin.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.noveljoa.admin.dao.ManagerDAO1;
import kr.co.noveljoa.admin.domain.MemberManageDomain;

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
	}
	
	

}
