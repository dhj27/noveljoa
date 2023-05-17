package kr.co.noveljoa.admin.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ManagerMyBatisHandler {
	
	private static ManagerMyBatisHandler mbh;
	private static SqlSessionFactory ssf;
	
	private ManagerMyBatisHandler() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}//MyBatisHandler
	
	public static ManagerMyBatisHandler getInstance() {
		if( mbh == null ) {
			mbh=new ManagerMyBatisHandler();
		}//end if
		return mbh;
	}//getInstance
	
	private SqlSessionFactory getSqlSessionFactory() {
		if( ssf == null ) {
			//1. 설정파일과 연결
			try {
				Reader reader=Resources.getResourceAsReader("kr/co/noveljoa/admin/dao/manager-mybatis-config.xml");
				
				//2. MyBatis Framework생성
				ssf=new SqlSessionFactoryBuilder().build(reader);
				
				//3. 스트림 끊기
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
