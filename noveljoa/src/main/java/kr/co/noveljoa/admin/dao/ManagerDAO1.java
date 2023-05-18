package kr.co.noveljoa.admin.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.admin.domain.MemberManageDomain;

public class ManagerDAO1 {
	
	public List<MemberManageDomain> selectMemberManage(String id) throws SQLException {
		List<MemberManageDomain> mmList = null;  
		//MyBatis ���
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//transaction�Ϸ�
		if(id!=null) {
			mmList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectOneMember",id);
		}else {
			mmList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectAllMember");
		}
		
		ss.commit();
		//���� ����
				if(ss != null) {
					ss.close();
				}//end if

		
		return mmList;
	}//selectLogin
	
//	 public static void main(String[] args) {
//		  
//			  ManagerDAO1 mDAO = new ManagerDAO1(); 
//		  
//		  try { 
//			  List<MemberManageDomain> list = mDAO.selectMemberManage("aa");
//		  System.out.println(list); 
//		  } catch (SQLException e) { 
//			  e.printStackTrace(); 
//		  }
//		  
//		  }//main
	

}
