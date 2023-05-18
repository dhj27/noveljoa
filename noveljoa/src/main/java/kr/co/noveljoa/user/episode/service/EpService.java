package kr.co.noveljoa.user.episode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.episode.dao.EpDAO;
import kr.co.noveljoa.user.episode.domain.EpLookDomain;
import kr.co.noveljoa.user.episode.domain.NovelDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

@Component
public class EpService {
	
	@Autowired(required = false)
	private EpDAO eDAO;
	
	// �Ҽ����� �����ֱ�
	public NovelDomain searchNovel(int novelNum) {
		NovelDomain nd = new NovelDomain();
		
		
		return nd;
	}// searchNovel
	
	// �Ҽ� ���ƿ�
	public int searchNovelLike(int userNum) {
		
		return 0;
	}//searchNovelLike
	
	// �Ҽ� �Ű�
	public int searchNovelReport(int userNum) {
		
		return 0;
	}//searchNovelLike
	
	// ���Ǽҵ� ����Ʈ ajax
	public String searchEpList(EpListVO epListVO) {
		return "";
	}// searchEpList
	
	
	// ���Ǽҵ� ���� ajax
	public EpLookDomain searchEp(EpCheckVO epCheckVO) {
		return null;
	}// searchEp
	
	
	// ù ȭ
	public EpLookDomain firstEp(int novelNum) {
		return null;
	}// firstEp
	
	
	// ����, ����ȭ
	public String prevNextEp(EpCheckVO epCheckVO) {
		return "";
	}// prevNextEp
	
	
	// ��ȸ�� ����	
	public String viewsEp(int epNum) {
		return "";
	}// viewsEp
	
	
	// ���ƿ� �߰�
	public String addLike(NovelCheckVO nCheckVO) {
		return "";
	}// addLike
	
	
	// ���ƿ� ����
	public String cancelLike(NovelCheckVO nCheckVO) {
		return "";
	}// cancelLike
	
	
	// �Ű� �߰�
	public String addReport(NovelReportVO nReportVO ) {
		return "";
	}// addReport
	
	
	// �ϸ�ũ �߰�
	public String addBookmark(EpCheckVO epCheckVO) {
		return "";
	}// addBookmark
	
	
	// �ϸ�ũ ����
	public String cancelBookmark(EpCheckVO epCheckVO) {
		return "";
	}// cancelBookmark

}
