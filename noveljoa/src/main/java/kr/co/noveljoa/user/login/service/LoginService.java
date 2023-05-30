package kr.co.noveljoa.user.login.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.noveljoa.user.login.dao.LoginDAO;
import kr.co.noveljoa.user.login.domain.InfoDomain;
import kr.co.noveljoa.user.login.domain.LoginDomain;
import kr.co.noveljoa.user.login.vo.IdSearchVO;
import kr.co.noveljoa.user.login.vo.InfoChangeVO;
import kr.co.noveljoa.user.login.vo.LoginHistoryVO;
import kr.co.noveljoa.user.login.vo.LoginVO;
import kr.co.noveljoa.user.login.vo.PasswordChangeVO;
import kr.co.noveljoa.user.login.vo.PasswordIssuedVO;
import kr.co.noveljoa.user.login.vo.PasswordTempVO;
import kr.co.noveljoa.user.login.vo.ProfileImgVO;
import kr.co.noveljoa.user.login.vo.SignupVO;

@Service
public class LoginService {
	
	@Autowired(required = false)
	private LoginDAO lDAO;
	
	public String idSearch(IdSearchVO isVO) {
		
		String id = "";
		
		id = lDAO.idSearch(isVO);
		
		return id;
	}
	
	public String passwordSearch(PasswordIssuedVO isVO) {
		
		String id = "";
		
		id = lDAO.passwordSearch(isVO);
		
		return id;
	}
	
	public int passwordInsert(PasswordTempVO ptVO) {
		int pass = 0;
		
		pass = lDAO.passwordInsert(ptVO);
		
		return pass;
		
	}
	
	public String idCheck(String id) {
		
		String idSelect = "";
		
		idSelect = lDAO.idCheck(id);
		
		return idSelect;
	}
	
	
	public int signupInsert(SignupVO suVO) {
		
		int insert =0;
		
		insert =lDAO.signupInsert(suVO);
		
		return insert;
		
	}
	
	public String emailCheck(String email) {
		String code = "";
		
		code = lDAO.emailCheck(email);
		
		return code;
	}
	
	public List<LoginDomain> login(LoginVO lVO) {
		
		List<LoginDomain> list = new ArrayList<LoginDomain>();
		
		list = lDAO.login(lVO);
		
		return list;
	}
	
	public int history(LoginHistoryVO lhVO) {
		int success = 0;
		
		success = lDAO.history(lhVO);
		
		return success;
	}
	
	public List<InfoDomain> info(String id){
		
		List<InfoDomain> list = new ArrayList<InfoDomain>();
		
		list = lDAO.info(id);
		
		return list;
	}
	
	public int infoChange(InfoChangeVO icVO) {
		
		int change = 0;
		
		change = lDAO.infoChange(icVO);
		
		return change;
	}
	public int passChange(PasswordChangeVO pcVO) {
		
		int change = 0;
		
		change = lDAO.passwordChange(pcVO);
		
		return change;
	}
	
	public int updateProfile(ProfileImgVO ifVO) {
		int img = 0;
		
		img = lDAO.updateProfile(ifVO);
		
		return img;
	}
	
	
}
