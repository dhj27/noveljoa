package kr.co.noveljoa.user.episode.service;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.episode.dao.EpDAO;
import kr.co.noveljoa.user.episode.domain.EpListDomain;
import kr.co.noveljoa.user.episode.domain.EpLookDomain;
import kr.co.noveljoa.user.episode.domain.NovelDomain;
import kr.co.noveljoa.user.episode.vo.EpBmVO;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;
import kr.co.noveljoa.user.episode.vo.ReportVO;

@Component
public class EpService {
	
	@Autowired(required = false)
	private EpDAO eDAO;
	
	// 소설 내용 보여주기
	public NovelDomain searchNovel(int num_novel) {
		NovelDomain nd = eDAO.selectNovel(num_novel);		
		
		return nd;
	}// searchNovel
	

	// 에피소드 리스트 ajax
	public List<EpListDomain> searchEpList(int num_novel) {
		List<EpListDomain> list = eDAO.selectEpisodeList(num_novel);
		return list;
	}// searchEpList
	
	
	// 에피소드 상세 내용
	public EpLookDomain searchEp(EpCheckVO epCheckVO) {
		EpLookDomain eld = eDAO.selectEpisode(epCheckVO);
		return eld;
	}// searchEp
	
	
	public int cntLike(int num_novel) {
		int cnt = eDAO.selectLikeCnt(num_novel);
		return cnt;
	}
	
	// 소설 좋아요 선택
	public int searchLike(NovelCheckVO nCheckVO) {
		int cnt = eDAO.selectLike(nCheckVO);
		return cnt;
	}//searchNovelLike
	
	// 소설 신고 선택
	public int searchReport(ReportVO reportVO) {
		int cnt = eDAO.selectReport(reportVO);
		return cnt;
	}//searchNovelLike
	
	
	// 첫 화
	public int firstEp(int num_novel) {
		int cnt = eDAO.selectFirstEpisode(num_novel);
		return cnt;
	}// firstEp
	
	
	// 이전화
	public int prevEp(EpCheckVO epCheckVO) {
		int cnt = eDAO.selectPrevEpisode(epCheckVO);
		return cnt;
	}// prevNextEp
	
	
	// 다음화
	public int nextEp(EpCheckVO epCheckVO) {
		int cnt = eDAO.selectNextEpisode(epCheckVO);
		return cnt;
	}// prevNextEp
	
	
	// 조회수 증가
	public int viewsEp(int epNum) {
		int views = eDAO.updateViewsEpisode(epNum);
		return views;
	}// viewsEp
	
	
	// 좋아요 추가
	public String addLike(NovelCheckVO nCheckVO) {
		
		int likes = 0;
		JSONObject json=new JSONObject();
		try {
			likes=eDAO.insertLike(nCheckVO);
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}
		json.put("jobType", "add");
		json.put("likeFlag", likes);
		return json.toJSONString();
	}// addLike
	
	
	// 좋아요 취소
	public String cancelLike(NovelCheckVO nCheckVO) {
		int likes = 0;
		JSONObject json=new JSONObject();
		
		try {
			likes=eDAO.deleteLike(nCheckVO);
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}
		
		json.put("jobType", "cancel");
		json.put("likeFlag", likes==1?0:1);
		return json.toJSONString();
	}// cancelLike
	
	
	// 신고 추가
	public int addReport(NovelReportVO nReportVO ) {
		int reports = eDAO.insertReport(nReportVO);
		return reports;
	}// addReport

	
	
	// 북마크 추가
	public String addBookmark(EpBmVO epBmVO) {
		int bookmark = 0;
		JSONObject json = new JSONObject();
		
		try {
			bookmark = eDAO.insertBookmark(epBmVO);
		}catch (PersistenceException e) {
			e.printStackTrace();
		}
		json.put("jobType", "add");
		json.put("bookmarkFlag", bookmark);
		return json.toJSONString();
	}// addBookmark
	
	
	// 북마크 취소
	public String cancelBookmark(EpBmVO epBmVO) {
		int bookmark = 0;
		JSONObject json = new JSONObject();
		
		try {
			bookmark = eDAO.deleteBookmark(epBmVO);
		}catch (PersistenceException e) {
			e.printStackTrace();
		}
		json.put("jobType", "cancel");
		json.put("likeFlag", bookmark==1?0:1);
		return json.toJSONString();
	}// cancelBookmark

}
