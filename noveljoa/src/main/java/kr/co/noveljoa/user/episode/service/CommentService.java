package kr.co.noveljoa.user.episode.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.episode.dao.CommentDAO;
import kr.co.noveljoa.user.episode.domain.CommentUserDomain;
import kr.co.noveljoa.user.episode.vo.CommentCheckMyVO;
import kr.co.noveljoa.user.episode.vo.CommentInsertVO;

@Component
public class CommentService {
	
	@Autowired(required = false)
	private CommentDAO cDAO;
	
	public String addCmt(CommentInsertVO cmtInsertVO) {
		
		int cmt = 0;
		JSONObject json=new JSONObject();
		try {
			cmt=cDAO.insertComment(cmtInsertVO);
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}
		json.put("jobType", "add");
		json.put("cmtFlag", cmt);
		
		return json.toJSONString();
	}
	
	public int editCmt(CommentCheckMyVO ccMyVO) {
		int cnt = cDAO.updateComment(ccMyVO);
		return cnt;
	}
	
	public int removeCmt(CommentCheckMyVO ccMyVO) {
		int cnt = cDAO.deleteComment(ccMyVO);
		return cnt;
	}
	
	public String epTitle(int num_episode) {
		String title = cDAO.selectEpTitle(num_episode);
		return title;
	}
	
	public CommentUserDomain searchCmt(CommentCheckMyVO ccMyVO) {
		CommentUserDomain cd = cDAO.selectComment(ccMyVO);
		return cd;
	}
	
	public String searchAllCmt(int num_episode){
		List<CommentUserDomain> list = cDAO.selectAllComment(num_episode);

		JSONArray jsonArr = new JSONArray();
		JSONObject json = null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		for(CommentUserDomain cud : list) {
			json = new JSONObject();
			
			json.put("comment_num", cud.getComment_num());
			json.put("id", cud.getId());
			json.put("num_episode", cud.getNum_episode());
			json.put("detail", cud.getDetail());
			json.put("make", sdf.format(cud.getMake()));
			
			jsonArr.add(json);
		}
		System.out.println("+++++++service"+jsonArr.toJSONString());
		return jsonArr.toJSONString();
	}
	
}
