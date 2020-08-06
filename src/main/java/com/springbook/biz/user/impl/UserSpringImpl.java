package com.springbook.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserSpringImpl implements UserService {
	@Autowired
	private UserDAOSpring userDAOSpring;

	// context injection 에 사용하기 위한 setter
	public void setUserDAO(UserDAOSpring userDAOSpring) {
		this.userDAOSpring = userDAOSpring;
	}

	@Override
	public void insertUser(UserVO vo) {
		userDAOSpring.insertUser(vo);

	}

	@Override
	public void updateUser(UserVO vo) {
		userDAOSpring.updateUser(vo);

	}

	@Override
	public void deleteUser(UserVO vo) {
		userDAOSpring.deleteUser(vo);

	}

	@Override
	public UserVO getUser(UserVO vo) {
		return userDAOSpring.getUser(vo);

	}

	@Override
	public List<UserVO> getUserList(UserVO vo) {
		return userDAOSpring.getUserList(vo);
	}

}
