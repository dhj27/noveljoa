package kr.co.noveljoa.user.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.noveljoa.user.login.service.LoginService;
import kr.co.noveljoa.user.login.vo.IdSearchVO;

@Controller
public class LoginController {

	@Autowired(required = false)
	private LoginService ls;

	@GetMapping("/login/signup.do")
	public String signup() {
		return "new_member2";
	}

	@GetMapping("/login/idsearch.do")
	public String idSearch() {
		return "/login/id_search";
	}

	@GetMapping("/login/password_issued.do")
	public String passwordIssued() {
		return "password_issued";
	}

	@GetMapping("/login/id_chk_dup.do")
	public String idCheck() {
		return "id_chk_dub";
	}
<<<<<<< Updated upstream
	
=======

	@PostMapping("/login/id_search_check.do")
	public String idSearch(IdSearchVO isVO, Model model) {

		if (ls.idSearch(isVO) != null) {
			model.addAttribute("idSearch", ls.idSearch(isVO));

			return "login/id";
		} else {
			return "login/alert_noneid";
		}

	}



>>>>>>> Stashed changes
}
