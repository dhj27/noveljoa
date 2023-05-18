package kr.co.noveljoa.admin.service;

import java.sql.SQLException;

import kr.co.noveljoa.admin.dao.DashBoardDAO;
import kr.co.noveljoa.admin.domain.DashBoardDomain;

public class DashBoardService {
	
	public DashBoardDomain printDash() {
		DashBoardDomain dbDomain = null;
		DashBoardDAO dbDAO = new DashBoardDAO();
		try {
			dbDomain = dbDAO.selectDash();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dbDomain;
	}

}
