<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Shopping.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

UserBean ub=(UserBean)request.getAttribute("ubean");

   out.println("WelCome User "+ub.getFname()+" <br>");
   
   

%>

<a href="cviewallproduct">ViewAllProduct</a><br>

<a href="ulogout">Logout</a>


</body>
</html>