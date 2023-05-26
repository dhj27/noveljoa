package kr.co.noveljoa.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.noveljoa.admin.domain.AllMDomain;
import kr.co.noveljoa.admin.domain.AllNDomain;
import kr.co.noveljoa.admin.domain.CommentDomain;
import kr.co.noveljoa.admin.domain.DashBoardDomain;
import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.domain.MemberManageDomain;
import kr.co.noveljoa.admin.domain.MemberManageInfoDomain;
import kr.co.noveljoa.admin.domain.TodayJoinDomain;
import kr.co.noveljoa.admin.domain.TodayVisitDomain;
import kr.co.noveljoa.admin.service.DashBoardService;
import kr.co.noveljoa.admin.service.ManagerLoginService;
import kr.co.noveljoa.admin.service.ManagerService1;
import kr.co.noveljoa.admin.vo.InsertCommentVO;
import kr.co.noveljoa.admin.vo.InsertMVO;
import kr.co.noveljoa.admin.vo.MLoginVO;
import kr.co.noveljoa.admin.vo.UpdateMemVO;
@SessionAttributes({"mFlag"})
@Controller
public class ManagerController {
	@PostMapping("/manager/insert_frm_process.do")
	public String managerInsertFrm(InsertMVO IMVO, Model model){
		ManagerLoginService mlService = new ManagerLoginService();
		boolean loginFlag =  mlService.MakeManager(IMVO);
		System.out.println(loginFlag);
		model.addAttribute("loginFlag", loginFlag);
		
		return "manager/insert_frm_process";
		}
	
	@GetMapping("/manager/managerLogout.do")
	public String managerLogout(SessionStatus ss) {
		ss.setComplete();//세션에 모든 값 삭제
		System.out.println("------------------------------------------------세션값 삭제" );
		
		return "redirect:managerLoginFrm.do";
	}
	
	
	
	@GetMapping("/manager/managerLoginFrm.do")
	public String managerLoginFrm() {
	
		return "manager/managerLoginFrm";
	}
	
	@PostMapping("/manager/managerLoginProcess.do")
	public String managerLoginProcess(MLoginVO mlVO  ,Model model) {
		
		
		ManagerLoginService mlService = new ManagerLoginService();
		MLoginDomain mlDomain = mlService.ManagerLogin(mlVO);
		//System.out.println(mlDomain);
		model.addAttribute("data", mlDomain);
        model.addAttribute("mFlag", mlDomain != null);
			
	
		
		return  "manager/managerLoginProcess";
	}
	
	@GetMapping("/manager/dashBoardFrm.do")
	public String dashBoardFrm(Model model) {
		System.out.println("------------------------------------------------------------------" + model.getAttribute("mFlag"));
		String url = "";
		if( model.getAttribute("mFlag")==null ) {
			url = "redirect:managerLoginFrm.do";
		}else {
			url = "manager/dashBoardFrm";
		}
		DashBoardService dbService = new DashBoardService();
		DashBoardDomain dbDomain = dbService.printDash();
		AllMDomain amDomain = dbService.graphAllMember();
		AllNDomain anDomain = dbService.graphAllNovel();
		TodayJoinDomain tjDomain = dbService.graphJoin();
		TodayVisitDomain tvDomain = dbService.graphVisit();
		
		model.addAttribute("dashData", dbDomain);
		model.addAttribute("allMemCnt", amDomain);
		model.addAttribute("allNovCnt", anDomain);
		model.addAttribute("joinCnt", tjDomain);
		model.addAttribute("visitCnt", tvDomain);
	
		return url;
	}

	@GetMapping("/manager/memberManagerFrm.do")
	public String memberManagerFrm(String id, Model model) {
		ManagerService1 ms = new ManagerService1();
		List<MemberManageDomain> mmList =  ms.memberManage(id);
		model.addAttribute("memberData", mmList);
		model.addAttribute("memId", id);
		
		return "manager/memberManagerFrm";
	}
	
	
	@GetMapping("/manager/messageBoardFrm.do")
	public String messageBoardFrm() {
		
		return "manager/messageBoardFrm";
	}
	
	@GetMapping("/manager/commentManagerFrm.do")
	public String commentFrm(String id, Model model) {
		ManagerService1 ms = new ManagerService1();
		List<CommentDomain> cdList =  ms.commentManage(id);
		model.addAttribute("commentData", cdList);
		model.addAttribute("comId", id);
		
		return "manager/commentManagerFrm";
	}
	
	@GetMapping("/manager/managerMemInfo.do")
	public String memberInfo(String id, Model model) {
		MemberManageInfoDomain mmiDomain = null;
		ManagerService1 ms = new ManagerService1();
		mmiDomain=  ms.memberInfoAll(id);
		model.addAttribute("memInfo", mmiDomain);
		
		
		return "manager/managerMemInfo";
	}
	
	@PostMapping("manager/stopId.do")
	public String StopId(String id, Model model) {
		ManagerService1 ms = new ManagerService1();
		 Boolean stopFlag =  ms.stopId(id);
		 model.addAttribute("stopFlag", stopFlag);
		 
		return "manager/stopComplete";
	}
	
	@PostMapping("manager/unStopId.do")
	public String UnStopId(String id, Model model) {
		ManagerService1 ms = new ManagerService1();
		Boolean stopFlag =  ms.unStopId(id);
		model.addAttribute("stopFlag", stopFlag);
		
		return "manager/stopComplete";
	}
	
	@PostMapping("manager/modifyMemInfoFrm.do")
	public String modifyMemInfoFrm(String id, Model model) {
		MemberManageInfoDomain mmiDomain = null;
		ManagerService1 ms = new ManagerService1();
		mmiDomain=  ms.memberInfoAll(id);
		model.addAttribute("memInfo", mmiDomain);
		
		return "manager/modifyMemInfoFrm";
	}
	
	@PostMapping("manager/modifyMemInfoProcess.do")
	public String modifyMemInfo(UpdateMemVO uVO, Model model) {
		ManagerService1 ms = new ManagerService1();
		Boolean modifyFlag = ms.modifyMemInfo(uVO);
		model.addAttribute("modifyFlag", modifyFlag);
		
		return "manager/modifyComplete";
	}
	
	@GetMapping("manager/removeComment.do")
	public String removeComment(int comment_num, Model model) {
		ManagerService1 ms = new ManagerService1();
		 Boolean removeFlag =  ms.removeComment(comment_num);
		 model.addAttribute("removeFlag", removeFlag);
		 
		return "manager/removeComment";
	}
	

	
	
	
	
	
}
	
