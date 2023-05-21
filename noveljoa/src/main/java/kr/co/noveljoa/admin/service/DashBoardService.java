package kr.co.noveljoa.admin.service;

import java.sql.SQLException;

import kr.co.noveljoa.admin.dao.DashBoardDAO;
import kr.co.noveljoa.admin.domain.AllMDomain;
import kr.co.noveljoa.admin.domain.AllNDomain;
import kr.co.noveljoa.admin.domain.DashBoardDomain;
import kr.co.noveljoa.admin.domain.TodayJoinDomain;
import kr.co.noveljoa.admin.domain.TodayVisitDomain;

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
	}//printDash
	
	public AllMDomain graphAllMember() {
		AllMDomain amDomain = null;
		DashBoardDAO dbDAO = new DashBoardDAO();
		try {
			amDomain = dbDAO.selectAllMemCnt();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return amDomain;
	}//graphAllMember
	
	public AllNDomain graphAllNovel() {
		AllNDomain anDomain = null;
		DashBoardDAO dbDAO = new DashBoardDAO();
		try {
			anDomain = dbDAO.selectAllNovCnt();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return anDomain;
	}//graphAllNovel
	
	public TodayJoinDomain graphJoin() {
		TodayJoinDomain tjDomain = null;
		DashBoardDAO dbDAO = new DashBoardDAO();
		try {
			tjDomain = dbDAO.selectTodayJoinCnt();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tjDomain;
	}
	
	public TodayVisitDomain graphVisit() {
		TodayVisitDomain tvDomain = null;
		DashBoardDAO dbDAO = new DashBoardDAO();
		try {
			dbDAO.selectTodayVisitCnt();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tvDomain;
	}

}
