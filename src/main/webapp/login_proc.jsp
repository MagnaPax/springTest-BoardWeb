<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.springbook.biz.user.impl.UserDAO" %>
<%@ page import="com.springbook.biz.user.UserVO" %>
<%
//1. 사용자 정보 입력
String id=request.getParameter("userid");
String pw=request.getParameter("userpw");
out.println("id:"+id+"pw:"+pw);
%>