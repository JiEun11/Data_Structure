<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Learning Example 1</title>
</head>
<body>
	<h1>JSP Example</h1>
	<hr>
	<h3>Current Time info : <%= java.time.LocalDateTime.now() %></h3>
</body>
</html>