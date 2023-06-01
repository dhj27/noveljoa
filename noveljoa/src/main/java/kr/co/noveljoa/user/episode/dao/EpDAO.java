package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.dao.MyBatisHandler;
import kr.co.noveljoa.user.episode.domain.EpListDomain;
import kr.co.noveljoa.user.episode.domain.EpLookDomain;
import kr.co.noveljoa.user.episode.domain.NovelDomain;
import kr.co.noveljoa.user.episode.vo.EpBmVO;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;
import kr.co.noveljoa.user.episode.vo.ReportVO;

@Component
public class EpDAO {
	
	String map = "kr.co.noveljoa.user.episode.episodeMapper.";
	
	
	// 소설 내용 보여주기
	public NovelDomain selectNovel(int novelNum) {
		NovelDomain nd = null;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		nd = ss.selectOne(map+"selectNovel", novelNum);
		
		if( ss != null) { ss.close(); }
		
		return nd;
	}// searchNovel

	
	// 에피소드 리스트
	public List<EpListDomain> selectEpisodeList(int num_novel) {
		
		List<EpListDomain> list = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list = ss.selectList(map+"selectEpList", num_novel);
		
		if( ss != null) { ss.close(); }
		
		return list;
	}// searchEpList
	
	
	// 에피소드 내용 
	public EpLookDomain selectEpisode(EpCheckVO epCheckVO) {
		EpLookDomain ed = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		ed = ss.selectOne(map+"selectEp", epCheckVO);
		
//		ed.setNum_novel( epCheckVO.getNum_novel());
//		ed.setNum_member(epCheckVO.getNum_member());
//		ed.setNum_episode(epCheckVO.getNum_episode());
		
		if( ss != null) { ss.close(); }
		
		return ed;
	}// searchEp
	
	
	public int selectLikeCnt(int num_novel) {
		int cnt = 0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		cnt = ss.selectOne(map+"selectLikeCnt", num_novel);
		
		if( ss != null) { ss.close(); }
		
		return cnt;
	}
	
	// 좋아요 했는지 화면에 표시
	public int selectLike(NovelCheckVO nCheckVO) {
		int cnt = 0;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		cnt = ss.selectOne(map+"selectLike", nCheckVO);
		
		if( ss != null) { ss.close(); }
		
		return cnt;
	}
	
	// 신고 했는지 화면에 표시
	public int selectReport(ReportVO reportVO) {
		int cnt = 0;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		cnt = ss.selectOne(map+"selectReport", reportVO);
		
		if( ss != null) { ss.close(); }
		
		return cnt;
	}
	
	
	// 첫 화
	public int selectFirstEpisode(int num_novel) {
		int cnt = 0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		cnt = ss.selectOne(map+"selectEpFirst", num_novel);
		
		if( ss != null) { ss.close(); }
		
		return cnt;
	}// selectFirstEpisode
	
	
	// 이전화
	public int selectPrevEpisode(EpCheckVO epCheckVO) {
		int cnt = 0;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		cnt = ss.selectOne(map+"selectEpPrev", epCheckVO);

		if( ss != null) { ss.close(); }
		
		return cnt;
	}// selectPrevEpisode
	
	
	// 다음화
	public int selectNextEpisode(EpCheckVO epCheckVO) {
		int cnt = 0;
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		cnt = ss.selectOne(map+"selectEpNext", epCheckVO);

		if( ss != null) { ss.close(); }
		
		return cnt;
	}// selectNextEpisode
	
	
	// 조회수 증가
	public int updateViewsEpisode(int epNum) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.update(map+"updateViews", epNum);
		
		if(cnt == 1) {
			System.out.println("episode view");
			ss.commit();
		}else {
			System.out.println("episode view rollback");
			ss.rollback();
		}

		if( ss != null) { ss.close(); }
		
		return cnt;
	}// viewsEp
	
	
	// 좋아요 추가
	public int insertLike(NovelCheckVO nCheckVO) throws PersistenceException{
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.insert(map+"insertLike", nCheckVO);
		
		if(cnt == 1) {
			System.out.println("episode like");
			ss.commit();
		}else {
			System.out.println("episode like rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		
		return cnt;
	}// addLike
	
	
	// 좋아요 취소
	public int deleteLike(NovelCheckVO nCheckVO) throws PersistenceException {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.delete(map+"deleteLike", nCheckVO);
		
		if(cnt == 1) {
			System.out.println("episode like cancel");
			ss.commit();
		}else {
			System.out.println("episode like cancel rollback");
			ss.rollback();
		}

		if( ss != null) { ss.close(); }
		
		return cnt;
	}// cancelLike
	
	
	// 신고 추가
	public int insertReport(NovelReportVO nReportVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.insert(map+"insertReport", nReportVO);
		
		if(cnt == 1) {
			System.out.println("episode report");
			ss.commit();
		}else {
			System.out.println("episode report rollback");
			ss.rollback();
		}

		if( ss != null) { ss.close(); }
		
		return cnt;
	}// addReport
	
	
	// 북마크 추가
	public int insertBookmark(EpBmVO epBmVO) throws PersistenceException {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.insert(map+"insertBookmark", epBmVO);
		
		if(cnt == 1) {
			System.out.println("episode bookmark");
			ss.commit();
		}else {
			System.out.println("episode bookmark rollback");
			ss.rollback();
		}

		if( ss != null) { ss.close(); }
		
		return cnt;
	}// addBookmark
	
	
	// 북마크 취소
	public int deleteBookmark(EpBmVO epBmVO) throws PersistenceException {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.delete(map+"deleteBookmark", epBmVO);
		
		if(cnt == 1) {
			System.out.println("episode bookmark");
			ss.commit();
		}else {
			System.out.println("episode bookmark rollback");
			ss.rollback();
		}

		if( ss != null) { ss.close(); }
		
		return cnt;
	}// cancelBookmark
	
}
