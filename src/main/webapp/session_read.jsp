<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%
String str = (String)session.getAttribute("sess1");
Integer i = (Integer)session.getAttribute("sess2");
Boolean b = (Boolean)session.getAttribute("sess3");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>세션 읽기</h3>
	<ul>
		<li>문자열 세션: <%= str %></li>
		<li>정수형 세션: <%= i %></li>
		<li>불린 세션: <%= b %></li>
	</ul>
	
	<a href="session_delete.jsp">세션 삭제</a>
	<a href="session_write.jsp">세션 기록</a>
</body>
</html>