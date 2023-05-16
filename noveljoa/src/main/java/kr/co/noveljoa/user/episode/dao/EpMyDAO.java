package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import kr.co.noveljoa.user.episode.domain.EpListMyDomain;
import kr.co.noveljoa.user.episode.domain.EpMyDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

public class EpMyDAO {
	
	// 에피소드 생성
	public void insertEpisode(EpCreateVO epCreateVO) {
		
	}// addEp
	
	
	// 에피소드 수정
	public EpMyDomain selectEpisode(EpCheckMyVO epCheckMyVO) {
		return null;
	}// searchEp
	
	
	// 에피소드 수정 프로세스 ajax
	public int updateEpisode(EpUpdateVO epUpdateVO) {
		
		return 0;
	}// editEp
	
	
	// 에피소드 삭제
	public int deleteEpisode(EpCheckMyVO epCheckMyVO) {
		
		return 0;
	}// removeEp
	
	
	// 에피소드 리스트 내용 보여주기 ajax
	public List<EpListMyDomain> selectEpisodeList(NovelCheckMyVO nCheckMyVO) {
		return null;
	}// searchEpList

}//class
