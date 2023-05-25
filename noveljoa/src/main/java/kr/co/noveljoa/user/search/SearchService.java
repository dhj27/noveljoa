package kr.co.noveljoa.user.search;

import java.util.List;

public class SearchService {
	
	private SearchDAO rDAO;
	
	public SearchService(SearchDAO rDAO) {
		this.rDAO=rDAO;
	}
	public List<SearchDomain> search(SearchVO rVO) {
		List<SearchDomain> list=rDAO.selectRanking(rVO);
		
		return list;
	}

}
