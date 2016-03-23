<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="practice.Emp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Emp emp = new Emp("0001","たなか");
		String id = emp.getId();
		String name = emp.getName();
	%>
	<%for(int i = 0; i < 10; i++){%>
		<%if(i % 3 != 0){%><p style="color:red"><% %><p>ID: <%= id %> NAME: <%= name %> <%= i %>回目</p><%} %>
	<%} %>
</body>
</html>