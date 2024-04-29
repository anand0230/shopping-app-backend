package Shopping;
import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/addproduct")

public class AddProductServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	
		
	HttpSession hs=req.getSession(false);
	if(hs==null) {
		
		req.setAttribute("msg", "Session Expired Please Login again...");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
	}else {
		
		 String pid=req.getParameter("pid");
		 String pname=req.getParameter("pname");
		 double price=Double.parseDouble(req.getParameter("price"));
		 int qty=Integer.parseInt(req.getParameter("qty"));
		 	
		 ProductBean pb=new ProductBean();
		 pb.setPid(pid);
		 pb.setPname(pname);
		 pb.setPrice(price);
		 pb.setQty(qty);
		 int k=new AddProductDAO().addproduct(pb);
		 if(k>0)
		 {
			 req.setAttribute("msg", "productAdded");
				req.getRequestDispatcher("ProductAdded.jsp").forward(req, res);
				
			 
		 }else {
			 req.setAttribute("msg", "ProductNot Added");
				req.getRequestDispatcher("Msg.jsp").forward(req, res);
				
			 
		 }
		 	
		
	}
     
		
		
		
	}

}
