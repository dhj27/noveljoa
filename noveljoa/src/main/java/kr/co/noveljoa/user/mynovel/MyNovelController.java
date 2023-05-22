package kr.co.noveljoa.user.mynovel;

import java.io.File;
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

@SessionAttributes({"user_num_member","user_id","user_name","user_photo"})

@Controller
public class MyNovelController {

	@GetMapping("/test.do")
	public String test(Model model) {
		
		model.addAttribute("user_num_member",2);
		model.addAttribute("user_id","aa");
		model.addAttribute("user_name","김기린");
		model.addAttribute("user_photo","a.png");
		
		return "redirect:/my_novel.do";
	}
	@GetMapping("/my_novel.do")
	public String myNovel(@RequestParam(defaultValue = "0") int order_novel,Model model) {
			
			ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
			MyNovelService mns=ac.getBean(MyNovelService.class);
			((FileSystemXmlApplicationContext)ac).close();
			
			MyNovelVO mnVO=new MyNovelVO(order_novel,model.getAttribute("user_num_member").toString());
			List<MyNovelDomain> list=mns.search(mnVO);

			model.addAttribute("list",list);
			model.addAttribute("order_novel",order_novel);
			
			return "novel/my_novel";
	}
	@PostMapping("/new_novel.do")
	public String newNovel() {
		
		return "novel/new_novel";
	}
	@PostMapping("/new_novel_sub.do")
	public String newNovelSub(HttpServletRequest request,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		NewNovelService nns=ac.getBean(NewNovelService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		String resourceDir = request.getSession().getServletContext().getRealPath("/_next/static/images/novel_thumb");
		File saveDir=new File(resourceDir);
		int fileSize=1024*1024*30;	//30mb
		
		try {
			MultipartRequest mr=new MultipartRequest(request, saveDir.getAbsolutePath(), fileSize, "UTF-8", new DefaultFileRenamePolicy());
			
			int user_num_member=Integer.parseInt(model.getAttribute("user_num_member").toString());
			int age=Integer.parseInt(mr.getParameter("age"));
			int open=Integer.parseInt(mr.getParameter("age"));
			int genre=Integer.parseInt(mr.getParameter("genre"));
			String title=mr.getParameter("title");
			String fileName=mr.getFilesystemName("filephoto");
			String story=mr.getParameter("story");
			
			NewNovelVO nnVO=new NewNovelVO(user_num_member,age, open, genre, title, fileName, story);
			nns.insert(nnVO);
			
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		return "redirect:/my_novel.do";
	}

}
