package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.dao.MyBatisHandler;
import kr.co.noveljoa.user.episode.domain.EpListDomain;
import kr.co.noveljoa.user.episode.domain.EpLookDomain;
import kr.co.noveljoa.user.episode.domain.NovelDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

@Component
public class EpDAO {
	
	String map = "kr.co.noveljoa.user.episode.episodeMapper.";
	
	
	// 소설 내용 보여주기
	public NovelDomain selectNovel(int novelNum) {
		NovelDomain nd = null;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		nd = ss.selectOne(map+"selectNovel", novelNum);
		System.out.println("dao selectNovel: "+novelNum);
		return nd;
	}// searchNovel
	
	
	// 좋아요 했는지 화면에 표시
	public int selectLike(NovelCheckVO nCheckVO) {
		int cnt = 0;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		cnt = ss.selectOne(map+"selectLike", nCheckVO);
		System.out.println("dao selectLike: "+nCheckVO);
		return cnt;
	}
	
	// 신고 했는지 화면에 표시
	public int selectReport(NovelCheckVO nCheckVO) {
		int cnt = 0;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		cnt = ss.selectOne(map+"selectReport", nCheckVO);
		System.out.println("dao selectReport: "+nCheckVO);
		return cnt;
	}
	
	
	// 에피소드 리스트
	public List<EpListDomain> selectEpisodeList(EpListVO epListVO) {
		
		List<EpListDomain> list = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list = ss.selectList(map+"selectEpList", epListVO);
		
		if( ss != null) { ss.close(); }
		return list;
	}// searchEpList
	
	
	// 에피소드 내용 
	public EpLookDomain selectEpisode(EpCheckVO epCheckVO) {
		EpLookDomain ed = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		ed = ss.selectOne(map+"selectEp", epCheckVO);
		
		return ed;
	}// searchEp
	
	
	// 첫 화
	public EpLookDomain selectFirstEpisode(int num_novel) {
		EpLookDomain ed = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		ed = ss.selectOne(map+"selectEpFirst", num_novel);
		
		return ed;
	}// firstEp
	
	
	// 이전화
	public EpLookDomain selectPrevEpisode(EpCheckVO epCheckVO) {
		EpLookDomain ed = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		ed = ss.selectOne(map+"selectEpPrev", epCheckVO);
		
		return ed;
	}// prevNextEp
	
	
	// 다음화
	public EpLookDomain selectNextEpisode(EpCheckVO epCheckVO) {
		EpLookDomain ed = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		ed = ss.selectOne(map+"selectEpNext", epCheckVO);
		
		return ed;
	}// prevNextEp
	
	
	// 조회수 증가
	public int updateViewsEpisode(int epNum) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.update(map+"updateViews", epNum);
		
		if(cnt == 1) {
			System.out.println("episode view +");
			ss.commit();
		}else {
			System.out.println("episode view rollback");
			ss.rollback();
		}
		
		return cnt;
	}// viewsEp
	
	
	// 좋아요 추가
	public int insertLike(NovelCheckVO nCheckVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.insert(map+"insertLike", nCheckVO);
		
		if(cnt == 1) {
			System.out.println("episode like commit");
			ss.commit();
		}else {
			System.out.println("episode like rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}// addLike
	
	
	// 좋아요 취소
	public int deleteLike(NovelCheckVO nCheckVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.delete(map+"deleteLike", nCheckVO);
		
		if(cnt == 1) {
			System.out.println("episode like cancel commit");
			ss.commit();
		}else {
			System.out.println("episode like cancel rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}// cancelLike
	
	
	// 신고 추가
	public int insertReport(NovelReportVO nReportVO ) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.insert(map+"insertReport", nReportVO);
		
		if(cnt == 1) {
			System.out.println("episode report commit");
			ss.commit();
		}else {
			System.out.println("episode report rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}// addReport
	
	
	// 북마크 추가
	public int insertBookmark(EpCheckVO epCheckVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.insert(map+"insertBookmark", epCheckVO);
		
		if(cnt == 1) {
			System.out.println("episode bookmark commit");
			ss.commit();
		}else {
			System.out.println("episode bookmark rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}// addBookmark
	
	
	// 북마크 취소
	public int deleteBookmark(EpCheckVO epCheckVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.delete(map+"deleteBookmark", epCheckVO);
		
		if(cnt == 1) {
			System.out.println("episode bookmark commit");
			ss.commit();
		}else {
			System.out.println("episode bookmark rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}// cancelBookmark
	
}
