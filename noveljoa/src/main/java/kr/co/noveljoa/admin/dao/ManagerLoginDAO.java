package kr.co.noveljoa.admin.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.vo.InsertMVO;
import kr.co.noveljoa.admin.vo.MLoginVO;

public class ManagerLoginDAO {
	//매니저 아이디 생성
	public int insertManager( InsertMVO IMVO ) {
		//MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//Handler 사용
		int cnt = ss.insert("kr.co.noveljoa.admin.Mapper.insertManager", IMVO);
		//transaction 완료
		if( cnt==1 ) {
			ss.commit();
		}
		//연결 끊기
		if(ss != null) {
			ss.close();
		}//end if
		return cnt;
	}//insertManager
	
	//로그인
	public MLoginDomain selectLogin(MLoginVO mVO) throws SQLException {
		MLoginDomain mlDomain = null;  
		//MyBatis 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//transaction완료
		mlDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectLogin", mVO);
		
		ss.commit();
		//연결 끊기
				if(ss != null) {
					ss.close();
				}//end if

		
		return mlDomain;
	}//selectLogin
	
	/* 테스트 용
	 * public static void main(String[] args) {
	 * 
	 * ManagerLoginDAO mDAO = new ManagerLoginDAO(); MLoginVO m = new
	 * MLoginVO("manager", "1234"); try { MLoginDomain md = mDAO.selectLogin(m);
	 * System.out.println(md); } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * }//main
	 */	

}//class
