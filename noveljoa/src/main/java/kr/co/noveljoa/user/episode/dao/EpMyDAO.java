package kr.co.noveljoa.user.episode.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.noveljoa.user.dao.MyBatisHandler;
import kr.co.noveljoa.user.episode.domain.EpListMyDomain;
import kr.co.noveljoa.user.episode.domain.EpMyDomain;
import kr.co.noveljoa.user.episode.vo.EpCheckMyVO;
import kr.co.noveljoa.user.episode.vo.EpCreateVO;
import kr.co.noveljoa.user.episode.vo.EpUpdateVO;
import kr.co.noveljoa.user.episode.vo.NovelCheckMyVO;

@Component
public class EpMyDAO {
	
	String map = "kr.co.noveljoa.user.episode.epiosdeMyMapper.";
	
	public int insertEpisode(EpCreateVO epCreateVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.insert(map+"insertEp", epCreateVO);
		
		if(cnt == 1) {
			System.out.println("episode commit");
			ss.commit();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}// addEp
	
	
	public int updateEpisode(EpUpdateVO epUpdateVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.update(map+"updateEp", epUpdateVO);
		
		if(cnt == 1) {
			System.out.println("episode edit commit");
			ss.commit();
		}else {
			System.out.println("episode edit rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}// editEp
	
	
	public int deleteEpisode(EpCheckMyVO epCheckMyVO) {
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		int cnt = ss.delete(map+"deleteEp", epCheckMyVO);
		
		if(cnt == 1) {
			System.out.println("episode delete commit");
			ss.commit();
		}else {
			System.out.println("episode delete rollback");
			ss.rollback();
		}
		
		if( ss != null) { ss.close(); }
		return cnt;
	}// removeEp
	
	
	
	public EpMyDomain selectEpisode(EpCheckMyVO epCheckMyVO) {
		EpMyDomain emd = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		emd = ss.selectOne(map+"selectEp", epCheckMyVO);
		
		if(ss != null) {ss.close();}
		
		return emd;
	}// selectEpisode
		
	
	public List<EpListMyDomain> selectEpisodeList(NovelCheckMyVO nCheckMyVO) {
		List<EpListMyDomain> list = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list = ss.selectList(map+"selectEpList", nCheckMyVO);
		
		if( ss != null) { ss.close(); }
		return list;
	}// searchEpList

}//class
