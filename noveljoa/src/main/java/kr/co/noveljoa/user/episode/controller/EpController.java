package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.noveljoa.user.episode.service.EpService;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;
import kr.co.noveljoa.user.episode.vo.ReportVO;

@Controller
@SessionAttributes({"id","name","photo","num_member"}) //세션에 값 여러개 설정할 때
public class EpController {
	
	@Autowired(required = false)
	private EpService epService;
	

	// 소설 창
	@GetMapping("/novel.do") 
	public String novelDetail(int num_novel, NovelCheckVO nCheckVO, ReportVO reportVO, Model model) {
		int num_member = (Integer)model.getAttribute("num_member");
		String id = (String)model.getAttribute("id");
		
		nCheckVO.setNum_member(num_member); //세션에서 값가져오기 nCheckVO.getNum_novel();
		reportVO.setNum_member(num_member);
		reportVO.setId(id);
		
		System.out.println("**************************"+num_member);
		
		model.addAttribute("num_novel", num_novel);
		model.addAttribute("searchNovel", epService.searchNovel(num_novel));
		model.addAttribute("epList", epService.searchEpList(num_novel));
		
		model.addAttribute("like", epService.searchLike(nCheckVO));  //좋아요 여부
		model.addAttribute("report", epService.searchReport(reportVO));  //좋아요 여부
		model.addAttribute("first", epService.firstEp(num_novel));	// 첫화
		
		return "episode/novel";
	}// novelDetail
	
	
	// 에피소드 내용
	@GetMapping("/read.do")
	public String searchEp(EpCheckVO epCheckVO, Model model) {
		int num_member = (Integer)model.getAttribute("num_member");
		
		epCheckVO.setNum_member(num_member);
		
		model.addAttribute("ep", epService.searchEp(epCheckVO));
		
		model.addAttribute("prev", epService.prevEp(epCheckVO));	// 이전화
		model.addAttribute("next", epService.nextEp(epCheckVO));	// 다음화
		
		return "/episode/episode_read";
	}// searchEp
	
	
	
	// 조회수 증가	
	//@GetMapping("")
	public String viewsEp(int epNum) {
		return "";
	}// viewsEp
	
	
	// 좋아요 추가 1성공 0 실패
	@GetMapping("/like.do")
	@ResponseBody
	public String addLike(NovelCheckVO nCheckVO, Model model) {
		int num_member = (Integer)model.getAttribute("num_member");
		
		nCheckVO.setNum_member(num_member);
		
		return epService.addLike(nCheckVO);
	}// addLike
	
	
	// 좋아요 삭제
	@GetMapping("/cancel.do")
	@ResponseBody
	public String cancelLike(NovelCheckVO nCheckVO , Model model) {
		int num_member = (Integer)model.getAttribute("num_member");

		nCheckVO.setNum_member(num_member);
		
		return epService.cancelLike(nCheckVO);
	}// cancelLike
	
	// 신고 팝업
	@GetMapping("/report_popup.do")
	public String showReport(@RequestParam int num_novel, Model model) {
		
		model.addAttribute("num_novel", num_novel);
		return "episode/report_popup";
	}
	
	// 신고 추가
	@PostMapping("report_process.do")
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
	
	// 댓글 
	@GetMapping("/comment.do")
	public String showComment(EpCheckVO epCheckVO, Model model) {
		
		return "episode/comment";
	}
	

}//class
