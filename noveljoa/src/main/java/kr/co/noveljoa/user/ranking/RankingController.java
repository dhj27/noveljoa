package kr.co.noveljoa.user.ranking;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RankingController {
	
	
	@GetMapping("/ranking.do")
	public String test(@RequestParam(defaultValue = "0") int genre,@RequestParam(defaultValue = "1") int type,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		RankingService rs=ac.getBean(RankingService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		RankingVO rVO=new RankingVO(type, genre);
		List<RankingDomain> list=rs.search(rVO);
		
		model.addAttribute("list",list);
		model.addAttribute("type",type);
		model.addAttribute("genre",genre);
		
		return "home/ranking";
	}

}
