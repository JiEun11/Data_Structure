<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="vo.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberView.jsp</title>
</head>
<body>
	<nav>
		<h2>회원 정보</h2>
	</nav>
	<hr>
	
	<ul>
		<li>회원 이름 : ${ requestScope.objmem.usname } </li>
		<li>회원 계정 : ${ requestScope.objmem.usid }</li>
		<li>회원 암호 : ${ requestScope.objmem.uspw }</li>
		<li>회원 전화번호 : ${ requestScope.objmem.usphoneNum }</li>
	</ul>
</body>
</html>