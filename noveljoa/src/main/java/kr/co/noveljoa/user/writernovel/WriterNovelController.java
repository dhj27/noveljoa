package kr.co.noveljoa.user.writernovel;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.co.noveljoa.user.newnovel.NewNovelService;
import kr.co.noveljoa.user.newnovel.NewNovelVO;
import kr.co.noveljoa.user.noveledit.EditNovelService;
import kr.co.noveljoa.user.noveledit.EditNovelVO;

@Controller
public class WriterNovelController {
	
	@RequestMapping(value = "/writer_novel.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String writerNovel(int num_novel,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		WriterNovelService wns=ac.getBean(WriterNovelService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		WriterNovelDomain wnd=wns.search(num_novel);
		int cntEp=wns.countEp(num_novel);
		model.addAttribute("wnd",wnd);
		model.addAttribute("cntEp",cntEp);
		model.addAttribute("num_novel",num_novel);
		
		return "novel/writer_novel";
	}
	
	@PostMapping("/edit_novel.do")
	public String editNovel(int num_novel,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		WriterNovelService wns=ac.getBean(WriterNovelService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		WriterNovelDomain wnd=wns.search(num_novel);
		model.addAttribute("wnd",wnd);
		model.addAttribute("num_novel",num_novel);
		
		return "novel/edit_novel";
	}
	
	@PostMapping("/edit_novel_sub.do")
	public String editNovelSub(HttpServletRequest request,Model model) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		EditNovelService ens=ac.getBean(EditNovelService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
//		String resourceDir = request.getSession().getServletContext().getRealPath("/_next/static/images/novel_thumb");
		File saveDir=new File("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/_next/static/images/novel_thumb");
		int fileSize=1024*1024*30;	//30mb
		int num_novel=0;
		
		try {
			MultipartRequest mr=new MultipartRequest(request, saveDir.getAbsolutePath(), fileSize, "UTF-8", new DefaultFileRenamePolicy());
			
			int age=Integer.parseInt(mr.getParameter("age"));
			int open=Integer.parseInt(mr.getParameter("open"));
			int genre=Integer.parseInt(mr.getParameter("genre"));
			int end=Integer.parseInt(mr.getParameter("end"));
			num_novel=Integer.parseInt(mr.getParameter("num_novel"));
			String title=mr.getParameter("title");
			String story=mr.getParameter("story");

			String hidden=mr.getParameter("filephoto");
			String photoName=mr.getFilesystemName("upphoto");
			
			if(photoName==null){	//update 이미지가 없다면 photoName을 기존과 같은 값으로 바꾼다
				photoName=hidden;
			}else if(hidden.equals("photo_default.png")){
			}else{	//update 이미지가 있다면 기존에 저장된 이미지를 지운다
				File uploadFile=new File(saveDir.getAbsolutePath()+"/"+hidden);
				uploadFile.delete();
			}
			
			EditNovelVO enVO=new EditNovelVO(num_novel, age, open, genre, end, title, photoName, story);
			ens.insert(enVO);
			
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		return "forward:writer_novel.do?num_novel="+num_novel;
	}
	
	@PostMapping("/delete_novel_popup.do")
	public String deleteNovelPopup(int num_novel,Model model) {
		
		model.addAttribute("num_novel",num_novel);
		
		return "novel/delete_novel_popup";
	}
	
	@ResponseBody
	@PostMapping("/delete_novel_process.do")
	public String deleteNovel(int num_novel) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		EditNovelService ens=ac.getBean(EditNovelService.class);
		((FileSystemXmlApplicationContext)ac).close();

		JSONObject jsonTemp = new JSONObject();
		
		jsonTemp.put("data", ens.delete(num_novel));
		
		return jsonTemp.toJSONString();
	}
	
	@ResponseBody
	@PostMapping("/select_ep_list.do")
	public String selectEpList(int num_novel) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("C:/Users/user/git/noveljoa/noveljoa/src/main/webapp/WEB-INF/spring/root-context.xml");
		WriterNovelService ens=ac.getBean(WriterNovelService.class);
		((FileSystemXmlApplicationContext)ac).close();
		
		List<EpDomain> list=ens.selectAllEp(num_novel);
		
		JSONArray jsonArr=new JSONArray();
		JSONObject jsonTemp = null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		for(EpDomain ed:list) {
			jsonTemp=new JSONObject();
			
			jsonTemp.put("num_novel", ed.getNum_novel());
			jsonTemp.put("num_episode", ed.getNum_episode());
			jsonTemp.put("title", ed.getTitle());
			jsonTemp.put("visit", ed.getVisit());
			jsonTemp.put("make", sdf.format(ed.getMake()));
			
			jsonArr.add(jsonTemp);
		}
		
		return jsonArr.toJSONString();
	}

}
