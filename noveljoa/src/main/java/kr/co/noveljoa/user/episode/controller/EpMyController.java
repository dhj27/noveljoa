package kr.co.noveljoa.user.episode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

@Controller
public class EpMyController {
	
	// ���Ǽҵ� �ۼ�â
	//@GetMapping("")
	public String writeEpFrm(Model model) {
		
		return "";
	}// writeEpFrm
	
	
	// ���Ǽҵ� ��� ���μ��� ajax
	//@GetMapping("")
	public String addEpProcess(EpCreateVO epCreateVO, Model model) {
		
		return "";
	}// addEpProcess
	
	
	// ���Ǽҵ� ����â
	//@GetMapping("")
	public String editEpFrm(Model model) { //int novelNum ?
		
		return "";
	}// editEpFrm
	
	
	// ���Ǽҵ� ���� ���� �ҷ����� ajax
	//@GetMapping("")
	public String searchEp(EpCheckMyVO epCheckMyVO, Model model) {
		
		return "";
	}// searchEp
	
	
	// ���Ǽҵ� ���� ���μ��� ajax
	//@GetMapping("")
	public String editEpProcess(EpUpdateVO epUpdateVO, Model model) {
		
		return "";
	}// editEpProcess
	
	
	// ���Ǽҵ� ����
	//@GetMapping("")
	public String removeEp(EpCheckMyVO epCheckMyVO, Model model) {
		
		return "";
	}// removeEp
	
	
	// ���Ǽҵ� ����Ʈâ
	//@GetMapping("")
	public String epList(Model model) { // int userNum;
		
		return "";
	}// epList
	
	
	// ���Ǽҵ� ����Ʈ ���� �����ֱ� ajax
	//@GetMapping("")
	public String searchEpList(NovelCheckMyVO nCheckMyVO, Model model) {
		
		return "";
	}// searchEpList
	
}//class
