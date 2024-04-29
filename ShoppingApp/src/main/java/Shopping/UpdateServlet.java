package Shopping;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/update")

public class UpdateServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	
		
	HttpSession hs=req.getSession(false);
	if(hs==null) {
		
		req.setAttribute("msg", "Session Expired Please Login again...");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
	}else {
		
		 String pid=req.getParameter("pid");
		 int qty=Integer.parseInt(req.getParameter("qty"));
	    
		 ArrayList<ProductBean> al=(ArrayList<ProductBean>)hs.getAttribute("alist");
		 
		 Iterator itr=al.iterator();
		 
		while(itr.hasNext()) {
			ProductBean pb=(ProductBean)itr.next();
			if(pb.getPid().equals(pid)) {
				int k=0;
			if(qty<=pb.getQty()) {
				k=new UpdateDao().update(pb,qty);
			}else {
				req.setAttribute("msg" ,"You have enter more qty its not available only "+pb.getQty()+" is available..");
				req.getRequestDispatcher("Msg.jsp").forward(req, res);
			}
				if(k>0) {
					
					
					req.setAttribute("pbean" ,pb);
					req.setAttribute("qty", qty);
					String s=String.valueOf(qty*pb.getPrice());
					req.setAttribute("total", s);
					
					req.getRequestDispatcher("order.jsp").forward(req, res);
					
					
				}else {
					req.setAttribute("msg" ,"Product did not ordered due to some issue please order again..");
					req.getRequestDispatcher("Msg.jsp").forward(req, res);
					
				}
				
				break;
				
				
			}
			
			
			
		}
		
		
				
			 
	}
		 	
		
	
     
		
		
		
	}

}
