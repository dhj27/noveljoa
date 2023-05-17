package kr.co.noveljoa.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.service.ManagerLoginService;
import kr.co.noveljoa.admin.vo.MLoginVO;

@Controller
public class AdminController {
	
//	@GetMapping("/manager/managerMemInfo.do")
//	public String managerMemInfo() {
//	
//		return "manager/managerMemInfo";
//	}
	@GetMapping("/manager/managerReportFrm.do")
	public String managerReportFrm() {
		
		return "manager/managerReportFrm";
	}
	@GetMapping("/manager/messageFreeBoardFrm.do")
	public String messageFreeBoardFrm() {
		
		return "manager/messageFreeBoardFrm";
	}
	@GetMapping("/manager/messageFreeLookFrm.do")
	public String messageFreeLookFrm() {
		
		return "manager/messageFreeLookFrm";
	}
	
	@GetMapping("/manager/messageQNABoardFrm.do")
	public String messageQNABoardFrm() {
		
		return "manager/messageQNABoardFrm";
	}
	
	@GetMapping("/manager/messageQNALookFrm.do")
	public String messageQNALookFrm() {
		
		return "manager/messageQNALookFrm";
	}
	


	
}
