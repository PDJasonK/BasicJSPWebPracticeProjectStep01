<%@ page import = "java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
ArrayList<String> lists = new ArrayList<String>();
lists.add("리스트");
lists.add("컬렉션");
session.setAttribute("lists" , lists);

%>

<!DOCTYPE html>
<html>
<head><title>Session 영역</title>
<meta charset="UTF-8">
</head>
<body>
<h2> 페이지 이동 후 session 영역의 속성읽기</h2>
<a href = "SessionLocation.jsp"> SessionLocation.jsp 바로가기</a>
</body>
</html>