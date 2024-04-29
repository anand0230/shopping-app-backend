<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Shopping.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
      
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("alist");
String msg=(String)request.getAttribute("msg");

if(al.size()==0){
	out.println("NO productAvailable");
}else{
	Iterator itr=al.iterator();
     
    		out.println("<table> <tr><th>ProductId</th><th>PName</th><th>Price</th><th>Qty</th><tr>");
    	     while(itr.hasNext()){
    	    	 
    	    	 ProductBean pb=(ProductBean)itr.next();
    	    	 out.println("<tr>");
    	    	 out.println("<td>"+pb.getPid()+"</td>");
    	    	 out.println("<td>"+pb.getPname()+"</td>");
    	    	 out.println("<td>"+pb.getPrice()+"</td>");
    	    	 out.println("<td>"+pb.getQty()+"</td>");
    	    	 out.println("</tr>");

    	     }
    	     out.println("</table>");
     }


   

%>

</body>
</html>