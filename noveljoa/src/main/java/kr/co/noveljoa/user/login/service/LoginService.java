package kr.co.noveljoa.user.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.noveljoa.user.login.dao.LoginDAO;
import kr.co.noveljoa.user.login.vo.IdSearchVO;

@Service
public class LoginService {
	
	@Autowired(required = false)
	private LoginDAO lDAO;
	
	public String idSearch(IdSearchVO isVO) {
		
		String id = "";
		
		id = lDAO.idSearch(isVO);
		
		return id;
	}
	
}
