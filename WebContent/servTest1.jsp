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
<%-- 	<% --%>
<%-- 		Emp emp = new Emp("0001","たなか");
 		String id = emp.getId();
 		String name = emp.getName();--%>
<%-- 	%> --%>
<%-- 	<%for(int i = 0; i < 10; i++){%> --%>
<%-- 		<%if(i % 3 != 0){%><p style="color:red"><% %><p>ID: <%= id %> NAME: <%= name %> <%= i %>回目</p><%} %> --%>
<%-- 	<%} %> --%>
	<form action ="/ServletPractice/Form" method = "post">
	名前：<input type ="text" name = "name">
	性別：男<input type ="radio" name = "gender" value="0">
		  女<input type ="radio" name = "gender" value="1">
	<input type ="submit" value ="登録">
	</form>
	<br><br><br>

	<form action ="/ServletPractice/testenq" method = "post">
	名前：<input type ="text" name = "name"><br>
	種別：<select name = "qType">
		<option value="">選択してください</option>
		<option value="1">会社について</option>
		<option value="2">製品について</option>
		<option value="3">アフターサポートについて</option>
	</select><br>
	内容<br>
	<textarea name = "content" ></textarea>
	<input type ="submit" value ="送信">
	</form>
</body>
</html>