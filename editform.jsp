<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="pro.empDao,pro.emp"%>  
  
<%  
String id=request.getParameter("id");  
emp u=empDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="editemp.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>  
<tr><td>Name:</td><td>  
<input type="text" name="name" value="<%= u.getName()%>"/></td></tr>  
<tr><td>salary:</td><td>  
<input type="text" name="sal" value= "<%=u.getSal()%>"/></td></tr>   
<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
</table>  
</form>  
</body>
</html>