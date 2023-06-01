package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.noveljoa.user.episode.service.CommentService;
import kr.co.noveljoa.user.episode.vo.CommentCheckMyVO;
import kr.co.noveljoa.user.episode.vo.CommentInsertVO;

@Controller
@SessionAttributes({"id","name","photo","num_member"}) //세션에 값 여러개 설정할 때
public class CommentController {
	
	@Autowired(required = false)
	CommentService commentService;
	
	// 댓글 창
	@GetMapping("/comment.do")
	public String showComment(CommentCheckMyVO ccMyVO, Model model) {
		if(model.getAttribute("num_member") == null) {
			return "redirect:loginpage.do";
		}
		
		int num_member = (Integer)model.getAttribute("num_member");
		String id = (String)model.getAttribute("id");
		
		ccMyVO.setNum_member(num_member);
		
		model.addAttribute("id", id);
		model.addAttribute("cvo", ccMyVO);
		model.addAttribute("title", commentService.epTitle(ccMyVO.getNum_episode()));
		model.addAttribute("selectAllCmt", commentService.searchAllCmt(ccMyVO.getNum_episode()));
		
		return "episode/comment";
	}
	

	@PostMapping("/comment_add.do") //ajax
	@ResponseBody
	public String addComment(CommentInsertVO ciVO, Model model) {
		int num_member = (Integer)model.getAttribute("num_member");
		
		ciVO.setNum_member(num_member); 
		return commentService.addCmt(ciVO);
	}
	
	@GetMapping("/comment_list.do")
	@ResponseBody
	public String listComment(int num_episode, Model model) {
		int num_member = (Integer)model.getAttribute("num_member");
		
		return commentService.searchAllCmt(num_episode);		
	}
	
	
}
