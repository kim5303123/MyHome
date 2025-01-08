<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String param1 = request.getParameter("param1");
String param2 = request.getParameter("param2");
%>
<div id="header">
	<h1>My Homepage</h1>
	<h3>전달된 파라미터</h3>
	<ul>
		<li>param1: <%=param1%>
		</li>
		<li>param2: <%=param2%>
		</li>
	</ul>
</div>
<!-- /header -->


