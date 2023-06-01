package kr.co.noveljoa.user.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.noveljoa.user.board.domain.BoardCommentDomain;
import kr.co.noveljoa.user.board.domain.FreeBoardDomain;
import kr.co.noveljoa.user.board.service.BoardService;
import kr.co.noveljoa.user.board.vo.BoardCommentVO;
import kr.co.noveljoa.user.board.vo.FreeBoardVO;
import kr.co.noveljoa.user.board.vo.updateBoardCommentVO;


@SessionAttributes({"num_member","id","name","photo"})
@Controller
public class boardController {
	
	@Autowired(required = false)
	private BoardService ms;
	

	@GetMapping("memQNALookListFrm.do")
	//@RequestMapping(value = "memQNALookListFrm.do", method = {RequestMethod.GET, RequestMethod.POST  })
	public String QNALookFrm(@RequestParam(name = "board_num", required = false) Integer board_num,
			 @RequestParam(name = "id", required = false) String id, Model model) {
		//기본자료형 int는 null로 선언할 수 없다.
		//자신의 로직 중 int에 null이 들어갈 수 있는 장소를 찾아내서 수정해줘야한다.
		if (board_num == null) {
			board_num = 0;
		  }
		String url = "";
		if( model.getAttribute("id")==null ) {
			url = "redirect:main.jsp";
		}else {
			url = "board/memQNALookListFrm";
		}
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		 paramMap.put("id",id);
		   paramMap.put("board_num", board_num);
		List<FreeBoardDomain> fdList =  ms.printFreeBoard(paramMap);
		model.addAttribute("freeBoardData", fdList);
		
		return url;
			
	}
	
	
	@GetMapping("memQNAWriteFrm.do")
	public String memQNAWriteFrm(Model model) {
		String url = "";
		if( model.getAttribute("id")==null ) {
			url = "redirect:main.jsp";
		}else {
			url = "board/memQNAWriteFrm";
		}
		
		return url;
	}
	
	@GetMapping("boardComplete.do")
	public String boardComplete(FreeBoardVO fVO, Model model ) {
		String url = "";
		if( model.getAttribute("id")==null ) {
			url = "redirect:main.jsp";
		}else {
			url = "board/boardComplete";
		}
		
		Boolean boardFlag = ms.addFreeBoard(fVO);
		model.addAttribute("boardFlag", boardFlag);
		return url;
	}
	
	@GetMapping("memQNALookFrm.do")
	public String memQNALookFrm(@RequestParam(name = "board_num", required = false) Integer board_num,
			 @RequestParam(name = "id", required = false) String id, Model model) {
		//@RequestParam(name = "board_num", required = false) Integer
		//기본자료형 int는 null로 선언할 수 없다.
		//자신의 로직 중 int에 null이 들어갈 수 있는 장소를 찾아내서 수정해줘야한다.
//		if (board_num == null) {
//			board_num = 0;
//		  }
		String url = "";
		if( model.getAttribute("id")==null ) {
			url = "redirect:main.jsp";
		}else {
			url = "board/memQNALookFrm";
		}
		
		ms.modifyBoardCnt(board_num);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		 paramMap.put("id",id);
		   paramMap.put("board_num", board_num);
		List<FreeBoardDomain> fdList =  ms.printFreeBoard(paramMap);
		model.addAttribute("freeBoardData2", fdList.get(0));
		//System.out.println(board_num);
	List<BoardCommentDomain> bclist = ms.printFreeBoardComment(board_num);
	model.addAttribute("freeBoardCMTData", bclist);
		
		return url;
	}//messageQNALookFrm
	
	@GetMapping("memQNALookFrm_process.do")
	public String memQNALookFrm_process(BoardCommentVO bcVO, Model model) {
		String url = "";
		if( model.getAttribute("id")==null ) {
			url = "redirect:main.jsp";
		}else {
			url = "board/memQNALookFrm_process";
		}
		
		Boolean boardCommentFlag =  ms.addBoardComment(bcVO);
		model.addAttribute("boardCommentFlag", boardCommentFlag);
		
		return url;
	}//messageQNALookFrm3Process
	
	
	@GetMapping("removeBoard.do")
	public String removeBoard(int board_num, Model model) {
		String url = "";
		if( model.getAttribute("id")==null ) {
			url = "redirect:main.jsp";
		}else {
			url = "board/removeBoard";
		}
		
		Boolean removeBoardFlag =  ms.removeBoard(board_num);
		model.addAttribute("removeBoardFlag", removeBoardFlag);
		
		return url;
	}//removeBoard
	
	@GetMapping("modifyBoardComment.do")
	public String modifyBoardComment( Model model) {
		
		String url = "";
		if( model.getAttribute("id")==null ) {
			url = "redirect:main.jsp";
		}else {
			url = "board/modifyBoardComment";
		}
		
		return url;
	}
	
	
	//클릭시 서브밋해 example 폼이 켜지고 거기에 수정을 작성해 그거에 대한 아래를 보내 바꿀거임 
	@GetMapping("modifyBoardComment_process.do")
	public String modifyBoardComment(updateBoardCommentVO ubcVO, Model model) {
		String url = "";
		if( model.getAttribute("id")==null ) {
			url = "redirect:main.jsp";
		}else {
			url = "board/modifyBoardComment_process";
		}
		
		Boolean modifyBoardCommentFlag =  ms.modifyBoardComment(ubcVO);
		model.addAttribute("modifyBoardCommentFlag", modifyBoardCommentFlag);
		
		return url;
	}//modifyBoard
	
	@GetMapping("removeBoardComment.do")
	public String removeBoardComment(int board_cmt_num, Model model) {
		String url = "";
		if( model.getAttribute("id")==null ) {
			url = "redirect:main.jsp";
		}else {
			url = "board/removeBoardComment";
		}
		
		Boolean removeBoardCommentFlag =  ms.removeBoardComment(board_cmt_num);
		System.out.println(board_cmt_num);
		model.addAttribute("board_cmt_num", board_cmt_num);
		model.addAttribute("removeBoardCommentFlag", removeBoardCommentFlag);
		
		
		return url;
	}//removeBoard
	
	
	
}
	
