package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import kr.co.noveljoa.user.episode.domain.EpListMyDomain;
import kr.co.noveljoa.user.episode.domain.EpMyDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

public class EpMyDAO {
	
	// ���Ǽҵ� ����
	public void insertEpisode(EpCreateVO epCreateVO) {
		
	}// addEp
	
	
	// ���Ǽҵ� ����
	public EpMyDomain selectEpisode(EpCheckMyVO epCheckMyVO) {
		return null;
	}// searchEp
	
	
	// ���Ǽҵ� ���� ���μ��� ajax
	public int updateEpisode(EpUpdateVO epUpdateVO) {
		
		return 0;
	}// editEp
	
	
	// ���Ǽҵ� ����
	public int deleteEpisode(EpCheckMyVO epCheckMyVO) {
		
		return 0;
	}// removeEp
	
	
	// ���Ǽҵ� ����Ʈ ���� �����ֱ� ajax
	public List<EpListMyDomain> selectEpisodeList(NovelCheckMyVO nCheckMyVO) {
		return null;
	}// searchEpList

}//class
