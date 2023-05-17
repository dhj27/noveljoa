package kr.co.noveljoa.user.novel.service;

import java.util.ArrayList;
import java.util.List;

import kr.co.noveljoa.user.novel.dao.NovelDAO;
import kr.co.noveljoa.user.novel.vo.NovelVO;

public class NovelService {
	
	private NovelDAO nDAO;
	
	public NovelService(NovelDAO nDAO) {
		this.nDAO=nDAO;
	}
	public int search(NovelVO nVO){
		int cnt=nDAO.insertNovel(nVO);
		
		return cnt;
	}

}
