package com.springbook.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DispatcherServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	private void loginPrs(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1. 사용자 정보 입력
		String id = request.getParameter("userid");
		String pw = request.getParameter("userpw");
		System.out.println("id:" + id + "pw:" + pw);
		//2. DB 연동처리
		UserVO vo = new UserVO();
		vo.setUserid(id);
		vo.setUserpw(pw);
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getLoger(vo);

		//3. 
		if (user == null) {
			//로그인 실패
			System.out.println("로그인실패");
			response.sendRedirect("index.jsp");
		} else {
			//로그인 성공
			System.out.println("로그인성공");
			response.sendRedirect("userList.jsp");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println("Path:" + path);
		String resTxt = "";

		switch (path) {
		case "/login.do":
			loginPrs(request, response);
			resTxt = "로그인1 처리";
			break;
		case "/logout.do":
			resTxt = "로그 아웃 처리";
			break;
		case "/insertUser.do":
			resTxt = "사용자 생성";
			break;
		case "/updateUser.do":
			resTxt = "사용자 수정";
			break;
		case "/deleteUser.do":
			resTxt = "사용자 삭제";
			break;
		case "/getUser.do":
			resTxt = "사용자 가져오기";
			break;
		case "/getUserList.do":
			resTxt = "사용자 리스트";
			break;

		default:
			resTxt = path + "정의되지 않았습니다";
			break;
		}

		System.out.println(resTxt);

	}

}
