<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
	<head>
		<meta charset="UTF-8">
		<title>Second page!!!</title>
	</head>
	<body>
		<p> second page </p>
		<% 
			response.sendRedirect("firstPage.jsp");
		%>
	</body>
</html>