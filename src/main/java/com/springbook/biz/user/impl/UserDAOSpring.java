package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserVO;

import oracle.net.aso.i;
import sun.print.PSPrinterJob.PluginPrinter;

@Repository("userDAOSpring")
public class UserDAOSpring {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	//for SQL
	private final String U_INSERT = "insert into USERS (idx,uname,userid,userpw,uemail,ustat,uauth) "
			+ "values(USER_SEQ.NEXTVAL,?,?,?,?,0,0)";
	private final String U_UPDATE = "update USERS set uname=?," + "userid=?," + "userpw=?," + "uemail=? where idx=?";
	private final String U_DELETE = "delete from USERS where idx=?";
	private final String U_GET = "select * from USERS where idx=?";
	private final String U_LIST = "select * from USERS order by idx desc";

	// for CRUD
	// insert

	public void insertUser(UserVO vo) {
		jdbcTemplate.update(U_INSERT, vo.getUname(), vo.getUserid(), vo.getUserpw(), vo.getUemail());
		System.out.println("J인서트:");
	}

	public void updateUser(UserVO vo) {
		jdbcTemplate.update(U_UPDATE, vo.getUname(), vo.getUserid(), vo.getUserpw(), vo.getUemail(), vo.getUidx());
		System.out.println("J업데이트:");
	}

	public void deleteUser(UserVO vo) {

		jdbcTemplate.update(U_DELETE, vo.getUidx());
		System.out.println("J삭제:");
	}

	public int countUser() {
		String u_CNT = "select count(*) from USERS";
		int cnt = jdbcTemplate.queryForObject(u_CNT, Integer.class);
		System.out.println("J카운트:" + cnt);
		return cnt;
	}

	public UserVO getUser(UserVO vo) {
		System.out.println("==> get 작업");
		Object[] args = { vo.getUidx() };
		return (UserVO) jdbcTemplate.queryForObject(U_GET, args, new UserMapper());
	}

	public List<UserVO> getUserList(UserVO vo) {
		System.out.println("==> List 작업");
		return (List<UserVO>) jdbcTemplate.query(U_LIST, new UserMapper());
	}

}

class UserMapper implements RowMapper<UserVO> {
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserVO userVO = new UserVO();
		userVO.setUidx(rs.getInt("IDX"));
		userVO.setUname(rs.getString("UNAME"));
		userVO.setUserid(rs.getString("USERID"));
		userVO.setUserpw(rs.getString("USERPW"));
		userVO.setUemail(rs.getString("UEMAIL"));
		return userVO;
	}
}
