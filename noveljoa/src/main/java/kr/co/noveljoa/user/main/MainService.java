package kr.co.noveljoa.user.main;

import java.util.List;

public class MainService {
	
	private MainDAO mDAO;
	
	public MainService(MainDAO mDAO) {
		this.mDAO=mDAO;
	}
	public List<MainDomain> search(MainVO mVO) {
		List<MainDomain> list=mDAO.selectMain(mVO);
		
		return list;
	}

}
