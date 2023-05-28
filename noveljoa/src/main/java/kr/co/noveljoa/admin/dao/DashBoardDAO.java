package kr.co.noveljoa.admin.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.admin.domain.AllMDomain;
import kr.co.noveljoa.admin.domain.AllNDomain;
import kr.co.noveljoa.admin.domain.DashBoardDomain;
import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.domain.TodayJoinDomain;
import kr.co.noveljoa.admin.domain.TodayVisitDomain;
import kr.co.noveljoa.admin.vo.MLoginVO;

@Component
public class DashBoardDAO {
	//��ú��� ǥ ����
	//�α���
		public DashBoardDomain selectDash() throws SQLException {
			DashBoardDomain dbDomain = null;  
			//1. MyBatis Handler 얻기
			SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
			
			//2. 쿼리 수행 후 결과 얻기
			dbDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectDash");
			
			ss.commit();
			//3. MyBatis Handler 닫기
					if(ss != null) {
						ss.close();
					}//end if

			
			return dbDomain;
		}//selectLogin
		
		public AllMDomain selectAllMemCnt() throws SQLException {
			AllMDomain amDomain = null;
			//1. MyBatis Handler 얻기
			SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
			
			//2. 쿼리 수행 후 결과 얻기
			amDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectAllMemCnt");
			
			ss.commit();
			//3. MyBatis Handler 닫기
					if(ss != null) {
						ss.close();
					}//end if
			
			return amDomain;
		}//selectLogin
		
		public AllNDomain selectAllNovCnt() throws SQLException {
			AllNDomain anDomain = null;
			//1. MyBatis Handler 얻기
			SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
			
			//2. 쿼리 수행 후 결과 얻기
			anDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectAllNovCnt");
			
			ss.commit();
			//3. MyBatis Handler 닫기
					if(ss != null) {
						ss.close();
					}//end if
			
			return anDomain;
		}//selectLogin
		
		public TodayJoinDomain selectTodayJoinCnt() throws SQLException {
			TodayJoinDomain tjDomain = null;
			//1. MyBatis Handler 얻기
			SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
			
			//2. 쿼리 수행 후 결과 얻기
			tjDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectTodayJoinCnt");
			
			ss.commit();
			//3. MyBatis Handler 닫기
					if(ss != null) {
						ss.close();
					}//end if
			
			return tjDomain;
		}//selectLogin
		
		public TodayVisitDomain selectTodayVisitCnt() throws SQLException {
			TodayVisitDomain tvDomain = null;
			//1. MyBatis Handler 얻기
			SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
			
			//2. 쿼리 수행 후 결과 얻기
			tvDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectTodayVisitCnt");
			
			ss.commit();
			//3. MyBatis Handler 닫기
					if(ss != null) {
						ss.close();
					}//end if
			
			return tvDomain;
		}//selectLogin
	
		
		
		
		
		
//		//test
//		  public static void main(String[] args) {
//		  
//			  DashBoardDAO dbDAO = new DashBoardDAO(); 
//		  
//		  try { 
//			  
//		  System.out.println(dbDAO.selectTodayJoinCnt()); 
//		  } catch (SQLException e) { 
//			  e.printStackTrace(); 
//		  }
//		  
//		  }//main
		 	

}
