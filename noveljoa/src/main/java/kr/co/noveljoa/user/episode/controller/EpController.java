package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.noveljoa.user.episode.service.EpService;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

@Controller
public class EpController {
	
	@Autowired(required = false)
	private EpService epService;
	
	// test
	@GetMapping("/episode/a.do")
	public String ab() {
		return "episode/a";
	}// novelEpList
	
	
	// 소설-에피소드 리스트 보여주기
	@GetMapping("/novels.do")
	public String novelEpList(int novelNum, Model model) {
		// 세션받아오기
		int userNum = (Integer)model.getAttribute("num_member");
		
		// 소설정보 조회
		// 아이디를 사용하여 좋아요?여부를 조회
		// 아이디를 사용하여 신고?여부를 조회
		// 회차정보 조회 
		// model 에 넣는다
		
		return "episode/novel";
	}// novelEpList
	
	
	
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
