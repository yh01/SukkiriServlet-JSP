<%@page import="serv1.RegisterUserLogic"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "serv1.User" %>
<% User registerUser = (User) session.getAttribute("registerUser"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
ログインID:<%= registerUser.getId() %>
名前:<%= registerUser.getName() %>
<a href = "/ServletPractice/RegisterUser">戻る</a>
<a href = "/ServletPractice/RegisterUser?action=done">登録</a>
</body>
</html>