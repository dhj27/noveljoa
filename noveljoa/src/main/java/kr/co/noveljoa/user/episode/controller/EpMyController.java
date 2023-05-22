package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.noveljoa.user.episode.service.EpMyService;
import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

@Controller
public class EpMyController {
	
	@Autowired(required = false)
	private EpMyService ems;
	
	// 에피소드 작성창
	@PostMapping("/episode_write.do")
	public String showEpFrm(Model model) {
		
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
		
		System.out.println("----------------"+ epCreateVO);
		int result = ems.writeEp(epCreateVO);
		
		if(result == 1) {
			model.addAttribute("result", "완료!");
		}else {
			model.addAttribute("result", "실패");
		}
		
		return "episode/episodeMy/episode_write_process";
	}// addEpProcess
	
	
	// 에피소드 수정창
	//@GetMapping("")
	public String editEpFrm(Model model) { //int novelNum ?
		
		return "";
	}// editEpFrm
	
	
	// 에피소드 수정 내용 불러오기 ajax
	//@GetMapping("")
	public String searchEp(EpCheckMyVO epCheckMyVO, Model model) {
		
		return "";
	}// searchEp
	
	
	// 에피소드 수정 프로세스 ajax
	//@GetMapping("")
	public String editEpProcess(EpUpdateVO epUpdateVO, Model model) {
		
		return "";
	}// editEpProcess
	
	
	// 에피소드 삭제
	//@GetMapping("")
	public String removeEp(EpCheckMyVO epCheckMyVO, Model model) {
		
		return "";
	}// removeEp
	
	
	// 에피소드 리스트창
	//@GetMapping("")
	public String epList(Model model) { // int userNum;
		
		return "";
	}// epList
	
	
	// 에피소드 리스트 내용 보여주기 ajax
	//@GetMapping("")
	public String searchEpList(NovelCheckMyVO nCheckMyVO, Model model) {
		
		return "";
	}// searchEpList
	
}//class
