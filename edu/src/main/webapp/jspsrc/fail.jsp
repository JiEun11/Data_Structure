<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalTime"%>
<%@ page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Date date = new Date(session.getCreationTime()); // session 생성시간
	SimpleDateFormat formatter1 = new SimpleDateFormat("HH시 mm분");
	String sessionTime = formatter1.format(date);

	String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분"));
	%>
	<h2>
		세션 생성 시간 :
		<%=sessionTime%>
	</h2>
	<h2>
		현재 시간 :
		<%=currentTime%>에 실패, 아쉽아쉽!!
	</h2>
</body>
</html>