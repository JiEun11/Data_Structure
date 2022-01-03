<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>go.jsp</title>
</head>
<body>

<%	
	String study = request.getParameter("study");
	
	if(study == null){

		out.print("<h2>study라는 이름으로 전달된 쿼리가 존재하지 않습니다 </h2>");
	
	}else{
		if(study.equals("javascript")){
			response.sendRedirect("http://www.w3schools.com/js/default.asp");
		}else if(study.equals("dom")){
			response.sendRedirect("http://www.w3schools.com/js/js_htmldom.asp");
		}else if(study.equals("ajax")){
			response.sendRedirect("http://www.w3schools.com/xml/ajax_intro.asp");
		}else if(study.equals("json")){
			response.sendRedirect("http://www.w3schools.com/js/js_json_intro.asp");
		}else if(study.equals("jsp")){
		
%>
		<jsp:forward page="/jspsrc/exam6.jsp?dan=7" />
<%			
		}else if(study.equals("html")) {
%>
		<jsp:forward page="/htmlexam/first.html"/>
<%	
		}	
	}
%>
	
</body>
</html>