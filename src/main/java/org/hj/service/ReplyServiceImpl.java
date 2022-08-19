package org.hj.service;

import java.util.ArrayList;

import org.hj.mapper.ReplyMapper;
import org.hj.model.ReplyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService  {
	@Autowired
	ReplyMapper rm;

	// 댓글쓰기를 위한 구현
	public int rewrite(ReplyVO reply) {
		return rm.rewrite(reply);
	}
	//댓글목록리스트를 위한 구현
	public ArrayList<ReplyVO> list(int bno){
		return rm.list(bno);
	}
}
