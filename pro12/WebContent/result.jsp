<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>결과출력창</title>
</head>
<body>
<h1>결과 출력</h1>
<% 
	request.setCharacterEncoding("utf-8");
	String user_id = request.getParameter("user_id");
	String user_pw = request.getParameter("user_pw");
%>
<h1>아이디 : <%= user_id %></h1>
<h1>비밀번호 : <%= user_pw %></h1>
</body>
</html>