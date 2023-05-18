package kr.co.noveljoa.user.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/main.do")
	public String test(int genre,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		
		MainService ts=ac.getBean(MainService.class);
		MainVO mVO=new MainVO(1, genre);
		List<MainDomain> list=ts.search(mVO);
		mVO.settype(7);
		List<MainDomain> list7=ts.search(mVO);
		mVO.settype(30);
		List<MainDomain> list30=ts.search(mVO);
		
		model.addAttribute("list",list);
		model.addAttribute("list7",list7);
		model.addAttribute("list30",list30);
		
		return "home/main";
	}

}
