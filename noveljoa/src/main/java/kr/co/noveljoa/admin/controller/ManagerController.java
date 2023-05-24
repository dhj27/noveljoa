package kr.co.noveljoa.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.noveljoa.admin.domain.AllMDomain;
import kr.co.noveljoa.admin.domain.AllNDomain;
import kr.co.noveljoa.admin.domain.BoardCommentDomain;
import kr.co.noveljoa.admin.domain.CommentDomain;
import kr.co.noveljoa.admin.domain.DashBoardDomain;
import kr.co.noveljoa.admin.domain.FreeBoardDomain;
import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.domain.MemberManageDomain;
import kr.co.noveljoa.admin.domain.MemberManageInfoDomain;
import kr.co.noveljoa.admin.domain.TodayJoinDomain;
import kr.co.noveljoa.admin.domain.TodayVisitDomain;
import kr.co.noveljoa.admin.service.DashBoardService;
import kr.co.noveljoa.admin.service.ManagerLoginService;
import kr.co.noveljoa.admin.service.ManagerService1;
import kr.co.noveljoa.admin.vo.BoardCommentVO;
import kr.co.noveljoa.admin.vo.FreeBoardVO;
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
	
	@GetMapping("manager/messageFreeLookFrm2.do")
	public String messageFreeLookFrm2() {
		return "manager/messageFreeLookFrm2";
	}
	

	
	@GetMapping("manager/messageQNALookFrm2.do")
	public String messageQNALookFrm2(@RequestParam(name = "board_num", required = false) Integer board_num, Model model) {
		//기본자료형 int는 null로 선언할 수 없다.
		//자신의 로직 중 int에 null이 들어갈 수 있는 장소를 찾아내서 수정해줘야한다.
		if (board_num == null) {
			board_num = 0;
		  }
		ManagerService1 ms = new ManagerService1();
		List<FreeBoardDomain> fdList =  ms.printFreeBoard(board_num);
		model.addAttribute("freeBoardData", fdList);
		
		return "manager/messageQNALookFrm2";
	}
	
	
	@GetMapping("manager/messageQNALookFrmInfo.do")
	public String messageQNALookFrmInfo() {
		
		return "manager/messageQNALookFrmInfo";
	}
	
	@GetMapping("manager/boardComplete.do")
	public String boardComplete(FreeBoardVO fVO, Model model ) {
		ManagerService1 ms = new ManagerService1();
		Boolean boardFlag = ms.addFreeBoard(fVO);
		model.addAttribute("boardFlag", boardFlag);
		return "manager/boardComplete";
	}
	
	@GetMapping("manager/messageQNALookFrm3.do")
	public String messageQNALookFrm3(int board_num, Model model) {
		//@RequestParam(name = "board_num", required = false) Integer
		//기본자료형 int는 null로 선언할 수 없다.
		//자신의 로직 중 int에 null이 들어갈 수 있는 장소를 찾아내서 수정해줘야한다.
//		if (board_num == null) {
//			board_num = 0;
//		  }
		ManagerService1 ms = new ManagerService1();
		List<FreeBoardDomain> fdList =  ms.printFreeBoard(board_num);
		model.addAttribute("freeBoardData2", fdList.get(0));
		//System.out.println(board_num);
	List<BoardCommentDomain> bclist = ms.printFreeBoardComment(board_num);
	model.addAttribute("freeBoardCMTData", bclist);
		
		return "manager/messageQNALookFrm3";
	}//messageQNALookFrm3
	
	@GetMapping("manager/messageQNALookFrm3_process.do")
	public String messageQNALookFrm3Process(BoardCommentVO bcVO, Model model) {
		ManagerService1 ms = new ManagerService1();
		Boolean boardCommentFlag =  ms.addBoardComment(bcVO);
		model.addAttribute("boardCommentFlag", boardCommentFlag);
		
		return "manager/messageQNALookFrm3_process";
	}
	
	
	
	
}
	
