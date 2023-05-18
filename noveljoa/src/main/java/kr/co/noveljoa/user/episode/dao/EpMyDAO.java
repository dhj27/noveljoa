package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import kr.co.noveljoa.user.episode.domain.EpListMyDomain;
import kr.co.noveljoa.user.episode.domain.EpMyDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

public class EpMyDAO {
	
	// ㅇㄹ
	public void insertEpisode(EpCreateVO epCreateVO) {
		
	}// addEp
	
	
	// �뿉�뵾�냼�뱶 �닔�젙
	public EpMyDomain selectEpisode(EpCheckMyVO epCheckMyVO) {
		return null;
	}// searchEp
	
	
	// �뿉�뵾�냼�뱶 �닔�젙 �봽濡쒖꽭�뒪 ajax
	public int updateEpisode(EpUpdateVO epUpdateVO) {
		
		return 0;
	}// editEp
	
	
	// �뿉�뵾�냼�뱶 �궘�젣
	public int deleteEpisode(EpCheckMyVO epCheckMyVO) {
		
		return 0;
	}// removeEp
	
	
	// �뿉�뵾�냼�뱶 由ъ뒪�듃 �궡�슜 蹂댁뿬二쇨린 ajax
	public List<EpListMyDomain> selectEpisodeList(NovelCheckMyVO nCheckMyVO) {
		return null;
	}// searchEpList

}//class
