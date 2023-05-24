package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
		model.addAttribute("novelNum", 1);
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
	
	
	// 에피소드 수정창 보이기
	@PostMapping("/episode_edit.do")
	public String editEpFrm(EpCheckMyVO epCheckMyVO, Model model) { 
		
//		int userNum = (Integer)model.getAttribute("num_member");
//		int novelNum = (Integer)model.getAttribute("num_novel");
//		int epNum = (Integer)model.getAttribute("num_episode");
		
		epCheckMyVO.setNum_member(1);
		epCheckMyVO.setNum_novel(5);
		epCheckMyVO.setNum_episode(28);
		
		model.addAttribute("chkVO", epCheckMyVO);
		
		System.out.println("edit " + epCheckMyVO);
		
		model.addAttribute("showEpDetail", ems.searchEp(epCheckMyVO));
		return "episode/episodeMy/episode_edit";
	}// editEpFrm
	
	
	// 에피소드 수정 프로세스
	@PostMapping("/episode_edit_process.do")
	public String editEpProcess(EpUpdateVO epUpdateVO, Model model) {
		int result = ems.editEp(epUpdateVO);
		
		String msg = "";
		String url = "";
				
		System.out.println(epUpdateVO);
		
		if(result == 1) {
			msg = "에피소드 수정 성공";
			url= "index.do";
		}else {
			msg = "에피소드 수정 실패";
			url= "episode_edit.do";
		}
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		
		return "episode/episode_process";
	}// editEpProcess
	
	
	// 에피소드 삭제 : 필요한 값을 받는다.
	@PostMapping("/episode_remove.do")
	public String removeEp(EpCheckMyVO epCheckMyVO, Model model) {
		
//		System.out.println(model.getAttribute("chkVO.num_novel"));
//		int userNum = (Integer)model.getAttribute("num_member");
//		int novelNum = (Integer)model.getAttribute("num_novel");
//		int epNum = (Integer)model.getAttribute("num_episode");
//		
//		System.out.println("+++++++++++++++++++++" +userNum+"/"+novelNum+"/"+epNum);
//		
//		epCheckMyVO.setNum_member(userNum);
//		epCheckMyVO.setNum_novel(novelNum);
//		epCheckMyVO.setNum_episode(epNum);
		
		int result = ems.removeEp(epCheckMyVO);
		
		String msg = "";
		String url = "";
		
		System.out.println(epCheckMyVO);
		
		if(result == 1) {
			msg = "에피소드 삭제 성공";
			url= "index.do";
		}else {
			msg = "에피소드 삭제 실패";
			url= "episode_edit.do";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		
		return "episode/episode_process";
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
