package kr.co.noveljoa.user.episode.service;

import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

public class EpService {
	
	// 소설내용 보여주기
	public String searchNovel(int novelNum) {
		return "";
	}// searchNovel
	
	
	// 에피소드 리스트 ajax
	public String searchEpList(EpListVO epListVO) {
		return "";
	}// searchEpList
	
	
	// 에피소드 내용 ajax
	public String searchEp(EpCheckVO epCheckVO) {
		return "";
	}// searchEp
	
	
	// 첫 화
	public String firstEp(int novelNum) {
		return "";
	}// firstEp
	
	
	// 이전, 다음화
	public String prevNextEp(EpCheckVO epCheckVO) {
		return "";
	}// prevNextEp
	
	
	// 조회수 증가	
	public String viewsEp(int epNum) {
		return "";
	}// viewsEp
	
	
	// 좋아요 추가
	public String addLike(NovelCheckVO nCheckVO) {
		return "";
	}// addLike
	
	
	// 좋아요 삭제
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
	
	
	// 북마크 삭제
	public String cancelBookmark(EpCheckVO epCheckVO) {
		return "";
	}// cancelBookmark
	
	


}
