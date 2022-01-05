<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorResult.jsp</title>
</head>
<body>
	<h2>요청을 처리하는 동안 오류가 발생했어요..</h2>
	
	<h3>오류의 원인 : <span style="color: red"> ${ requestScope.objcal } </span></h3>
	<a href="/edu/htmlexam/calcForm.html" >입력화면</a>
</body>
</html>