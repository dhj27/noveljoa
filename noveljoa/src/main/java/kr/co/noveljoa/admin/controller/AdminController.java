package kr.co.noveljoa.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.noveljoa.admin.domain.MBoardDomain;
import kr.co.noveljoa.admin.domain.MNovelDomain;
import kr.co.noveljoa.admin.domain.MNovelLookDomain;
import kr.co.noveljoa.admin.service.AdminService;

@Controller
public class AdminController {
	@Autowired(required = false)
	private AdminService as;
	
	//select, search novel
	@GetMapping("/manager/managerNovelFrm.do")
	public String managerNovelFrm(String id, Model model) {
	    List<MNovelDomain> novelList;

	    if (id != null) {
	        novelList = as.searchNovel(id);
	    } else {
	        novelList = as.novelManage();
	    }//end else
	    model.addAttribute("novelList", novelList);
	    
	    return "manager/managerNovelFrm";
	}//managerNovelFrm

	//report
	@GetMapping("/manager/managerReportFrm.do")
	public String managerReportFrm(int novelNum, Model model) {
		model.addAttribute("report",as.reportManage(novelNum));
		
		return "manager/managerReportFrm";
	}//managerReportFrm

	//report delete
	@PostMapping("/manager/deleteNovel.do")
	public String deleteReportNovel(
			@RequestParam(required = false) Optional<Integer> novelNum, Model model) {
		if (novelNum.isPresent()) {
			model.addAttribute("deleteFlag", as.removeReportNovel(novelNum.get()));
		}//end if
		
		return "manager/deleteNovel";
	}//deleteReportNovel

	//report public
	@PostMapping("/manager/publicNovel.do")
	public String publicReportNovel(
			@RequestParam(required = false) Optional<Integer> novelNum, Model model) {
		if (novelNum.isPresent()) {
			model.addAttribute("publicFlag", as.publicNovel(novelNum.get()));
		}//end if
		
		return "manager/publicNovel";
	}//publicReportNovel
	
	//report private
	@PostMapping("/manager/privateNovel.do")
	public String privateReportNovel(
			@RequestParam(required = false) Optional<Integer> novelNum, Model model) {
		if (novelNum.isPresent()) {
			model.addAttribute("privateFlag",as.privateNovel(novelNum.get()));
		}//end if
		
		return "manager/privateNovel";
	}//privateReportNovel
	
	
}//class
