package kr.co.noveljoa.user.board.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardMyBatisHandler {
	
	private static BoardMyBatisHandler mbh;
	private static SqlSessionFactory ssf;
	
	private BoardMyBatisHandler() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}//MyBatisHandler
	
	public static BoardMyBatisHandler getInstance() {
		if( mbh == null ) {
			mbh=new BoardMyBatisHandler();
		}//end if
		return mbh;
	}//getInstance
	
	private SqlSessionFactory getSqlSessionFactory() {
		if( ssf == null ) {
			//1. �������ϰ� ����
			try {
				Reader reader=Resources.getResourceAsReader("kr/co/noveljoa/user/board/dao/board-mybatis-config.xml");
				System.out.println("-----------ddddd--------------");
				//2. MyBatis Framework����
				ssf=new SqlSessionFactoryBuilder().build(reader);
				
				//3. ��Ʈ�� ����
				if(reader != null) {reader.close();}//end if
				
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
			
		}//end if
		
		return ssf;
	}//getSqlSessionFactory
	
	public SqlSession getMyBatisHandler(boolean commitFlag) {
		
		return getSqlSessionFactory().openSession(commitFlag); 
	}//getMyBatisHanler

}//class
