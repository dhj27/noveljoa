package kr.co.noveljoa.user.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.noveljoa.user.episode.service.CommentService;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;

@Controller
@SessionAttributes({"id","name","photo","num_member"}) //세션에 값 여러개 설정할 때
public class CommentController {
	
	@Autowired(required = false)
	CommentService commentService;
	
	// 댓글 
	@GetMapping("/comment.do")
	public String showComment(@RequestParam int num_episode, EpCheckVO ecVO, Model model) {
		if(model.getAttribute("num_member") == null) {
			return "redirect:loginpage.do";
		}
			
		int num_member = (Integer)model.getAttribute("num_member");
		String id = (String)model.getAttribute("id");
		model.addAttribute("id", id);
		model.addAttribute("title", commentService.epTitle(num_episode));
		model.addAttribute("selectAllCmt", commentService.searchAllCmt(num_episode));
		
		return "episode/comment";
	}
	
	
	
	

}
