package kr.co.noveljoa.user.mybookmark;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"num_member","id","name","photo"})

@Controller
public class MyBookmarkController {

	@PostMapping("/my_bookmark.do")
	public String selectList(@RequestParam(defaultValue = "0") int type,@RequestParam(defaultValue = "") String search,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		MyBookmarkService mbs=ac.getBean(MyBookmarkService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		int num_member=Integer.parseInt(model.getAttribute("num_member").toString());
		MyBookmarkVO mbVO=new MyBookmarkVO(num_member, type, search);
		List<MyBookmarkDomain> list=mbs.search(mbVO);
		
		model.addAttribute("list",list);
		model.addAttribute("type",type);
		model.addAttribute("search",search);
		
		return "novel/my_bookmark";
	}
	@PostMapping("/delete_bookmark.do")
	public String delete(@RequestParam(defaultValue = "0") int type,@RequestParam(defaultValue = "") String search,int num_episode,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		MyBookmarkService mbs=ac.getBean(MyBookmarkService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		int num_member=Integer.parseInt(model.getAttribute("num_member").toString());
		DeleteBookmarkVO dbVO=new DeleteBookmarkVO(num_member, num_episode);
		mbs.delete(dbVO);
		MyBookmarkVO mlVO=new MyBookmarkVO(num_member, type, search);
		List<MyBookmarkDomain> list=mbs.search(mlVO);
		
		model.addAttribute("list",list);
		model.addAttribute("type",type);
		model.addAttribute("search",search);
		
		return "novel/my_bookmark";
	}

}
