package kr.co.noveljoa.user.mylike;

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
public class MyLikeController {

	@PostMapping("/my_like.do")
	public String selectList(@RequestParam(defaultValue = "0") int type,@RequestParam(defaultValue = "") String search,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		MyLikeService mls=ac.getBean(MyLikeService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		int num_member=Integer.parseInt(model.getAttribute("num_member").toString());
		MyLikeVO mlVO=new MyLikeVO(num_member, type, search);
		List<MyLikeDomain> list=mls.search(mlVO);
		
		model.addAttribute("list",list);
		model.addAttribute("type",type);
		model.addAttribute("search",search);
		
		return "novel/my_like";
	}
	@PostMapping("/delete_like.do")
	public String delete(@RequestParam(defaultValue = "0") int type,@RequestParam(defaultValue = "") String search,int num_novel,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		MyLikeService mls=ac.getBean(MyLikeService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		int num_member=Integer.parseInt(model.getAttribute("num_member").toString());
		DeleteLikeVO dlVO=new DeleteLikeVO(num_member, num_novel);
		mls.delete(dlVO);
		MyLikeVO mlVO=new MyLikeVO(num_member, type, search);
		List<MyLikeDomain> list=mls.search(mlVO);
		
		model.addAttribute("list",list);
		model.addAttribute("type",type);
		model.addAttribute("search",search);
		
		return "novel/my_like";
	}

}
