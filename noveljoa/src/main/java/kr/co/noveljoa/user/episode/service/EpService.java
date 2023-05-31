package kr.co.noveljoa.user.episode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.episode.dao.EpDAO;
import kr.co.noveljoa.user.episode.domain.EpListDomain;
import kr.co.noveljoa.user.episode.domain.EpLookDomain;
import kr.co.noveljoa.user.episode.domain.NovelDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;
import kr.co.noveljoa.user.episode.vo.ReportVO;

@Component
public class EpService {
	
	@Autowired(required = false)
	private EpDAO eDAO;
	
	// 소설 내용 보여주기
	public NovelDomain searchNovel(int num_novel) {
		NovelDomain nd = eDAO.selectNovel(num_novel);		
		System.out.println("searchNovel "+ eDAO.selectNovel(num_novel));
		
		return nd;
	}// searchNovel
	

	// 에피소드 리스트 ajax
	public List<EpListDomain> searchEpList(int num_novel) {
		List<EpListDomain> list = eDAO.selectEpisodeList(num_novel);
		return list;
	}// searchEpList
	
	
	// 에피소드 상세 내용
	public EpLookDomain searchEp(EpCheckVO epCheckVO) {
		EpLookDomain eld = eDAO.selectEpisode(epCheckVO);
		//에러
		System.out.println("searchEp: " + eld);
		return eld;
	}// searchEp
	
	
	// 소설 좋아요 선택
	public int searchLike(NovelCheckVO nCheckVO) {
		int cnt = eDAO.selectLike(nCheckVO);
		System.out.println("searchNovelLike "+ eDAO.selectLike(nCheckVO));
		
		return cnt;
	}//searchNovelLike
	
	// 소설 신고 선택
	public int searchReport(ReportVO reportVO) {
		int cnt = eDAO.selectReport(reportVO);
		System.out.println("searchNovelReport "+ eDAO.selectReport(reportVO));
		
		return cnt;
	}//searchNovelLike
	
	
	// 첫 화
	public int firstEp(int num_novel) {
		int cnt = eDAO.selectFirstEpisode(num_novel);
		System.out.println("num_novel: " + num_novel+", firstEp: "+cnt);
		return cnt;
	}// firstEp
	
	
	// 이전화
	public int prevEp(EpCheckVO epCheckVO) {
		int cnt = eDAO.selectPrevEpisode(epCheckVO);
		System.out.println("num_novel: " + epCheckVO.getNum_novel()+", prevEp: "+cnt);
		return cnt;
	}// prevNextEp
	
	// 다음화
	public int nextEp(EpCheckVO epCheckVO) {
		int cnt = eDAO.selectNextEpisode(epCheckVO);
		System.out.println("num_novel: " + epCheckVO.getNum_novel()+", nextEp: "+cnt);
		return cnt;
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
