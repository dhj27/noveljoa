package kr.co.noveljoa.user.episode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.episode.dao.EpDAO;
import kr.co.noveljoa.user.episode.domain.EpListDomain;
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
	public NovelDomain searchNovel(int num_novel) {
		NovelDomain nd = eDAO.selectNovel(num_novel);		
		System.out.println(eDAO.selectNovel(num_novel));
		
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
	
	// 에피소드 리스트 ajax
	public List<EpListDomain> searchEpList(EpListVO epListVO) {
		List<EpListDomain> list = eDAO.selectEpisodeList(epListVO);
		System.out.println("searchEpList");
		return list;
	}// searchEpList
	
	
	// 에피소드 내용 
	public EpLookDomain searchEp(EpCheckVO epCheckVO) {
		EpLookDomain eld = eDAO.selectEpisode(epCheckVO);
		System.out.println("searchEp: " + eld);
		return eld;
	}// searchEp
	
	
	// 첫 화
	public EpLookDomain firstEp(int novelNum) {
		EpLookDomain eld = eDAO.selectFirstEpisode(novelNum);
		System.out.println("firstEp: " + eld);
		return eld;
	}// firstEp
	
	
	// 이전화
	public EpLookDomain prevEp(EpCheckVO epCheckVO) {
		EpLookDomain eld = eDAO.selectPrevEpisode(epCheckVO);
		System.out.println("prevEp: " + eld);
		return eld;
	}// prevNextEp
	
	// 다음화
	public EpLookDomain nextEp(EpCheckVO epCheckVO) {
		EpLookDomain eld = eDAO.selectNextEpisode(epCheckVO);
		System.out.println("nextEp: " + eld);
		return eld;
	}// prevNextEp
	
	
	// 조회수 증가
	public int viewsEp(int epNum) {
		int views = eDAO.updateViewsEpisode(epNum);
		System.out.println("viewsEp: " + views);
		return views;
	}// viewsEp
	
	
	// 좋아요 추가
	public int addLike(NovelCheckVO nCheckVO) {
		int likes = eDAO.insertLike(nCheckVO);
		System.out.println("addLike: " + eDAO.insertLike(nCheckVO));
		return likes;
	}// addLike
	
	
	// 좋아요 취소
	public int cancelLike(NovelCheckVO nCheckVO) {
		int likes = eDAO.deleteLike(nCheckVO);
		System.out.println("cancelLike: " + eDAO.deleteLike(nCheckVO));
		return likes;
	}// cancelLike
	
	
	// 신고 추가
	public int addReport(NovelReportVO nReportVO ) {
		int reports = eDAO.insertReport(nReportVO);
		System.out.println("addReport: " + eDAO.insertReport(nReportVO));
		return reports;
	}// addReport
	
	
	// 북마크 추가
	public int addBookmark(EpCheckVO epCheckVO) {
		int bookmark = eDAO.insertBookmark(epCheckVO);
		System.out.println("addBookmark: " + eDAO.insertBookmark(epCheckVO));
		return bookmark;
	}// addBookmark
	
	
	// 북마크 취소
	public int cancelBookmark(EpCheckVO epCheckVO) {
		int bookmark = eDAO.deleteBookmark(epCheckVO);
		System.out.println("cancelBookmark: " + eDAO.deleteBookmark(epCheckVO));
		return bookmark;
	}// cancelBookmark

}
