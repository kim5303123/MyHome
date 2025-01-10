<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%
//	개별 세션 값의 삭제
// session.removeAttribute("sess1");
// session.removeAttribute("sess2");

//	세션 전체를 무효화 할 때
session.invalidate();

response.sendRedirect("session_read.jsp");
%>