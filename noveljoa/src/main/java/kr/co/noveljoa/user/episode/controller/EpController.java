package kr.co.noveljoa.user.episode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import kr.co.noveljoa.user.episode.vo.EpCheckVO;
import kr.co.noveljoa.user.episode.vo.EpListVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckVO;
import kr.co.noveljoa.user.episode.vo.NovelReportVO;

@Controller
public class EpController {
	
	// �Ҽ�-���Ǽҵ� ����Ʈ �����ֱ�
	@GetMapping("/novel.do")
	public String novelEpList() {
		return "novel";
	}// novelEpList
	
	
	// �Ҽ����� �����ֱ�
	//@GetMapping("")
	public String searchNovel(int novelNum, Model model) {
		return "";
	}// searchNovel
	
	
	// ���Ǽҵ� ����Ʈ ajax
	//@GetMapping("")
	public String searchEpList(EpListVO epListVO) {
		return "";
	}// searchEpList
	
	
	// ���Ǽҵ� ���� ajax
	//@GetMapping("")
	public String searchEp(EpCheckVO epCheckVO, Model model) {
		return "";
	}// searchEp
	
	
	// ù ȭ
	//@GetMapping("")
	public String firstEp(int novelNum, Model model) {
		return "";
	}// firstEp
	
	
	// ����, ����ȭ
	//@GetMapping("")
	public String prevNextEp(EpCheckVO epCheckVO, Model model) {
		return "";
	}// prevNextEp
	
	
	// ��ȸ�� ����	
	//@GetMapping("")
	public String viewsEp(int epNum) {
		return "";
	}// viewsEp
	
	
	// ���ƿ� �߰�
	//@GetMapping("")
	public String addLike(NovelCheckVO nCheckVO, Model model) {
		return "";
	}// addLike
	
	
	// ���ƿ� ����
	//@GetMapping("")
	public String cancelLike(NovelCheckVO nCheckVO, Model model) {
		return "";
	}// cancelLike
	
	
	// �Ű� �߰�
	//@GetMapping("")
	public String addReport(NovelReportVO nReportVO , Model model) {
		return "";
	}// addReport
	
	
	// �ϸ�ũ �߰�
	//@GetMapping("")
	public String addBookmark(EpCheckVO epCheckVO, Model model) {
		return "";
	}// addBookmark
	
	
	// �ϸ�ũ ����
	//@GetMapping("")
	public String cancelBookmark(EpCheckVO epCheckVO, Model model) {
		return "";
	}// cancelBookmark
	
	

}//class
