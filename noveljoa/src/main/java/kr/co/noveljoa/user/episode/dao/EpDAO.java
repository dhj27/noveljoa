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
	
	// �Ҽ����� �����ֱ�
	public NovelDomain selectNovel(int novelNum) {
		NovelDomain nd = new NovelDomain();
		
		
		return null;
	}// searchNovel
	
	
	// ���Ǽҵ� ����Ʈ ajax
	public List<EpListDomain> selectEpisodeList(EpListVO epListVO) {
		return null;
	}// searchEpList
	
	
	// ���Ǽҵ� ���� ajax
	public EpLookDomain selectEpisode(EpCheckVO epCheckVO) {
		return null;
	}// searchEp
	
	
	// ù ȭ
	public EpLookDomain selectFirstEpisode(int novelNum) {
		return null;
	}// firstEp
	
	
	// ����, ����ȭ
	public EpLookDomain selectPrevNextEpisode(EpCheckVO epCheckVO) {
		return null;
	}// prevNextEp
	
	
	// ��ȸ�� ����	
	public int updateViewsEpisode(int epNum) {
		return epNum;
	}// viewsEp
	
	
	// ���ƿ� �߰�
	public int insertLike(NovelCheckVO nCheckVO) {
		//1. MyBatis Handler ���
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler ���
		int cnt = ss.insert("kr.co.sist.testMapper2.insertEmp", nCheckVO);
		
		//3. transaction �Ϸ�
		if(cnt == 1) {
			ss.commit();
		}
		
		//4. ���� ����
		if( ss != null) { ss.close(); }
		return cnt;
	}// addLike
	
	
	// ���ƿ� ����
	public int deleteLike(NovelCheckVO nCheckVO) {
		return 0;
	}// cancelLike
	
	
	// �Ű� �߰�
	public int insertReport(NovelReportVO nReportVO ) {
		return 0;
	}// addReport
	
	
	// �ϸ�ũ �߰�
	public int insertBookmark(EpCheckVO epCheckVO) {
		return 0;
	}// addBookmark
	
	
	// �ϸ�ũ ����
	public int deleteBookmark(EpCheckVO epCheckVO) {
		return 0;
	}// cancelBookmark
	
}
