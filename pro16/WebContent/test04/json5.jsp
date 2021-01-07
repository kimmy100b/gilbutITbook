<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>AJAX를 이용해 JSON주고받기</title>
  <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script>
  	$(function(){
  		$("#checkJson").click(function(){
  			var _jsonInfo = '{"name": "박지성", "age":"25", "gender":"남자", "nickname":"날센돌이"}';
  			$.ajax({
  				type: "post",
  				async: false,
  				url: "${contextPath}/json",
  				data: {jsonInfo: _jsonInfo},
  				success: function(data,textStatus){
  					
  				},
  				error: function(data,textStatus){
  					alert("에러가 발생했습니다");
  				}
  			});//end ajax
  		});
  	});
  </script>
</head>
<body>
<input type="button"  id="checkJson" value="회원이름 확인하기"/>
<div id="output"></div>
</body>
</html>