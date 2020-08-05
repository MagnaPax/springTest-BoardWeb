package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserVO;

public class UserDAO {
 //for JDBC
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
 //for SQL
	private final String U_INSERT=
			"insert into USERS (idx,uname,userid,userpw,uemail,ustat,uauth) "
			+ "values(USER_SEQ.NEXTVAL,?,?,?,?,0,0)";
	private final String U_UPDATE=
			"update USERS set uname=?,"
			+ "userid=?,"
			+ "userpw=?,"
			+ "uemail=? where idx=?" ;
	private final String U_DELETE="delete from USERS where idx=?";
	private final String U_GET="select * from USERS where idx=?";
	private final String U_LIST="select * from USERS order by idx desc";
	
 // for CRUD
	// insert
	public void insertUser(UserVO vo) {
		System.out.println("==> inert 작업");
		try {
			conn= JDBCUtil.getConnection();
			stmt=conn.prepareStatement(U_INSERT);
			stmt.setString(1, vo.getUname());
			stmt.setString(2,vo.getUserid());
			stmt.setString(3, vo.getUserpw());
			stmt.setString(4,vo.getUemail());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public void updateUser(UserVO vo) {
		System.out.println("==> update 작업");
		try {
			conn= JDBCUtil.getConnection();
			stmt=conn.prepareStatement(U_UPDATE);
			stmt.setString(1, vo.getUname());
			stmt.setString(2, vo.getUserid());
			stmt.setString(3, vo.getUserpw());
			stmt.setString(4, vo.getUemail());
			stmt.setInt(5, vo.getUidx());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public void deleteUser(UserVO vo) {
		System.out.println("==> delete 작업");
		try {
			conn= JDBCUtil.getConnection();
			stmt=conn.prepareStatement(U_DELETE);
			stmt.setInt(1, vo.getUidx());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public UserVO getUser(UserVO vo) {
		System.out.println("==> get 작업");
		UserVO user=null;
		try {
			conn= JDBCUtil.getConnection();
			stmt=conn.prepareStatement(U_GET);
			stmt.setInt(1, vo.getUidx());
			rs=stmt.executeQuery();
			if(rs.next()) {
				user=new UserVO();
				user.setUidx(rs.getInt("IDX"));
				user.setUname(rs.getString("UNAME"));
				user.setUserid(rs.getString("USERID"));
				user.setUserpw(rs.getString("USERPW"));
				user.setUemail(rs.getString("UEMAIL"));
				user.setUstat(rs.getInt("USTAT"));
				user.setUauth(rs.getInt("UAUTH"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
		return user;
	}
	
	public List<UserVO> getUserList(UserVO vo) {
		System.out.println("==> list 작업");
		UserVO user=null;
		List<UserVO> userList= new ArrayList<UserVO>();
		try {
			conn= JDBCUtil.getConnection();
			stmt=conn.prepareStatement(U_LIST);
			rs=stmt.executeQuery();
			while(rs.next()) {
				user=new UserVO();
				user.setUidx(rs.getInt("IDX"));
				user.setUname(rs.getString("UNAME"));
				user.setUserid(rs.getString("USERID"));
				user.setUserpw(rs.getString("USERPW"));
				user.setUemail(rs.getString("UEMAIL"));
				user.setUstat(rs.getInt("USTAT"));
				user.setUauth(rs.getInt("UAUTH"));
				userList.add(user);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
		return userList;
	}
	
	
 
 
}
