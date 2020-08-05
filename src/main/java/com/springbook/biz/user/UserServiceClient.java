package com.springbook.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		// 1.스프링 컨테이너 작동
		AbstractApplicationContext container = new GenericXmlApplicationContext("boardContext.xml");
		// 2. Spring 으로 부터 UserService  객체 가져오기
		UserService userService = (UserService) container.getBean("userService");
		//3. 글기능 테스트 입력
		UserVO vo = new UserVO();
		vo.setUname("세종대왕");
		vo.setUserid(" sj ");
		vo.setUserpw("1234");
		vo.setUemail("aa@aa.com");
		userService.insertUser(vo);
		//목록보기
		List<UserVO> userList = userService.getUserList(vo);
		for (UserVO user : userList) {
			System.out.println("===>" + user.toString());
		}
		container.close();
	}

}
