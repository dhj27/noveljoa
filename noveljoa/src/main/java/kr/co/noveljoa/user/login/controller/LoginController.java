package kr.co.noveljoa.user.login.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

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

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.co.noveljoa.admin.domain.MemberManageDomain;
import kr.co.noveljoa.admin.service.ManagerService1;
import kr.co.noveljoa.user.login.domain.InfoDomain;
import kr.co.noveljoa.user.login.domain.LoginDomain;
import kr.co.noveljoa.user.login.service.LoginService;
import kr.co.noveljoa.user.login.vo.IdSearchVO;
import kr.co.noveljoa.user.login.vo.InfoChangeVO;
import kr.co.noveljoa.user.login.vo.LoginHistoryVO;
import kr.co.noveljoa.user.login.vo.LoginVO;
import kr.co.noveljoa.user.login.vo.PasswordChangeVO;
import kr.co.noveljoa.user.login.vo.PasswordIssuedVO;
import kr.co.noveljoa.user.login.vo.PasswordTempVO;
import kr.co.noveljoa.user.login.vo.ProfileImgVO;
import kr.co.noveljoa.user.login.vo.SignupVO;


@SessionAttributes({"id","name","photo","num_member"}) //세션에 값 여러개 설정할 때
@Controller
public class LoginController {

	@Autowired(required = false)
	private LoginService ls;
	
	@Autowired(required = false)
	private ManagerService1 ms;
	
	

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
	public String login(LoginVO lVO,Model model,HttpServletRequest request) {
		
		String ip = request.getRemoteAddr();
		String userAgent = request.getHeader("User-Agent");
		String os = null;

		if (userAgent != null) {
		    if (userAgent.contains("Windows")) {
		        os = "Windows";
		    } else if (userAgent.contains("Mac")) {
		        os = "Mac OS X";
		    } else if (userAgent.contains("Linux")) {
		        os = "Linux";
		    } else if (userAgent.contains("Android")) {
		        os = "Android";
		    } else if (userAgent.contains("iPhone")) {
		        os = "iOS";
		    }
		}
	
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
			LoginHistoryVO lhVO = new LoginHistoryVO();
			lhVO.setNum_member(numMember);
			lhVO.setIp(ip);
			lhVO.setOs(os);
			ls.history(lhVO);
			
			//정지회원처리
		List<MemberManageDomain> mmList =  ms.memberManage(id);
		mmList.get(0).getSusPeriod();
	//	java.util.Date date = new java.util.Date(mmList.get(0).getSusPeriod().getTime() );
//		LocalDate currentDate = LocalDate.now();
//		java.util.Date curDate = java.util.Date.from(currentDate.atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());//현재 날짜
		//System.out.println(mmList.get(0).getSusPeriod());	
		if( mmList.get(0).getSusPeriod()==null ) {
			model.addAttribute("id", id);
			model.addAttribute("name", name);
			model.addAttribute("photo", photo);
			model.addAttribute("num_member", numMember);
		}else {
			model.addAttribute("stop", "정지된 회원입니다.");
		}
		
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
	public @ResponseBody String idChk(String id,Model model) {
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
	
	  @GetMapping("info.do") 
	  public String infoView(Model model) {
	  
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
		  }else if(ls.infoChange(icVO)==-1) {
			  mav.setViewName("login/alert_phone_dub");
			  return mav;
		  }else {
			  mav.setViewName("login/my_page");
			  return mav;
		  }
	  }
	  
	  
	  @GetMapping("sub.do")
	  public String pwChangeView(Model model) {
		  
		  return "login/sub";
	  }
	  
	  
	  @PostMapping("sub_dao.do")
		public String passwordChange(Model model, PasswordChangeVO pcVO) {
		  String id=(String)model.getAttribute("id");
		  pcVO.setId(id);
		  if( ls.passChange(pcVO)==1) {
			  return "login/popup_close";
			  
		  }else {
			  return "login/alert_changeInfo_err";
			  
		  }
		  
	}
	  @PostMapping("my_page_profile.do")
	  public String profile(Model model,HttpServletRequest request,ProfileImgVO ifVO) throws IOException {
			
		  	int num_member = (Integer)model.getAttribute("num_member");
			 //1. 저장디렉토리를 설정
//			  String resourceDir = request.getSession().getServletContext().getRealPath("/_next/static/images/profile_images");
			  String resourceDir = "C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/_next/static/images/profile_images";
			  //String resourceDir = "/home/ubuntu/noveljoa/_next/static/images/profile_images";
			  System.out.println(resourceDir);
			    File saveDirectory=new File(resourceDir);
			    int fileSize=1024*1024*2;
			    //2. FileUpload Component 생성(multipartRequest) => 생성함과 동시에 파일이 업로드된다
			    MultipartRequest mr =new MultipartRequest(request,saveDirectory.getAbsolutePath(),fileSize,"UTF-8",new DefaultFileRenamePolicy());
			    //3.<input type = "file">의 값을 받는다
			    //String fileName = mr.getFilesystemName("file");
			    
			 // 업로드한 파일의 이름 가져오기
			    String originalFileName = mr.getOriginalFileName("file");
			 
			 //확장자만 남기기
			 String extension = "";
			 
			 int lastIndex = originalFileName.lastIndexOf(".");
			 
			 if(lastIndex>= 0){
				 extension = originalFileName.substring(lastIndex).toLowerCase();
			 }

			    // 저장할 파일 이름 설정
			    /* String savedFileName = user_num_member+extension; */
				String savedFileName = UUID.randomUUID().toString()+extension;
			    // 저장할 파일 객체 생성
			    File savedFile = new File(saveDirectory, savedFileName);

			    // 업로드한 파일을 읽어서 저장할 파일에 쓰기
			    try (
			        InputStream inStream = new FileInputStream(new File(saveDirectory, originalFileName));
			        OutputStream outStream = new FileOutputStream(savedFile)
			    ) {
			        byte[] buffer = new byte[1024];
			        int length;
			        while ((length = inStream.read(buffer)) > 0) {
			            outStream.write(buffer, 0, length);
			        }
			        }
			        File originalFile = new File(saveDirectory, originalFileName);
			        originalFile.delete();
			        
			        String beforePhotoName = (String)model.getAttribute("photo");
			        File beforePhotoFile = new File(resourceDir+"/"+beforePhotoName);
			        
			        beforePhotoFile.delete();
			        
			        ifVO.setPhoto(savedFileName);
			        ifVO.setNum_member(num_member);
			        ls.updateProfile(ifVO);
			        model.addAttribute("photo", savedFileName);
			    
			
			return "login/alert_profileImg";
		}
}




