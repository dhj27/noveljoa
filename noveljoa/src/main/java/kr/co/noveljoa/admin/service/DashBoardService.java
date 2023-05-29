package kr.co.noveljoa.admin.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.admin.dao.DashBoardDAO;
import kr.co.noveljoa.admin.domain.AllMDomain;
import kr.co.noveljoa.admin.domain.AllNDomain;
import kr.co.noveljoa.admin.domain.DashBoardDomain;
import kr.co.noveljoa.admin.domain.TodayJoinDomain;
import kr.co.noveljoa.admin.domain.TodayVisitDomain;

@Component
public class DashBoardService {
	
	@Autowired(required = false)
	private DashBoardDAO dbDAO;
	
	public DashBoardDomain printDash() {
		DashBoardDomain dbDomain = null;
		try {
			dbDomain = dbDAO.selectDash();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dbDomain;
	}//printDash
	
	public AllMDomain graphAllMember() {
		AllMDomain amDomain = null;
		try {
			amDomain = dbDAO.selectAllMemCnt();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return amDomain;
	}//graphAllMember
	
	public AllNDomain graphAllNovel() {
		AllNDomain anDomain = null;
		try {
			anDomain = dbDAO.selectAllNovCnt();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return anDomain;
	}//graphAllNovel
	
	public TodayJoinDomain graphJoin() {
		TodayJoinDomain tjDomain = null;
		try {
			tjDomain = dbDAO.selectTodayJoinCnt();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tjDomain;
	}
	
	public TodayVisitDomain graphVisit() {
		TodayVisitDomain tvDomain = null;
		try {
			tvDomain = dbDAO.selectTodayVisitCnt();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tvDomain;
	}

}
