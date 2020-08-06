<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.springbook.biz.user.impl.UserDAO" %>
<%@ page import="com.springbook.biz.user.UserVO" %>
<%
//1. 사용자 정보 입력
String id=request.getParameter("userid");
String pw=request.getParameter("userpw");
out.println("id:"+id+"pw:"+pw);
//2. DB 연동처리
UserVO vo = new UserVO();
vo.setUserid(id);
vo.setUserpw(pw);
UserDAO userDAO = new UserDAO();
UserVO user = userDAO.getLoger(vo);

//3. 
if(user==null){
	//로그인 실패
	out.println("로그인실패");
//	response.sendRedirect("index.jsp");
}else{
	//로그인 성공
	out.println("로그인성공");
//	response.sendRedirect("userList.jsp");
}
%>