package kr.co.noveljoa.user.episode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.episode.dao.EpMyDAO;
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
	
	
	// 에피소드 수정
	public String searchEp(EpCheckMyVO epCheckMyVO) {
		
		
		return "";
	}// searchEp
	
	
	// 에피소드 수정 프로세스 ajax
	public int editEp(EpUpdateVO epUpdateVO) {
		
		return 0;
	}// editEp
	
	
	// 에피소드 삭제
	public int removeEp(EpCheckMyVO epCheckMyVO) {
		
		return 0;
	}// removeEp
	
	
	// 에피소드 리스트 내용 보여주기 ajax
	public String searchEpList(NovelCheckMyVO nCheckMyVO) {
		
		return "";
	}// searchEpList


}//class
