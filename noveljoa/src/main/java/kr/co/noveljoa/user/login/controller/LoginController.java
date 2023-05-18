package kr.co.noveljoa.user.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("signup.do")
	public String signup() {
		return "new_member2";
	}
	@GetMapping("idsearch.do")
	public String idSearch() {
		return "id_search";
	}
	@GetMapping("password_issued.do")
	public String passwordIssued() {
		return "password_issued";
	}
	@GetMapping("id_chk_dup.do")
	public String idCheck() {
		return "id_chk_dub";
	}
	
}
