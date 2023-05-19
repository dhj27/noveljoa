package kr.co.noveljoa.admin.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.noveljoa.admin.domain.MemberManageDomain;
import kr.co.noveljoa.admin.domain.MemberManageInfoDomain;

public class ManagerDAO1 {
	
	public List<MemberManageDomain> selectMemberManage(String id) throws SQLException {
		List<MemberManageDomain> mmList = null;  
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. 쿼리 수행 후 결과 얻기
		if(id!=null && id!="" ) {
			mmList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectOneMember",id);
		}else {
			mmList=ss.selectList("kr.co.noveljoa.admin.Mapper.selectAllMember");
		}
		
		ss.commit();
		//3. MyBatis Handler 닫기
				if(ss != null) {
					ss.close();
				}//end if

		
		return mmList;
	}//selectLogin
	
	
	
	public MemberManageInfoDomain selectmemberInfoAll(String id) {
		MemberManageInfoDomain mmiDomain = null;
		
		//1. MyBatis Handler 얻기
		SqlSession ss = ManagerMyBatisHandler.getInstance().getMyBatisHandler(false);
		//2. 쿼리 수행 후 결과 얻기
		mmiDomain = ss.selectOne("kr.co.noveljoa.admin.Mapper.selectMemInfo",id);
		
		ss.commit();
		//3. MyBatis Handler 닫기
		if(ss!=null) {
			ss.close();
		}
		
		
	    return mmiDomain;
	}
	
	
	
	
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
