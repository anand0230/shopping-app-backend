<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String msg=(String)request.getAttribute("msg");

out.println("LogoutSuccessFull...");


%>
<a href="Home1.html">Back To Home..</a>

</body>
</html>