package org.hj.mapper;

import java.util.ArrayList;

import org.hj.model.ReplyVO;

//댓글 관련 Mapper
public interface ReplyMapper {
	//댓글쓰기를 위한 구현
	//return타입이 int일때, 1이면 insert 성공  | 0이면 insert실패
	public int rewrite(ReplyVO reply); 
	
	//댓글 목록리스트를 위한 구현
	public ArrayList<ReplyVO> list(int bno);
}
