package kr.co.noveljoa.user.novel.service;

import java.util.ArrayList;
import java.util.List;

import kr.co.noveljoa.user.novel.dao.NovelDAO;
import kr.co.noveljoa.user.novel.domain.NovelDomain;
import kr.co.noveljoa.user.novel.vo.NovelVO;

public class NovelService {
	
	private NovelDAO nDAO;
	
	public NovelService(NovelDAO nDAO) {
		this.nDAO=nDAO;
	}
	public int insert(NovelVO nVO){
		int cnt=nDAO.insertNovel(nVO);
		
		return cnt;
	}
	public List<NovelDomain> search() {
		List<NovelDomain> list=new ArrayList<NovelDomain>();
		
		list=nDAO.selectNovel();
		
		return list;
	}

}
