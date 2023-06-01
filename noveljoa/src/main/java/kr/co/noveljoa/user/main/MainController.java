package kr.co.noveljoa.user.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"num_member","id","name","photo"})

@Controller
public class MainController {

	@RequestMapping(value = "/main.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String test(@RequestParam(defaultValue = "0") int genre,Model model) {
			
			ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
			MainService ts=ac.getBean(MainService.class);
			((FileSystemXmlApplicationContext)ac).close();
			
			MainVO mVO=new MainVO(1, genre);
			List<MainDomain> list=ts.search(mVO);
			mVO.setType(7);
			List<MainDomain> list7=ts.search(mVO);
			mVO.setType(30);
			List<MainDomain> list30=ts.search(mVO);

			model.addAttribute("genre",genre);
			model.addAttribute("list",list);
			model.addAttribute("list7",list7);
			model.addAttribute("list30",list30);
			
			return "home/main";
	}

}
