package kr.co.noveljoa.user.episode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.episode.dao.CommentDAO;
import kr.co.noveljoa.user.episode.vo.CommentInsertVO;

@Component
public class CommentService {
	
	@Autowired(required = false)
	private CommentDAO cDAO;
	
	public int addComment(CommentInsertVO cmtInsertVO) {
		
		
		return 0;
	}

}
