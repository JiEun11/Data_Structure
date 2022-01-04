<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="vo.ProductVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productView.jsp</title>
</head>
<body>
	<nav>
		<h2>선택된 상품 정보는 다음과 같습니다.</h2>
	</nav>
	<hr>
	<% ProductVO po = (ProductVO)session.getAttribute("prdsession"); %>
	<section id="infomation">
		<h4>선택된 사과의 개수 : <%= po.getAppleCnt() %></h4>
		<h4>선택된 바나나의 개수 : <%= po.getBananaCnt() %> </h4>
		<h4>선택된 한라봉의 개수 : <%=  po.getHalabongCnt() %></h4>
	</section>
	<hr>
	<section id="submit_btn">
		<a href="/edu/htmlexam/product.html">상품 선택화면</a>
	</section>
</body>
</html>