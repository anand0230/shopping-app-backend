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
ProductBean pb=(ProductBean)request.getAttribute("pbean");
out.println("Enter "+pb.getPname()+" Quantity: ");

%>

<form action="update" method="post">

    <input  type="hidden" name="pid" value="<%=pb.getPid()%>">
    <input type="text" name="qty" value="<%=pb.getQty() %>">
    
    <input type="submit" value="Buy">




</form>


</body>
</html>