package kr.co.noveljoa.user.login.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import kr.co.noveljoa.user.login.domain.InfoDomain;
import kr.co.noveljoa.user.login.domain.LoginDomain;
import kr.co.noveljoa.user.login.service.LoginService;
import kr.co.noveljoa.user.login.vo.IdSearchVO;
import kr.co.noveljoa.user.login.vo.InfoChangeVO;
import kr.co.noveljoa.user.login.vo.LoginVO;
import kr.co.noveljoa.user.login.vo.PasswordChangeVO;
import kr.co.noveljoa.user.login.vo.PasswordIssuedVO;
import kr.co.noveljoa.user.login.vo.PasswordTempVO;
import kr.co.noveljoa.user.login.vo.SignupVO;


@SessionAttributes({"id","name","photo","num_member"}) //세션에 값 여러개 설정할 때
@Controller
public class LoginController {

	@Autowired(required = false)
	private LoginService ls;
	
	

	@GetMapping("loginpage.do")
	public String loginpage() {
		return "login/loginpage";
	}
	
	@GetMapping("idsearch.do")
	public String idSearch() {
		return "login/id_search";
	}

	@GetMapping("password_issued.do")
	public String passwordIssued() {
		return "login/password_issued";
	}

	@GetMapping("id_chk_dup.do")
	public String idCheck() {
		return "login/id_chk_dup";
	}
	
	@GetMapping("signup.do")
	public String signupPage() {
		
		return "login/new_member2";
	}
	@PostMapping("homepage.do")
	public String login(LoginVO lVO,Model model) {
	
		List<LoginDomain> list = new ArrayList<LoginDomain>();
		
		list = ls.login(lVO);
		
		if(list.isEmpty()) {
			return "login/alert_noneid";
		}else {	
			 String id = null;
		     String name = null;
		     String photo = null;
		     int numMember = 0;
			for(LoginDomain LD : list) {
				id = LD.getId();
				name = LD.getName();
				photo = LD.getPhoto();
				numMember = LD.getNum_member();
			}
			
			model.addAttribute("id", id);
			model.addAttribute("name", name);
			model.addAttribute("photo", photo);
			model.addAttribute("num_member", numMember);
		
		return "forward:main.do";
		}
	}

	@PostMapping("id_search_check.do")
	public String idSearch(IdSearchVO isVO, Model model) {

		if (ls.idSearch(isVO) != null) {
			model.addAttribute("idSearch", ls.idSearch(isVO));

			return "login/id";
		} else {
			return "login/alert_noneid";
		}

	}
	

	
	@PostMapping("new_member3.do")
	public ModelAndView signup(SignupVO suVO, ModelAndView mav) {
		
		
		if(ls.signupInsert(suVO) == 0) {
			
			mav.setViewName("login/alert_memberInsert_err");
			
			return mav;
		}else {
			
			mav.setViewName("login/new_member3");
			
			return mav;
			
		}
		
	}
	
	@PostMapping("reset_password.do")
	public String resetPassword(PasswordIssuedVO piVO, PasswordTempVO ptVO, Model model) {
		
		if (ls.passwordSearch(piVO) != null && ls.passwordSearch(piVO) != "") {
			int length=10;//임시 비번 만들기
			String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			Random random = new Random();
		    StringBuilder password = new StringBuilder();
		    
		    for (int i = 0; i < length; i++) {
		        password.append(chars.charAt(random.nextInt(chars.length())));
		    }
		    String passwordTemp = password.toString(); // 이건 따로 사용자에게 보여줄 임시 비밀번호
		    
		    ptVO.setId(ls.passwordSearch(piVO));
		    ptVO.setPw(passwordTemp);
			if(ls.passwordInsert(ptVO) != 0) {
				
				model.addAttribute("passwordTemp", passwordTemp);
				
				return "login/reset_password";
			}else {
				
				return "login/alert_insert_temppass_err";
			}
			
		} else {
			
			return "login/alert_noneid";
			
		}
		
	}
	
	@PostMapping("id_chk.do")
	public @ResponseBody String idChk(String id,ModelAndView mav) {
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("idCheck", ls.idCheck(id));
		
		return jsonObject.toJSONString();
		
//		return "{\"test\":\""+ls.idCheck(id)+"\"}";
	}
	
	@PostMapping("mailCheck.do")
	public @ResponseBody String emailCheck(String email,Model model) {
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("code", ls.emailCheck(email));
		
		return jsonObject.toJSONString();
	}
	
	@PostMapping("logout.do")
	public @ResponseBody String logout(SessionStatus ss) {
		JSONObject jsonObject = new JSONObject();
		ss.setComplete();
		
		return jsonObject.toJSONString();
	}
	


	
	@GetMapping("my_page.do")
	public ModelAndView mypage(ModelAndView mav) {
		
		mav.setViewName("login/my_page");
		
		return mav;
	}
	
	  @GetMapping("info.do") public String infoView(Model model) {
	  
		  String idInfo=(String)model.getAttribute("id");
		  List<InfoDomain> list = new ArrayList<InfoDomain>();
		  
		  list = ls.info(idInfo);
		  
		  if(list.isEmpty()) {
			  return "alert_session";
		  }else {
			String name=null;
			String id=null;
			String phone=null;
			String email=null;
			Date birth=null;
			
			for(InfoDomain info : list) {
				name = info.getName();
				id = info.getId();
				phone = info.getPhone();
				email = info.getEmail();
				birth = info.getBirth();
			}
			
			model.addAttribute("name_info", name);
			model.addAttribute("id_info", id);
			model.addAttribute("phone_info", phone);
			model.addAttribute("email_info", email);
			model.addAttribute("birth_info", birth);
			
			  return "login/info";
		  }
		  
	  }
	 
	  @PostMapping("info_change.do")
	  public ModelAndView infoChange(ModelAndView mav, InfoChangeVO icVO) {
		  
		  
		  if( ls.infoChange(icVO)==0) {
			  mav.setViewName("login/alert_changeInfo_err");
			  return mav;
		  }else {
			  mav.setViewName("login/my_page");
			  return mav;
		  }
	  }
	  
	  
	  @PostMapping("sub.do")
	  public String pwChangeView(Model model) {
		  
		  return "login/sub";
	  }
	  
	  
	  
		public ModelAndView passwordChange(ModelAndView mav, PasswordChangeVO pcVO) {
			
		  if( ls.passChange(pcVO)==0) {
			  mav.setViewName("login/popup_close");
			  return mav;
		  }else {
			  mav.setViewName("login/my_page");
			  return mav;
		  }
		  
	}
}




