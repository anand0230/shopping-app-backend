<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Shopping.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

 
ProductBean pb=(ProductBean)request.getAttribute("pbean");

String s=(String)request.getAttribute("total");
double total=Double.parseDouble(s);

int orderid=new Random().nextInt(10000);
out.println("Your "+pb.getPname()+ " order Successfull ...<br> Total Amount is Only "+total+"Repees. <br> With in 48 hour it will reach you...");
out.println("<br>your Order Id is "+orderid+ " Please keep Your order id Thank You...");

  
%>


</body>
</html>