package kr.co.noveljoa.admin.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.vo.MLoginVO;

public class ManagerLoginDAO {
	
	public MLoginDomain selectLogin(MLoginVO mVO) throws SQLException {
		MLoginDomain mlDomain = null;  
		//MyBatis ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//transaction�Ϸ�
		mlDomain=ss.selectOne("kr.co.noveljoa.admin.Mapper.selectLogin", mVO);
		
		ss.commit();
		//���� ����
				if(ss != null) {
					ss.close();
				}//end if

		
		return mlDomain;
	}//selectLogin
	
	public static void main(String[] args) {
		
		ManagerLoginDAO mDAO = new ManagerLoginDAO();
		 MLoginVO m = new MLoginVO("manager", "1234");
		 try {
			 MLoginDomain md  = mDAO.selectLogin(m);
			System.out.println(md);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

}//class
