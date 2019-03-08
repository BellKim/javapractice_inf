<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%!
			int num = 12;
			String str = "jsp";
			ArrayList<String> list = new ArrayList<String>();
			public void jspMethod(){
				System.out.println(num + str );
			}
		%>
		
		<!-- 스크립트릿 태그 -->
		<%
			if(num>0){
		%>
			<p>num > 0 </p> <!-- html코드 -->
		<%

			}else{
		%>
			<p> num <=0 </p> <!-- html코드 -->
		<%
			}
		%>
		<!-- 뷰 페이지를 위해서만 사용하지, 큰 대규모 파일을 만들기 위해서 사용하지는 않는다. 2가지 언어가 복합적으로 섞여있기 때문이다. -->
		<!--  표현식 태그 -->
		num is <%= num %>   <!-- html 과  java 변수 num 사용. -->
		
		
		
		<!--  jsp 지시어 
			 w지시어는 @ 를 추가해준다. <%@  %>
			 
			 1. 페이지 기본설정
			 	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
			 2. include 파일설정
			 	<%@ include file = "header.jsp" %>
			 3. taglib 외부라이브러리 태그설정 (외부 라이브러리를 사용하겠다.)
			 	<%@ taglib uri="http://java.sun.com/jsp/list/core" prefix="c"  %>
			 
		-->
		
		
		
	</body>
</html>