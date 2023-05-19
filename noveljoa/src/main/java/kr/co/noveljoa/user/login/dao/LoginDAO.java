package kr.co.noveljoa.user.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.noveljoa.user.login.vo.IdSearchVO;

@Repository
public class LoginDAO {

	
	public String idSearch(IdSearchVO isVO) {
		
		String id = "";
		//Handler¾ò±â
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		id = ss.selectOne("idSearch", isVO);
		//3. MyBatis Handler ´Ý±â
		if(ss != null) {ss.close();}
		
		return id;
		
	}
}
