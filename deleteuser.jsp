<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="pro.empDao"%>  
<jsp:useBean id="u" class="pro.emp"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
empDao.delete(u);  
response.sendRedirect("viewemp.jsp");  
%>
</body>
</html>