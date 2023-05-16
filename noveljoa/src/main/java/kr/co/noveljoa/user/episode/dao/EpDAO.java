package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import kr.co.noveljoa.user.episode.domain.EpListDomain;
import kr.co.noveljoa.user.episode.domain.EpLookDomain;
import kr.co.noveljoa.user.episode.domain.NovelLookDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

public class EpDAO {
	
	// �Ҽ����� �����ֱ�
	public NovelLookDomain selectNovel(int novelNum) {
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
	public void updateViewsEpisode(int epNum) {
	}// viewsEp
	
	
	// ���ƿ� �߰�
	public void insertLike(NovelCheckVO nCheckVO) {
	}// addLike
	
	
	// ���ƿ� ����
	public int deleteLike(NovelCheckVO nCheckVO) {
		return 0;
	}// cancelLike
	
	
	// �Ű� �߰�
	public void insertReport(NovelReportVO nReportVO ) {
	}// addReport
	
	
	// �ϸ�ũ �߰�
	public void insertBookmark(EpCheckVO epCheckVO) {
	}// addBookmark
	
	
	// �ϸ�ũ ����
	public int deleteBookmark(EpCheckVO epCheckVO) {
		return 0;
	}// cancelBookmark
	
}
