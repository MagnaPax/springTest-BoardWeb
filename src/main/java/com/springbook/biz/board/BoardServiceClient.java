package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		// 1. 스프링 컨테이너 작동
		AbstractApplicationContext container = new GenericXmlApplicationContext("boardContext.xml");

		// 2. 스프링 으로부터 BoardService 객체 가져오기
		BoardService boardService = (BoardService) container.getBean("boardService");

		// 3. 글기능 테스트
		BoardVO vo = new BoardVO();
		vo.setBtitle("테스트글");
		vo.setBcontent("테스트 컨텐츠");
		vo.setBwriter(1);
		boardService.insertBoard(vo);

		// 4. 글목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("===>" + board.toString());
		}

		container.close();

	}

}
