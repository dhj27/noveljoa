package kr.co.noveljoa.admin.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.admin.dao.AdminDAO;
import kr.co.noveljoa.admin.domain.MNovelDomain;
import kr.co.noveljoa.admin.domain.MNovelLookDomain;
@Component
public class AdminService {

	@Autowired(required = false)
	private AdminDAO aDAO;
	
	public List<MNovelDomain> novelManage() {
		List<MNovelDomain> novelList=null;
		AdminDAO aDAO=new AdminDAO();
		novelList=aDAO.novelManage(null);
		
		return novelList;
	}//novelManage
	
	public List<MNovelDomain> searchNovel(String id) {
		List<MNovelDomain> novelList=null;
		AdminDAO aDAO=new AdminDAO();
		novelList=aDAO.novelManage(id);
		
		return novelList;
	}//novelManage
	
	public MNovelLookDomain reportManage(int novelNum) {
		AdminDAO aDAO=new AdminDAO();
		MNovelLookDomain report=aDAO.reportManage(novelNum);
		
		return report;
	}//reportManage
	
	public boolean removeReportNovel(int novelNum) {
		int cnt=aDAO.deleteReportNovel(novelNum);
		
		return cnt == 1;
	}//removeReportNovel
	
	public boolean publicNovel(int novelNum) {
		int cnt=aDAO.updatePublicNovel(novelNum);
		
		return cnt == 1;
	}//publicNovel
	
	public boolean privateNovel(int novelNum) {
		int cnt=aDAO.updatePrivateNovel(novelNum);
		
		return cnt == 1;
	}//privateNovel
	
	
}
