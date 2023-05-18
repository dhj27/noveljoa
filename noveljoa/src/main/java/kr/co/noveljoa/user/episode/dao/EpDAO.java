package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.admin.dao.ManagerMyBatisHandler;
import kr.co.noveljoa.user.episode.domain.EpListDomain;
import kr.co.noveljoa.user.episode.domain.EpLookDomain;
import kr.co.noveljoa.user.episode.domain.NovelDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

@Component
public class EpDAO {
	
	// 소설내용 보여주기
	public NovelDomain selectNovel(int novelNum) {
		NovelDomain nd = new NovelDomain();
		
		
		return null;
	}// searchNovel
	
	
	// 에피소드 리스트 ajax
	public List<EpListDomain> selectEpisodeList(EpListVO epListVO) {
		return null;
	}// searchEpList
	
	
	// 에피소드 내용 ajax
	public EpLookDomain selectEpisode(EpCheckVO epCheckVO) {
		return null;
	}// searchEp
	
	
	// 첫 화
	public EpLookDomain selectFirstEpisode(int novelNum) {
		return null;
	}// firstEp
	
	
	// 이전, 다음화
	public EpLookDomain selectPrevNextEpisode(EpCheckVO epCheckVO) {
		return null;
	}// prevNextEp
	
	
	// 조회수 증가	
	public int updateViewsEpisode(int epNum) {
		return epNum;
	}// viewsEp
	
	
	// 좋아요 추가
	public int insertLike(NovelCheckVO nCheckVO) {
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler 사용
		int cnt = ss.insert("kr.co.sist.testMapper2.insertEmp", nCheckVO);
		
		//3. transaction 완료
		if(cnt == 1) {
			ss.commit();
		}
		
		//4. 연결 끊기
		if( ss != null) { ss.close(); }
		return cnt;
	}// addLike
	
	
	// 좋아요 삭제
	public int deleteLike(NovelCheckVO nCheckVO) {
		return 0;
	}// cancelLike
	
	
	// 신고 추가
	public int insertReport(NovelReportVO nReportVO ) {
		return 0;
	}// addReport
	
	
	// 북마크 추가
	public int insertBookmark(EpCheckVO epCheckVO) {
		return 0;
	}// addBookmark
	
	
	// 북마크 삭제
	public int deleteBookmark(EpCheckVO epCheckVO) {
		return 0;
	}// cancelBookmark
	
}
