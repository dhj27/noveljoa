package kr.co.noveljoa.user.ranking;

import java.util.List;

public class RankingService {
	
	private RankingDAO rDAO;
	
	public RankingService(RankingDAO rDAO) {
		this.rDAO=rDAO;
	}
	public List<RankingDomain> search(RankingVO rVO) {
		List<RankingDomain> list=rDAO.selectRanking(rVO);
		
		return list;
	}

}
