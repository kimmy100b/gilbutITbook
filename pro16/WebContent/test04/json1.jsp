<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSON 자료형 사용 실습1</title>
  <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script>
  	$(function(){
  		$("#checkJson").click(function(){
  			var jsonStr = '{"name": ["홍길동","이순신","임꺽정"]}';
  			var jsonInfo = JSON.parse(jsonStr);
  			var output = "회원이름<br>";
  			output += "===========<br>";
  			for(var i in jsonInfo){
  				output += jsonInfo[i] + "<br>";
  			}
  			$('#output').html(output);
  		});
  	});
  </script>
</head>
<body>
<input type="button"  id="checkJson" value="회원이름 확인하기"/>
<div id="output"></div>
</body>
</html>