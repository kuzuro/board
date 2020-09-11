package com.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.service.ReplyService;

@Controller
@RequestMapping("/reply/*")
public class ReplyController {

	@Inject
	private ReplyService replyService;
	
	// 댓글 조회
	
	// 댓글 작성
	
	// 댓글 수정
	
	// 댓글 삭제
	
}
