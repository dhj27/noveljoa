package kr.co.noveljoa.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.noveljoa.admin.domain.MBoardDetailDomain;
import kr.co.noveljoa.admin.domain.MBoardDomain;
import kr.co.noveljoa.admin.domain.MCommentDomain;
import kr.co.noveljoa.admin.service.MBoardService;
import kr.co.noveljoa.admin.vo.MBoardCmtVO;
@Controller
public class MBoardController {
	@Autowired(required = false)
	private MBoardService mbs;
	
	//qna board list, search
	@GetMapping("/manager/messageQNABoardFrm.do")
	public String boardMFrm(String id, Model model) {
	    List<MBoardDomain> boardList;
	    
	    if (id != null) {
	        boardList = mbs.searchMessageBoard(id);
	    } else {
	        boardList = mbs.selectAllBoard();
	    }//end else
	    model.addAttribute("boardList", boardList);

	    return "manager/messageQNABoardFrm";
	}//boardMFrm
	
	//qna board detail, qna comment detail
	@GetMapping("/manager/messageQNALookFrm.do")
	public String selectDetail(@RequestParam(required = false) Integer boardNum, @RequestParam(required = false) Integer cmtNum, Model model) {
	    if (boardNum != null) {
	        MBoardDetailDomain qna = mbs.selectDetail(boardNum);
	        model.addAttribute("qna", qna);

	        List<MCommentDomain> cmtList = mbs.selectBoardMent(boardNum);
	        if (cmtNum != null) {
	            for (MCommentDomain comment : cmtList) {
	                comment.setCmtNum(cmtNum);
	            }//end for
	        }//end if
	        model.addAttribute("cmtList", cmtList);
	    }//end if
	    
	    return "manager/messageQNALookFrm";
	}//selectDetail
	
	//board delete
	@PostMapping("/manager/deleteBoard.do")
	public String removeMBoard(
			@RequestParam(required = false) Optional<Integer> boardNum, Model model) {
		if (boardNum.isPresent()) {
			model.addAttribute("deleteBoardFlag", mbs.removeBoard(boardNum.get()));
		}//end if
		
		return "manager/deleteBoard";
	}//removeMBoard

	//comment insert
	@PostMapping("/manager/insertComment.do")
	public String insertBoardMent(MBoardCmtVO mbcVO, Model model) {
		boolean insertCommentFlag=mbs.enrollMent(mbcVO);
		model.addAttribute("insertCommentFlag", insertCommentFlag);
		
		return "manager/insertComment";
	}//insertBoardMent
	
	//comment modify
	@GetMapping("/manager/modifyQNALookFrm.do")
	public String modifyQNALookFrm() {
		return "manager/modifyQNALookFrm";
	}// modifyQNALookFrm
	
	@GetMapping("/manager/modifyComment.do")
	public String updateBoardMent(MBoardCmtVO mbcVO, Model model) {
	    boolean modifyCommentFlag = mbs.editMent(mbcVO);
	    model.addAttribute("modifyCommentFlag", modifyCommentFlag);
	    
	    return "manager/modifyComment";
	}//updateBoardMent

	//comment delete
	@PostMapping("/manager/deleteComment.do")
	public String removeMMent(MBoardCmtVO mbcVO, Model model) {
		boolean deleteCommentFlag=mbs.removeMent(mbcVO);
		model.addAttribute("deleteCommentFlag", deleteCommentFlag);
		
		return "manager/deleteComment";
	}//removeMMent
	

}
