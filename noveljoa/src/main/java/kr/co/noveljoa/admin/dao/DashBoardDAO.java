package kr.co.noveljoa.admin.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.admin.domain.DashBoardDomain;
import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.vo.MLoginVO;

public class DashBoardDAO {
	//��ú��� ǥ ����
	//�α���
		public DashBoardDomain selectDash() throws SQLException {
			DashBoardDomain dbDomain = null;  
			//MyBatis ���
			SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
			
			//transaction�Ϸ�
			dbDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectDash");
			
			ss.commit();
			//���� ����
					if(ss != null) {
						ss.close();
					}//end if

			
			return dbDomain;
		}//selectLogin
		
		
//		 //�׽�Ʈ ��
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
