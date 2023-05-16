package kr.co.noveljoa.conn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbConnection {

	private static DbConnection dbCon;
	
	private DbConnection() {}// DBConnection
	
	public static DbConnection getInstance() {
		if(dbCon == null) {
			dbCon = new DbConnection();
		}//end if
		return dbCon;
	}// getInstance
	
	public Connection getConn() throws SQLException {
		Connection con = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/project2");
			con = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		}//end catch
		return con;		
	}// getConnection
	
	public void dbClose(ResultSet rs, Statement stmt, Connection con) throws SQLException {
		try {
			if(rs != null) { rs.close(); }
			if(stmt != null) { stmt.close(); }
		} finally {
			if(con != null) { con.close(); }
		}//end finally
	}// dbClose
	
}
