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
@WebServlet("/buy")

public class BuyProductServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	
		
	HttpSession hs=req.getSession(false);
	if(hs==null) {
		
		req.setAttribute("msg", "Session Expired Please Login again...");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
	}else {
		
		 String pid=req.getParameter("pid");
	    
		 ArrayList<ProductBean> al=(ArrayList<ProductBean>)hs.getAttribute("alist");
		 
		 Iterator itr=al.iterator();
		while(itr.hasNext()) {
			ProductBean pb=(ProductBean)itr.next();
			if(pb.getPid().equals(pid)) {
				req.setAttribute("pbean" ,pb);
				req.getRequestDispatcher("qty.jsp").forward(req, res);
				break;
			}
			
			
			
		}
		
		
				
			 
	}
		
		
		
	}

}
