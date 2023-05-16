package kr.co.noveljoa.user.episode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

@Controller
public class EpController {
	
	// 소설-에피소드 리스트 보여주기
	@GetMapping("/novel.do")
	public String novelEpList() {
		return "novel";
	}// novelEpList
	
	
	// 소설내용 보여주기
	//@GetMapping("")
	public String searchNovel(int novelNum, Model model) {
		return "";
	}// searchNovel
	
	
	// 에피소드 리스트 ajax
	//@GetMapping("")
	public String searchEpList(EpListVO epListVO) {
		return "";
	}// searchEpList
	
	
	// 에피소드 내용 ajax
	//@GetMapping("")
	public String searchEp(EpCheckVO epCheckVO, Model model) {
		return "";
	}// searchEp
	
	
	// 첫 화
	//@GetMapping("")
	public String firstEp(int novelNum, Model model) {
		return "";
	}// firstEp
	
	
	// 이전, 다음화
	//@GetMapping("")
	public String prevNextEp(EpCheckVO epCheckVO, Model model) {
		return "";
	}// prevNextEp
	
	
	// 조회수 증가	
	//@GetMapping("")
	public String viewsEp(int epNum) {
		return "";
	}// viewsEp
	
	
	// 좋아요 추가
	//@GetMapping("")
	public String addLike(NovelCheckVO nCheckVO, Model model) {
		return "";
	}// addLike
	
	
	// 좋아요 삭제
	//@GetMapping("")
	public String cancelLike(NovelCheckVO nCheckVO, Model model) {
		return "";
	}// cancelLike
	
	
	// 신고 추가
	//@GetMapping("")
	public String addReport(NovelReportVO nReportVO , Model model) {
		return "";
	}// addReport
	
	
	// 북마크 추가
	//@GetMapping("")
	public String addBookmark(EpCheckVO epCheckVO, Model model) {
		return "";
	}// addBookmark
	
	
	// 북마크 삭제
	//@GetMapping("")
	public String cancelBookmark(EpCheckVO epCheckVO, Model model) {
		return "";
	}// cancelBookmark
	
	

}//class
