<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
	<head>
		<meta charset="UTF-8">
		<title>session login</title>
	</head>
	<body>
		<!-- 기존에 세션이 있었는지 없었는지를 판단하기위한 구문  -->
		<%
			if(session.getAttribute("memberId_session")!=null)
				response.sendRedirect("logonOK_session.jsp");
		%>
		<form action="loginCon_session" method="post">
			ID: <input type="text" name="mID_session"></br>
			PASSWORD : <input type="password" name="mPW_session"></br>
			<input type="submit" value="login">

		</form>
		
	</body>
</html>