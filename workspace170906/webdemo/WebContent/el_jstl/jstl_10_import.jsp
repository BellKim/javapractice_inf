<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_010_import</title>
</head>
<body>
	<%-- jsp:include액션태그와 같은 기능ㅇ을 처리한다. --%>
	<p>before</p>
	
	<c:import url="jstl_10_top.jsp">
		<c:param name="data" value="100"/>
	</c:import>
	<p>after</p>

</body>
</html>