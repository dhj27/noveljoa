package kr.co.noveljoa.user.episode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.episode.dao.EpDAO;
import kr.co.noveljoa.user.episode.domain.EpLookDomain;
import kr.co.noveljoa.user.episode.domain.NovelDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

@Component
public class EpService {
	
	@Autowired(required = false)
	private EpDAO eDAO;
	
	// 소설 내용 보여주기
	public NovelDomain searchNovel(int novelNum) {
		NovelDomain nd = eDAO.selectNovel(novelNum);		
		System.out.println(eDAO.selectNovel(novelNum));
		
		return nd;
	}// searchNovel
	
	// 소설 좋아요 선택
	public int searchNovelLike(int userNum) {
		
		return 0;
	}//searchNovelLike
	
	// 소설 신고 선택
	public int searchNovelReport(int userNum) {
		
		return 0;
	}//searchNovelLike
	
	// 에피소드 리스트
	public String searchEpList(EpListVO epListVO) {
		return "";
	}// searchEpList
	
	
	// 에피소드 내용 
	public EpLookDomain searchEp(EpCheckVO epCheckVO) {
		EpLookDomain eld = eDAO.selectEpisode(epCheckVO);
		return eld;
	}// searchEp
	
	
	// 첫 화
	public EpLookDomain firstEp(int novelNum) {
		EpLookDomain eld = eDAO.selectFirstEpisode(novelNum);
		return eld;
	}// firstEp
	
	
	// 이전화
	public String prevEp(EpCheckVO epCheckVO) {
		return "";
	}// prevNextEp
	
	// 다음화
	public String nextEp(EpCheckVO epCheckVO) {
		return "";
	}// prevNextEp
	
	
	// 조회수 증가
	public String viewsEp(int epNum) {
//		int views = eDAO.updateViewsEpisode(epNum);
		
		return "";
	}// viewsEp
	
	
	// 좋아요 추가
	public String addLike(NovelCheckVO nCheckVO) {
		return "";
	}// addLike
	
	
	// 좋아요 취소
	public String cancelLike(NovelCheckVO nCheckVO) {
		return "";
	}// cancelLike
	
	
	// 신고 추가
	public String addReport(NovelReportVO nReportVO ) {
		return "";
	}// addReport
	
	
	// 북마크 추가
	public String addBookmark(EpCheckVO epCheckVO) {
		return "";
	}// addBookmark
	
	
	// 북마크 취소
	public String cancelBookmark(EpCheckVO epCheckVO) {
		return "";
	}// cancelBookmark

}
