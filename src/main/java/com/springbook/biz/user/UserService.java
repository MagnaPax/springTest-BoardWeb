package com.springbook.biz.user;

import java.util.List;

public interface UserService {
	// 입력
	void insertUser(UserVO vo);
	//수정
	void updateUser(UserVO vo);
	//삭제
	void deleteUser(UserVO vo);
	//상세조회
	UserVO getUser(UserVO vo);
	//목록조회
	List<UserVO> getUserList(UserVO vo);

}
