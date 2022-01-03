<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalTime"%>
<%@ page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//LocalTime time = LocalTime.now();
	Date date = new Date(session.getCreationTime());
	SimpleDateFormat formatter1 = new SimpleDateFormat("HH시 mm분");
	String curTime = formatter1.format(date);
	%>
	<h2>
		<%= curTime %>
		에 실패~~ 아쉽아쉽!
	
	</h2>
</body>
</html>