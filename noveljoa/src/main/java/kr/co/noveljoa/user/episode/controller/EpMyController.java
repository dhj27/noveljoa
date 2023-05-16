package kr.co.noveljoa.user.episode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

@Controller
public class EpMyController {
	
	// 에피소드 작성창
	//@GetMapping("")
	public String writeEpFrm(Model model) {
		
		return "";
	}// writeEpFrm
	
	
	// 에피소드 등록 프로세스 ajax
	//@GetMapping("")
	public String addEpProcess(EpCreateVO epCreateVO, Model model) {
		
		return "";
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
