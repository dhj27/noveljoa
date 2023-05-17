package kr.co.noveljoa.admin.service;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import kr.co.noveljoa.admin.dao.ManagerLoginDAO;
import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.vo.InsertMVO;
import kr.co.noveljoa.admin.vo.MLoginVO;
import kr.co.sist.util.cipher.DataEncrypt;

public class ManagerLoginService {
	
	//매니저 로그인
	public MLoginDomain ManagerLogin(MLoginVO mVO) {
		try {
			//일방향성 해시 사용
			mVO.setPassword(DataEncrypt.messageDigest("MD5", mVO.getPassword() ));
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}
		
		MLoginDomain mlDomain = null;
		ManagerLoginDAO mDAO = new ManagerLoginDAO();
		try {
			mlDomain  = mDAO.selectLogin(mVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mlDomain;
	}
	
	//매니저 계정 생성
	public boolean MakeManager(InsertMVO IMVO) {
		try {
			//일방향성 해시 사용
			IMVO.setPassword( DataEncrypt.messageDigest("MD5", IMVO.getPassword()) );
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	
		ManagerLoginDAO mlDAO = new ManagerLoginDAO();
		int cnt = mlDAO.insertManager(IMVO);
		
		return cnt ==1;
	}
	
	

}//class
