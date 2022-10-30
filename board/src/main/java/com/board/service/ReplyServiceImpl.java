package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.ReplyDAO;
import com.board.domain.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;
	
	// 댓글 조회
	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		return dao.list(bno);
	}

	// 댓글 작성
	@Override
	public void write(ReplyVO vo) throws Exception {
		dao.write(vo);
	}

	// 댓글 수정
	@Override
	public void modify(ReplyVO vo) throws Exception {
		dao.modify(vo);
	}

	// 댓글 삭재
	@Override
	public void delete(ReplyVO vo) throws Exception {
		dao.delete(vo);
	}

	
	// 단일 댓글 조회
	@Override
	public ReplyVO replySelect(ReplyVO vo) throws Exception {
		return dao.replySelect(vo);
	}

}
