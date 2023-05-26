package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.noveljoa.user.episode.service.EpService;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

@Controller
public class EpController {
	
	@Autowired(required = false)
	private EpService epService;
	
	@PostMapping("/episode/comment.do")
	public String cmt() {
		return "episode/comment";
	}
	
	// test
	@GetMapping("/episode/a.do")
	public String ab() {
		return "episode/a";
	}// novelEpList
	
	
	// 소설내용 보여주기
	@GetMapping("/novels.do")
	public String novelDetail(int novelNum, Model model) {
		// 세션받아오기
//		int userNum = (Integer)model.getAttribute("num_member");
//		novelNum = (Integer)model.getAttribute("num_novel");
//		model.addAttribute("novelNum", 1);
		model.addAttribute("searchNovel", epService.searchNovel(novelNum));
		System.out.println(epService.searchNovel(novelNum));
		return "/episode/novel";
	}// novelDetail
	
	
	@ResponseBody
	@GetMapping("/novelLikeReport.do")
	public String novelLikeReport(NovelCheckVO nCheckVO, Model model) {
		
		return "";
	}//novelLikeReport
	
	
	
	
	// 에피소드 리스트 ajax
	//@ResponseBody
	//@GetMapping("")
	public String searchEpList(EpListVO epListVO) {
		return "";
	}// searchEpList
	
	
	// 에피소드 내용 ajax
	@GetMapping("/episode.do")
	public String searchEp(EpCheckVO epCheckVO, Model model) {
		return "/episode/episode_read";
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
