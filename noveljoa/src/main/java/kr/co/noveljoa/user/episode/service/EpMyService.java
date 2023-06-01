package kr.co.noveljoa.user.episode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.episode.dao.EpMyDAO;
import kr.co.noveljoa.user.episode.domain.EpMyDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

@Component
public class EpMyService {
	
	@Autowired(required = false)
	private EpMyDAO epMyDAO;
	
	// 에피소드 생성
	public int writeEp(EpCreateVO epCreateVO) {
		if( epCreateVO.getCmt() == null || "".equals( epCreateVO.getCmt())) {
			epCreateVO.setCmt("null");
		}
		
		int cnt = epMyDAO.insertEpisode(epCreateVO);
		
		return cnt;
	}// addEp
	
	
	// 에피소드 수정 프로세스 ajax
	public int editEp(EpUpdateVO epUpdateVO) {
		int cnt = epMyDAO.updateEpisode(epUpdateVO);
		System.out.println(epUpdateVO);
		
		return cnt;
	}// editEp
	
	
	// 에피소드 삭제
	public int removeEp(EpCheckMyVO epCheckMyVO) {
		int cnt = epMyDAO.deleteEpisode(epCheckMyVO);
		
		return cnt;
	}// removeEp

	
	// 에피소드 수정창
	public EpMyDomain searchEp(EpCheckMyVO epCheckMyVO) {
		EpMyDomain emd = epMyDAO.selectEpisode(epCheckMyVO);
		
		return emd;
	}// searchEp
	
	
	// 에피소드 리스트 내용 보여주기 ajax
	public String searchEpList(NovelCheckMyVO nCheckMyVO) {
		epMyDAO.selectEpisodeList(nCheckMyVO);
		return "";
	}// searchEpList


}//class
