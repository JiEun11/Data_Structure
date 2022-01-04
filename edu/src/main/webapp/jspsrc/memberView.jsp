<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="vo.MemberVO" %>
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
	<%
		MemberVO mv = (MemberVO)request.getAttribute("objmem");
	%>
	<ul>
		<li>회원 이름 : <%= mv.getUsname() %></li>
		<li>회원 계정 : <%= mv.getUsid() %></li>
		<li>회원 암호 : <%= mv.getUspw() %></li>
		<li>회원 전화번호 : <%= mv.getUsphoneNum() %></li>
	</ul>
</body>
</html>