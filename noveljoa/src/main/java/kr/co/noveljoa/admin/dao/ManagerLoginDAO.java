package kr.co.noveljoa.admin.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.vo.InsertMVO;
import kr.co.noveljoa.admin.vo.MLoginVO;

@Component
public class ManagerLoginDAO {
	//�Ŵ��� ���̵� ����
	public int insertManager( InsertMVO IMVO ) {
		//MyBatis Handler ���
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//Handler ���
		int cnt = ss.insert("kr.co.noveljoa.admin.Mapper.insertManager", IMVO);
		//transaction �Ϸ�
		if( cnt==1 ) {
			ss.commit();
		}
		//���� ����
		if(ss != null) {
			ss.close();
		}//end if
		return cnt;
	}//insertManager
	
	//�α���
	public MLoginDomain selectLogin(MLoginVO mVO) throws SQLException {
		MLoginDomain mlDomain = null;  
		//MyBatis ���
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//transaction�Ϸ�
		mlDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectLogin", mVO);
		
		ss.commit();
		//���� ����
				if(ss != null) {
					ss.close();
				}//end if

		
		return mlDomain;
	}//selectLogin
	
//	//�׽�Ʈ ��
//	  public static void main(String[] args) {
//	  
//	  ManagerLoginDAO mDAO = new ManagerLoginDAO(); 
//	  MLoginVO m = new MLoginVO("manager", "1234"); 
//	  try { 
//		  MLoginDomain md = mDAO.selectLogin(m);
//	  System.out.println(md); 
//	  } catch (SQLException e) { 
//		  e.printStackTrace(); 
//	  }
//	  
//	  }//main

}//class
