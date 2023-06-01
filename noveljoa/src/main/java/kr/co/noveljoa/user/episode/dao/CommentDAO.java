package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.dao.MyBatisHandler;
import kr.co.noveljoa.user.episode.domain.CommentUserDomain;
import kr.co.noveljoa.user.episode.vo.CommentCheckMyVO;
import kr.co.noveljoa.user.episode.vo.CommentInsertVO;

@Component
public class CommentDAO {
	
	String map = "kr.co.noveljoa.user.episode.commentMapper.";
	
	public int insertComment(CommentInsertVO cmtInsertVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.insert(map+"insertCmt", cmtInsertVO);
		
		if(cnt == 1) {
			System.out.println("comment commit");
			ss.commit();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}//insertComment
	
	public int updateComment(CommentCheckMyVO cmtCheckMyVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.update(map+"updateCmt", cmtCheckMyVO);
		
		if(cnt == 1) {
			System.out.println("update comment commit");
			ss.commit();
		}else {
			System.out.println("update comment rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}//updateComment
	
	
	public int deleteComment(CommentCheckMyVO cmtCheckMyVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.delete(map+"deleteCmt", cmtCheckMyVO);
		
		if(cnt == 1) {
			System.out.println("delete comment commit");
			ss.commit();
		}else {
			System.out.println("delete comment rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}// deleteComment
	
	
	public String selectEpTitle(int num_episode) {
		String title = "";
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		title = ss.selectOne(map+"selectEptitle", num_episode);
		
		if(ss != null) {ss.close();}
		
		return title;
	}

	
	public CommentUserDomain selectComment(CommentCheckMyVO ccMyVO) {
		CommentUserDomain cd = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		cd = ss.selectOne(map+"selectCmt", ccMyVO);
		
		if(ss != null) {ss.close();}
		
		return cd;
	}//selectComment
	
	
	public List<CommentUserDomain> selectAllComment(int num_episode){
		List<CommentUserDomain> list = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list = ss.selectList(map+"selectAllCmt", num_episode);
		
		if( ss != null) { ss.close(); }
		return list;
	}//selectAllComment
	

}
