package kr.co.noveljoa.user.login.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.noveljoa.user.login.domain.InfoDomain;
import kr.co.noveljoa.user.login.domain.LoginDomain;
import kr.co.noveljoa.user.login.vo.IdSearchVO;
import kr.co.noveljoa.user.login.vo.InfoChangeVO;
import kr.co.noveljoa.user.login.vo.LoginHistoryVO;
import kr.co.noveljoa.user.login.vo.LoginVO;
import kr.co.noveljoa.user.login.vo.PasswordChangeVO;
import kr.co.noveljoa.user.login.vo.PasswordIssuedVO;
import kr.co.noveljoa.user.login.vo.PasswordTempVO;
import kr.co.noveljoa.user.login.vo.ProfileImgVO;
import kr.co.noveljoa.user.login.vo.SignupVO;

@Repository
public class LoginDAO {

	
	public String idSearch(IdSearchVO isVO) {
		
		String id = "";
		//Handler
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		id = ss.selectOne("idSearch", isVO);
		//3. MyBatis Handler 
		if(ss != null) {ss.close();}
		
		return id;
		
	}
	public String passwordSearch(PasswordIssuedVO isVO) {
		
		String id="";
		//Handler
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		id = ss.selectOne("passwordSearch", isVO);
		//3. MyBatis Handler 
		if(ss != null) {ss.close();}
		
		return id;
		
	}
	public int passwordInsert(PasswordTempVO ptVO) {
		
	    int pass = 0;
		
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		pass = ss.update("passwordTemp", ptVO);
		//3. MyBatis Handler 
		if(pass == 1) {
			ss.commit();
		}
		
		if(ss != null) {ss.close();}
		
		return pass;
		
	}
	public String idCheck(String id) {
		
		String idSelect="";
		//Handler
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		idSelect = ss.selectOne("idCheck", id);
		//3. MyBatis Handler 
		if(ss != null) {ss.close();}
		
		return idSelect;
		
	}
	
	
	public int signupInsert(SignupVO suVO) {
		
		int insert =0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		insert = ss.insert("memberInsert", suVO);
		//3. MyBatis Handler 
		
		if(insert == 1) {
			ss.commit();
		}
		
		if(ss != null) {ss.close();}
		
		return insert;
		
	}
	
	public String emailCheck(String email){
		
		String code = "";
		
		int length=10;//임시 비번 만들기
		String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		Random random = new Random();
	    StringBuilder password = new StringBuilder();
	    
	    for (int i = 0; i < length; i++) {
	        password.append(chars.charAt(random.nextInt(chars.length())));
	    }
	    code = password.toString(); // 이건 따로 사용자에게 보여줄 임시 비밀번호
	    
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		
			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("wjdfufdl1@gmail.com", "mxyaxvikwvsfetfz");
			}
		});
		
		String receiver = email; // 메일 받을 주소
		String title = "메일 인증입니다.";
		String content = "<h2 style='color:blue'>"+code+"</h2>";
		Message message = new MimeMessage(session);
		try {
			//발신자 정보
			message.setFrom(new InternetAddress("sendMail@gmail.com", "관리자", "utf-8"));
			//수신자 메일 주소
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
			//메일 제목
			message.setSubject(title);
			//메일 내용
			message.setContent(content, "text/html; charset=utf-8");
			
			//메일 전송
			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return code;
		
	}
	
	public List<LoginDomain> login(LoginVO lVO) {
		
		List<LoginDomain> list = new ArrayList<LoginDomain>();
		
		//Handler
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		list = ss.selectList("login", lVO);
		//3. MyBatis Handler
		if(ss != null) {ss.close();}
		
		return list;
		
		
	}
	
	public int history(LoginHistoryVO lhVO) {
		
		int success = 0;
		//Handler
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		success = ss.insert("historyInsert", lhVO);
		
		if(success == 1) {
			ss.commit();
		}
		//3. MyBatis Handler
		if(ss != null) {ss.close();}
		
		return success;
		
	}
	
	public List<InfoDomain> info(String id){
		
		List<InfoDomain> list = new ArrayList<InfoDomain>();
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		list = ss.selectList("info", id);
		//3. MyBatis Handler 
		if(ss != null) {ss.close();}
		
		return list;
		
	}
	
	public int infoChange(InfoChangeVO icVO) {
		
		int phoneChange = 0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		if(ss.selectOne("info_phone",icVO.getPhone())==null) {
			phoneChange = ss.update("infoChange", icVO);
			if(phoneChange == 1) {
				ss.commit();
			}
		}else {
			phoneChange = -1;
		}
		//3. MyBatis Handler
		if(ss != null) {ss.close();}
		
		return phoneChange;
		
	}
	public int passwordChange(PasswordChangeVO pcVO) {
		
		int pwChange = 0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		pwChange = ss.update("pwChange", pcVO);
		//3. MyBatis Handler 
		if(pwChange == 1) {
			ss.commit();
		}
		if(ss != null) {ss.close();}
		
		return pwChange;
		
	}
	
	public int updateProfile(ProfileImgVO ifVO) {
		int img = 0;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		img = ss.update("imgChange", ifVO);
		//3. MyBatis Handler 
		if(img == 1) {
			ss.commit();
		}
		if(ss != null) {ss.close();}
		
		return img;
	}
	
	
	
}
