package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import kr.co.noveljoa.user.episode.domain.EpListDomain;
import kr.co.noveljoa.user.episode.domain.EpLookDomain;
import kr.co.noveljoa.user.episode.domain.NovelLookDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

public class EpDAO {
	
	// 소설내용 보여주기
	public NovelLookDomain selectNovel(int novelNum) {
		return null;
	}// searchNovel
	
	
	// 에피소드 리스트 ajax
	public List<EpListDomain> selectEpisodeList(EpListVO epListVO) {
		return null;
	}// searchEpList
	
	
	// 에피소드 내용 ajax
	public EpLookDomain selectEpisode(EpCheckVO epCheckVO) {
		return null;
	}// searchEp
	
	
	// 첫 화
	public EpLookDomain selectFirstEpisode(int novelNum) {
		return null;
	}// firstEp
	
	
	// 이전, 다음화
	public EpLookDomain selectPrevNextEpisode(EpCheckVO epCheckVO) {
		return null;
	}// prevNextEp
	
	
	// 조회수 증가	
	public void updateViewsEpisode(int epNum) {
	}// viewsEp
	
	
	// 좋아요 추가
	public void insertLike(NovelCheckVO nCheckVO) {
	}// addLike
	
	
	// 좋아요 삭제
	public int deleteLike(NovelCheckVO nCheckVO) {
		return 0;
	}// cancelLike
	
	
	// 신고 추가
	public void insertReport(NovelReportVO nReportVO ) {
	}// addReport
	
	
	// 북마크 추가
	public void insertBookmark(EpCheckVO epCheckVO) {
	}// addBookmark
	
	
	// 북마크 삭제
	public int deleteBookmark(EpCheckVO epCheckVO) {
		return 0;
	}// cancelBookmark
	
}
