package kr.co.noveljoa.user.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.co.noveljoa.user.newnovel.NewNovelService;
import kr.co.noveljoa.user.newnovel.NewNovelVO;

@SessionAttributes({"num_member","id","name","photo"})

@Controller
public class MainController {

	@GetMapping("/test1.do")
	public String test(Model model) {
		
		model.addAttribute("num_member",1);
		model.addAttribute("id","aa");
		model.addAttribute("name","김기린");
		model.addAttribute("photo","a.png");
		
		return "redirect:/main.do";
	}

	@GetMapping("/main.do")
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
