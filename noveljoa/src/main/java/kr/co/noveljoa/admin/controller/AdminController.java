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
	
	//select member info//ȸ�� ���� ����
	@GetMapping("/manager/managerMemInfo.do")
	public String memberInfo(String id, Model model) {
		
		return "manager/managerMemInfo";
	}
	
//	# ���� ����
//	+ suspendStop(String id, Model) : String
//
//	# ���� ���� ����
//	+ suspendClear(String id, Model) : String
	
	
	//select novel
	@GetMapping("/manager/novelManagerFrm.do")
	public String novelManageFrm() {
		
		return "manager/novelManagerFrm";
	} 
//	//select novel process //ajax
//	@GetMapping("/manager/novelManagerFrm.do")
//	public String noveManageProcess(String id) {
//		
//		return "manager/novelManagerFrm";
//	}
	

	
}//class
