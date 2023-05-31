package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.noveljoa.user.episode.service.EpMyService;
import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpNovelVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

@SessionAttributes
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
	public String showEpFrm(EpNovelVO epNovelVO, Model model) {
		
		// 유저번호는 세션에서 가지고 오면됨
		//int num_member = (Integer)model.getAttribute("num_member");
		
		//예시
		model.addAttribute("num_member", 1);
		
		// 파라미터로 num_novel, novelTitle
		model.addAttribute("epNovelVO", epNovelVO);
		System.out.println("write: " + epNovelVO);
		
		return "episode/episodeMy/episode_write";
	}// writeEpFrm
		
	
	// 에피소드 등록 프로세스
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
		
		// 유저번호는 세션에서 가지고 오면됨
		//int num_member = (Integer)model.getAttribute("num_member");
		
		//예시
		model.addAttribute("num_member", 1);
		epCheckMyVO.setNum_member(1);
		
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
			url= "writer_novel.do";
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
		
		int result = ems.removeEp(epCheckMyVO);
		
		String msg = "";
		String url = "";
		
		System.out.println(epCheckMyVO);
		
		if(result == 1) {
			msg = "에피소드 삭제 성공";
			url= "writer_novel.do";
		}else {
			msg = "에피소드 삭제 실패";
			url= "episode_edit.do";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		
		return "episode/episode_process";
	}// removeEp
	
		
}//class
