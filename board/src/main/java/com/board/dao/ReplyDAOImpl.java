package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.board.mappers.reply";

	// 댓글 조회
	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		return sql.selectList(namespace + ".replyList", bno);
	}

	// 댓글 작성
	@Override
	public void write(ReplyVO vo) throws Exception {
		sql.insert(namespace + ".replyWrite", vo);
	}

	// 댓글 수정
	@Override
	public void modify(ReplyVO vo) throws Exception {
		sql.update(namespace + ".replyModify", vo);
	}

	// 댓글 삭제
	@Override
	public void delete(ReplyVO vo) throws Exception {
		sql.delete(namespace + ".replyDelete", vo);
	}

	
	// 단일 댓글 조회
	@Override
	public ReplyVO replySelect(ReplyVO vo) throws Exception {
		
		return sql.selectOne(namespace + ".replySelect", vo);
	}

}
