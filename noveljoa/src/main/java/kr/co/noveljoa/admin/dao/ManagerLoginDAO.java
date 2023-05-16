package kr.co.noveljoa.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.noveljoa.admin.domain.MLoginDomain;
import kr.co.noveljoa.admin.vo.MLoginVO;
import kr.co.noveljoa.conn.DbConnection;

public class ManagerLoginDAO {
	
	public MLoginDomain selectLogin(MLoginVO mVO) throws SQLException {
		MLoginDomain mlDomain = null;  
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DbConnection db = DbConnection.getInstance();
		
		try {
			con=db.getConn();
			
			String select = "select id, Cdate from minfo2 where id = ? and password = ?";
			pstmt = con.prepareStatement(select);
			pstmt.setString(1, mVO.getId());
			pstmt.setString(2, mVO.getPassword());
			
			
			rs=pstmt.executeQuery();
			
			if(rs.next() ) {
				mlDomain = new MLoginDomain(rs.getString("id"), rs.getDate("Cdate"));
			}
			
		}finally {
			db.dbClose(rs, pstmt, con);
		}
		
		
		return mlDomain;
	}//selectLogin

}//class
