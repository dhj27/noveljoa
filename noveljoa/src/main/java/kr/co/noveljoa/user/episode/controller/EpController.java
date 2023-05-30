package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.noveljoa.user.episode.service.EpService;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
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
	
	
	// 소설내용 보여주기
	@GetMapping("/novel.do") 
	public String novelDetail(/*NovelCheckVO nCheckVO*/ int num_novel, Model model) {
		
//		nCheckVO.setNum_member(1); //세션에서 값가져오기 nCheckVO.getNum_novel();
		 	
		model.addAttribute("searchNovel", epService.searchNovel(num_novel));
		model.addAttribute("epList", epService.searchEpList(num_novel));
		
//		model.addAttribute("nlike", epService.searchNovelLike(nCheckVO));
		
		System.out.println(epService.searchEpList(num_novel));
		System.out.println("--------------------"+epService.searchNovel(num_novel));
		return "episode/novel";
	}// novelDetail
	
	
	// 좋아요 보여주기 ajax
//	@ResponseBody
//	@GetMapping("/novelLike.do")
//	public int novelLike(NovelCheckVO nCheckVO, Model model) {
//		nCheckVO.setNum_member(1);  //세션에서 값가져오기
//		nCheckVO.getNum_novel();
//		
////		model.addAttribute("nlike", epService.searchNovelLike(nCheckVO));
//		return epService.searchNovelLike(nCheckVO);
//	}//novelLike
	
	@GetMapping("/novelReport.do")
	public int novelReport(NovelCheckVO nCheckVO, Model model) {
		nCheckVO.setNum_member(1);
		return 0;
	}//novelReport
	
	
	// 에피소드 내용 ajax
	@GetMapping("/read.do")
	public String searchEp(EpCheckVO epCheckVO, Model model) {
//		int userNum = (Integer)model.getAttribute("num_member");
		epCheckVO.setNum_member(1);
		
		model.addAttribute("ep", epCheckVO);
		System.out.println("ep story: " + epCheckVO);
		
		model.addAttribute("ep", epService.searchEp(epCheckVO));
		
		return "/episode/episode_read";
	}// searchEp
	
	
	// 첫 화
	@GetMapping("/readFirst.do")
	public String firstEp(EpCheckVO epCheckVO, Model model) {
		
		
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
	@PostMapping("/like.do")
	public String addLike(NovelCheckVO nCheckVO, Model model) {
		
		nCheckVO.setNum_member(1);
		nCheckVO.getNum_novel();
		model.addAttribute("num_member", 1);
		
//		int like = epService.addLike(nCheckVO);
		System.out.println(nCheckVO);
		System.out.println(epService.addLike(nCheckVO));
		
		model.addAttribute("like", epService.addLike(nCheckVO));
		
		return "episode/novel";
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
