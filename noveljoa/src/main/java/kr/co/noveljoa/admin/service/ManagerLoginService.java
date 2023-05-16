package kr.co.noveljoa.admin.service;

import java.sql.SQLException;

import kr.co.noveljoa.admin.dao.ManagerLoginDAO;
import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.vo.MLoginVO;

public class ManagerLoginService {
	
	public MLoginDomain ManagerLogin(MLoginVO mVO) {
		
		MLoginDomain mlDomain = null;
		
		ManagerLoginDAO mDAO = new ManagerLoginDAO();
		try {
			mlDomain = mDAO.selectLogin(mVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return mlDomain;
	}
	

}//class
