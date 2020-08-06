<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.springbook.biz.user.impl.UserDAO" %>
<%@ page import="com.springbook.biz.user.UserVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 리스트</title>
</head>
<body>
	<h1>사용자 리스트</h1>
	<div>
	<table><thead>
	<tr>
		<th>번호</th><th>이름</th><th>아이디</th><th>이메일</th><th>상태</th>
	</tr>
	</thead>
<%
	//1. DB 연동처리
	UserVO vo = new UserVO();
	UserDAO userDAO = new UserDAO();
	List<UserVO> userList = userDAO.getUserList(vo);
	
	//2.
	int cno=0;
	out.println("<tbody>");
	for(UserVO user:userList){
		cno++;
		String uname = user.getUname();
		String uid = user.getUserid();
		String uemail = user.getUemail();
		int ustat = user.getUstat();
		
		out.println("<tr><td>" + cno + "</td>");
		out.println("<td>" + uname + "</td>");
		out.println("<td>" + uid + "</td>");
		out.println("<td>" + uemail + "</td>");
		out.println("<td>" + ustat + "</td></tr>");
	}
		out.println("</tbody>");
%>
	</table>