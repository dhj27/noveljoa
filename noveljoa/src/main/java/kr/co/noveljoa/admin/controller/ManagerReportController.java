package kr.co.noveljoa.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ManagerReportController {
	@GetMapping("/manager/managerReportFrm.do")
	public String managerReportFrm() {
		
		return "manager/managerReportFrm";
	}
}
