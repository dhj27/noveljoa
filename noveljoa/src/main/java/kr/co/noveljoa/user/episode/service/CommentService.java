package kr.co.noveljoa.user.episode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.admin.domain.CommentDomain;
import kr.co.noveljoa.user.episode.dao.CommentDAO;
import kr.co.noveljoa.user.episode.vo.CommentCheckMyVO;
import kr.co.noveljoa.user.episode.vo.CommentInsertVO;

@Component
public class CommentService {
	
	@Autowired(required = false)
	private CommentDAO cDAO;
	
	public int addCmt(CommentInsertVO cmtInsertVO) {
		int cnt = cDAO.insertComment(cmtInsertVO);
		return cnt;
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
	
	public CommentDomain searchCmt(CommentCheckMyVO ccMyVO) {
		CommentDomain cd = cDAO.selectComment(ccMyVO);
		return cd;
	}
	
	public List<CommentDomain> searchAllCmt(int num_episode){
		List<CommentDomain> list = cDAO.selectAllComment(num_episode);
		return list;
	}
	
}
