<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������â</title>
</head>
<body>
<h1>��� ���</h1>
<% 
	request.setCharacterEncoding("utf-8");
	String user_id = request.getParameter("user_id");
	String user_pw = request.getParameter("user_pw");
%>
<h1>���̵� : <%= user_id %></h1>
<h1>��й�ȣ : <%= user_pw %></h1>
</body>
</html>