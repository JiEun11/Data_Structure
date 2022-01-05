<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calcResult.jsp</title>
</head>
<body>
	<nav>
		<h2>연산 요청 결과</h2>
	</nav>
	<br>
	
	
	<h4>결과 : ${ requestScope.objcal }</h4>
	<a href="/edu/htmlexam/calcForm.html">입력화면</a>
</body>
</html>