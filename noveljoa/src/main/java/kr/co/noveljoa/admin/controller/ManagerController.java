package kr.co.noveljoa.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.service.ManagerLoginService;
import kr.co.noveljoa.admin.vo.MLoginVO;

@Controller
public class ManagerController {
	
	@GetMapping("/manager/managerLoginFrm.do")
	public String managerLoginFrm() {
	
		return "manager/managerLoginFrm";
	}
	
	@PostMapping("/manager/managerLoginProcess.do")
	public String managerLoginProcess(MLoginVO mlVO  ,Model model) {
		
		ManagerLoginService mlService = new ManagerLoginService();
		MLoginDomain mlDomain = mlService.ManagerLogin(mlVO);
		System.out.println(mlDomain);
		model.addAttribute("data", mlDomain);
		
		return "manager/managerLoginProcess";
	}
	
	@GetMapping("/manager/dashBoardFrm.do")
	public String dashBoardFrm() {
	
		return "manager/dashBoardFrm";
	}

	@GetMapping("/manager/memberManagerFrm.do")
	public String memberManagerFrm() {
		
		return "manager/memberManagerFrm";
	}
	
	
	@GetMapping("/manager/novelManagerFrm.do")
	public String novelManagerFrm() {
		
		return "manager/novelManagerFrm";
	}
	
	@GetMapping("/manager/messageBoardFrm.do")
	public String messageBoardFrm() {
		
		return "manager/messageBoardFrm";
	}
	
	@GetMapping("/manager/commentManagerFrm.do")
	public String commentFrm() {
		
		return "manager/commentManagerFrm";
	}
	
	@GetMapping("/manager/managerMemInfo.do")
	public String managerMemInfo() {
		
		return "manager/managerMemInfo";
	}

	
}
