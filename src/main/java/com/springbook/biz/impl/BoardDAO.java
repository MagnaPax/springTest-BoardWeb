package com.springbook.biz.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;

public class BoardDAO {

	//for JDBC
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	//for SQL
	private final String B_INSERT = "insert into BOARD (bidx,btitle,bwriter,bcontent,bdate,bstat values(BOARD_SEQ.nextval,?,?,?,SYSDATE,0)";
	private final String B_UPDATE = "update BOARD set btitle=?," + "bwriter=?," + "bcontent=? where bidx=?";
	private final String B_DELETE = "delete from BOARD where bidx=?";
	private final String B_GET = "select * from BOARD where bidx=?";
	private final String B_LIST = "select * from BOARD order by bidx desc";

	//CRUD 기능의 메소드 구현
	//글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("==> insert 작업");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(B_INSERT);
			stmt.setString(1, vo.getBtitle());
			stmt.setInt(2, vo.getBwriter());
			stmt.setString(3, vo.getBcontent());
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	//글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("==> update 작업");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(B_UPDATE);
			stmt.setString(1, vo.getBtitle());
			stmt.setInt(2, vo.getBwriter());
			stmt.setString(3, vo.getBcontent());
			stmt.setInt(4, vo.getBidx());
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	//글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("==> delete 작업");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(B_DELETE);
			stmt.setInt(1, vo.getBidx());
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	//글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("==> getBoard 작업");
		BoardVO board = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(B_GET);
			stmt.setInt(1, vo.getBidx());
			rs = stmt.executeQuery();
			if (rs.next()) {
				board = new BoardVO();
				board.setBidx(rs.getInt("BIDX"));
				board.setBtitle(rs.getString("BTITLE"));
				board.setBwriter(rs.getInt("BWRITER"));
				board.setBcontent(rs.getString("BCONTENT"));
				board.setBdate(rs.getDate("BDATE"));
				board.setBstat(rs.getInt("BSTAT"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}

		return board;
	}

	//글 목록 조회
	public List<BoardVO> getboardliList(BoardVO vo) {
		System.out.println("==> getboardList 작업");
		BoardVO board = null;
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(B_GET);
			stmt.setInt(1, vo.getBidx());
			rs = stmt.executeQuery();
			if (rs.next()) {
				board = new BoardVO();
				board.setBidx(rs.getInt("BIDX"));
				board.setBtitle(rs.getString("BTITLE"));
				board.setBwriter(rs.getInt("BWRITER"));
				board.setBcontent(rs.getString("BCONTENT"));
				board.setBdate(rs.getDate("BDATE"));
				board.setBstat(rs.getInt("BSTAT"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}

		return boardList;
	}

}
