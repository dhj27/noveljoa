package kr.co.noveljoa.user.search;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
	
	
	@GetMapping("/search.do")
	public String test(@RequestParam(defaultValue = "0") int genre,@RequestParam(defaultValue = "0") int type,@RequestParam(defaultValue = "") String search, Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		SearchService ss=ac.getBean(SearchService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		SearchVO sVO=new SearchVO(type, genre, search);
		List<SearchDomain> list=ss.search(sVO);
		
		model.addAttribute("list",list);
		model.addAttribute("type",type);
		model.addAttribute("genre",genre);
		model.addAttribute("search",search);
		
		return "home/search";
	}

}
