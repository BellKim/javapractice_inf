<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
	<head>
		<meta charset="UTF-8">
		<title>공유를 위한 페이지 </title>
	</head>
	<body>
		<!--    %! 는 선언문, 그냥 % 는 java 문법 -->
		<%!
			String adminID;
			String adminPW;
			
			String imgDir;
			String testServerIP;
			String realServerIP;
		%>
		
		<%
			adminID = config.getInitParameter("adminID");
			adminPW = config.getInitParameter("adminPW");
		%>
		
		<p> adminID : <%= adminID %> </p>
		<p> adminPW : <%= adminPW %> </p>
		
		<%
			imgDir = application.getInitParameter("imgDir");
			testServerIP = application.getInitParameter("testServerIP");
			realServerIP= application.getInitParameter("realServerIP");
			
		%>
		<p> imgDir  : <%= imgDir %> </p>
		<p> testServerIP : <%= testServerIP %> </p>
		<p> realServerIP : <%= realServerIP %> </p>
		
		
	</body>
</html>