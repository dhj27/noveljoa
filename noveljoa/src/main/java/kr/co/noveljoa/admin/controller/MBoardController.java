package kr.co.noveljoa.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MBoardController {
	

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