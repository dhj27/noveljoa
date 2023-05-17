package kr.co.noveljoa.user.novel.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.noveljoa.user.novel.service.NovelService;
import kr.co.noveljoa.user.novel.vo.NovelVO;

@SessionAttributes({"name","age","list"})

@Controller
public class NovelController {
	
	@GetMapping("/novel_test.do")
	public String test(NovelVO nVO, Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		
		NovelService ts=ac.getBean(NovelService.class);
		int list=ts.search(nVO);
		
		model.addAttribute("name",nVO.getName());
		model.addAttribute("age",nVO.getAge());
		model.addAttribute("list",list);
		
		return "novel/novel_test";
	}

}
