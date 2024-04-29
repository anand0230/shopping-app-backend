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

AdminBean ab=(AdminBean)request.getAttribute("ubean");

   out.println("WelCome Admin "+ab.getFname()+"<br>");
   
  
%>

<a href="viewallproduct">ViewAllProduct</a><br>

<a href="AddProduct.html">AddProduct</a><br>
<a href="alogout">Logout</a><br>


</body>
</html>