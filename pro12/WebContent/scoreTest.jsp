<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	int score = Integer.parseInt(request.getParameter("score"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수 출력창</title>
</head>
<body>
	<h1>시험점수 : <%= score %>점</h1>
	<%
	if(score>100 || score<0){
		response.sendRedirect("/pro12/scoreTestError.jsp");
	}
	if(score>=90){
	%>
		<h1>A학점입니다.</h1>
	<%
	}else if(score>=80){
	%>
		<h1>B학점입니다.</h1>
	<%
	}else if(score>=70){
	%>
		<h1>C학점입니다.</h1>
	<%
	}else{
	%>
		<h1>F점입니다.</h1>
	<%
	}
	%>
	<br>
	<a href="/pro12/scoreTest.html">시험점수입력</a>
</body>
</html>