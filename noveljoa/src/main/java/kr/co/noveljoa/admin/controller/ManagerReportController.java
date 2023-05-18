package kr.co.noveljoa.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ManagerReportController {
	@GetMapping("/manager/managerReportFrm.do")
	public String managerReportFrm() {
		
		return "manager/managerReportFrm";
	}
}
