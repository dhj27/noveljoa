package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.noveljoa.user.episode.service.EpMyService;
import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

@Controller
public class EpMyController {
	
	@Autowired(required = false)
	private EpMyService ems;
	
	@GetMapping("/index.do")
	public String index() {
		return "episode/index";
	}
	
	// 에피소드 작성창
	@PostMapping("/episode_write.do")
	public String showEpFrm(Model model) {
		// 모델에 등록되어있던 값을 가져와서 넣는다
//		int userNum = (Integer)model.getAttribute("num_member");
//		int novelNum = (Integer)model.getAttribute("num_novel");
//		String novelTitle = (String) model.getAttribute("novelTitle");
		
		model.addAttribute("userNum", 1);
		model.addAttribute("novelNum", 5);
		model.addAttribute("novelTitle", 5);
		
		return "episode/episodeMy/episode_write";
	}// writeEpFrm
		
	
	// 에피소드 등록 프로세스 ajax
	@PostMapping("/episode_write_process.do")
	public String addEpProcess(EpCreateVO epCreateVO, Model model) {
		
		int result = ems.writeEp(epCreateVO);
		
		if(result == 1) {
			model.addAttribute("result", "완료!");
		}else {
			model.addAttribute("result", "실패");
		}
		
		return "episode/episodeMy/episode_write_process";
	}// addEpProcess
	
	
	// 에피소드 수정창c
	@PostMapping("/episode_edit.do")
	public String editEpFrm(EpCheckMyVO epCheckMyVO, Model model) { 
		
//		int userNum = (Integer)model.getAttribute("num_member");
//		int novelNum = (Integer)model.getAttribute("num_novel");
//		int epNum = (Integer)model.getAttribute("num_episode");
		
		epCheckMyVO.setNum_member(1);
		epCheckMyVO.setNum_novel(1);
		epCheckMyVO.setNum_episode(9);
		
		model.addAttribute("chkVO", epCheckMyVO);
		
		System.out.println(epCheckMyVO);
		
		model.addAttribute("showEpDetail", ems.searchEp(epCheckMyVO));
		return "episode/episodeMy/episode_edit";
	}// editEpFrm
	
	
	// 에피소드 수정 프로세스
	@ResponseBody
	@PostMapping("/episode_edit_process.do")
	public String editEpProcess(EpUpdateVO epUpdateVO, Model model) {
				
		int result = ems.editEp(epUpdateVO);
		String msg = "";
				
		System.out.println(epUpdateVO);
		
		if(result == 1) {
			msg = "<script>alert(\"success\"); location.replace('index.do')</script>";
		}else {
			msg = "<script>alert('fail'); location.href='episode_edit.do'</script>";
		}
		System.out.println(msg);
		return msg;
	}// editEpProcess
	
	
	// 에피소드 삭제 : 필요한 값을 받는다.
	@PostMapping("/episode_remove.do")
	public String removeEp(EpCheckMyVO epCheckMyVO, Model model) {
		
		String msg = "";
//		int userNum = (Integer)model.getAttribute("num_member");
//		int novelNum = (Integer)model.getAttribute("num_novel");
//		int epNum = (Integer)model.getAttribute("num_episode");
		
		epCheckMyVO.setNum_member(1);
		epCheckMyVO.setNum_novel(1);
		epCheckMyVO.setNum_episode(9);
		
		int result = ems.removeEp(epCheckMyVO);
		
		if(result == 1) {
			msg="success";
		}else {
			msg="fail";
		}
		
		return "forward:episode/episodeMy/index";
	}// removeEp
	
	
	// 에피소드 리스트창
	@PostMapping("/episode_novel.do")
	public String epList(Model model) { // int userNum;
		
		return "";
	}// epList
	
	
	// 에피소드 리스트 내용 보여주기 ajax
	//@GetMapping("")
	public String searchEpList(NovelCheckMyVO nCheckMyVO, Model model) {
		
		return "";
	}// searchEpList
	
}//class
