<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalTime"%>
<%@ page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>

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
	Calendar cal = Calendar.getInstance();
	 
	cal.setTime(date);
	 
	// 30분 더하기
	cal.add(Calendar.MINUTE, 30);
	String addMin = formatter1.format(cal.getTime()); 
	%>
	
	<h2>
	더 이상 응모할 수 없어요. 
		<%= addMin  %>
	이후에 응모하거나 브라우저를 재기동한 후에 응모하세요.
	
	</h2>
</body>
</html>