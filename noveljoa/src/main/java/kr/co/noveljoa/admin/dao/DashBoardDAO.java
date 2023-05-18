package kr.co.noveljoa.admin.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.admin.domain.DashBoardDomain;
import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.vo.MLoginVO;

public class DashBoardDAO {
	//대시보드 표 생성
	//로그인
		public DashBoardDomain selectDash() throws SQLException {
			DashBoardDomain dbDomain = null;  
			//MyBatis 얻기
			SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
			
			//transaction완료
			dbDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectDash");
			
			ss.commit();
			//연결 끊기
					if(ss != null) {
						ss.close();
					}//end if

			
			return dbDomain;
		}//selectLogin
		
		
//		 //테스트 용
//		  public static void main(String[] args) {
//		  
//			  DashBoardDAO dbDAO = new DashBoardDAO(); 
//		  
//		  try { 
//			  DashBoardDomain dbDomain = dbDAO.selectDash();
//		  System.out.println(dbDomain); 
//		  } catch (SQLException e) { 
//			  e.printStackTrace(); 
//		  }
//		  
//		  }//main
		 	

}
