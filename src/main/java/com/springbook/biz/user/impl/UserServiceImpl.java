package com.springbook.biz.user.impl;

import java.util.List;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

public class UserServiceImpl implements UserService {
private UserDAO userDAO;
// context injection 에 사용하기 위한 setter
	public  void  setUserDAO(UserDAO userDAO) {
		this.userDAO=userDAO;
	}
 @Override
	public void insertUser(UserVO vo) {
	 userDAO.insertUser(vo);
		
	}
 @Override
	public void updateUser(UserVO vo) {
	 userDAO.updateUser(vo);
		
	}
 @Override
	public void deleteUser(UserVO vo) {
	userDAO.deleteUser(vo);
		
	}
 @Override
	public UserVO getUser(UserVO vo) {
	 return userDAO.getUser(vo);
		
	}
 @Override
	public List<UserVO> getUserList(UserVO vo) {
	 return userDAO.getUserList(vo);
	}
 
}
