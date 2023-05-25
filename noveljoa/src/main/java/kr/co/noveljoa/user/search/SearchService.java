package kr.co.noveljoa.user.search;

import java.util.List;

public class SearchService {
	
	private SearchDAO sDAO;
	
	public SearchService(SearchDAO sDAO) {
		this.sDAO=sDAO;
	}
	public List<SearchDomain> search(SearchVO sVO) {
		List<SearchDomain> list=sDAO.selectSearch(sVO);
		
		return list;
	}

}
