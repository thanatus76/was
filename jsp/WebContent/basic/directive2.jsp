<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int a = 1;
		int b = 0;
		
		out.print(a + b);
		out.print(a - b);
		out.print(a * b);
		out.print(a / b);
	%>
</body>
</html>