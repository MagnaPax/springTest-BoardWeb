package com.springbook.biz.board;

import java.util.List;

public interface BoardService {
	//입력	
	void insertBoard(BoardVO vo);

	//수정
	void updateBoard(BoardVO vo);

	//삭제
	void deleteBoard(BoardVO vo);

	//상세조회
	BoardVO getBoard(BoardVO vo);

	//목록조회
	List<BoardVO> getBoardList(BoardVO vo);

}
