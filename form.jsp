<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="viewemp.jsp">View All Records</a><br/>  
  
<h1>Add New User</h1>  
<form action="addemp.jsp" method="post">  
<table>  
<tr><td>ID:</td><td><input type="text" name="id"/></td></tr>  
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>  
<tr><td>SALARY:</td><td><input type="text" name="sal"/></td></tr>  
<tr><td colspan="2"><input type="submit" value="Add User"/></td></tr>  
</table>  
</form>  
</body>
</html>