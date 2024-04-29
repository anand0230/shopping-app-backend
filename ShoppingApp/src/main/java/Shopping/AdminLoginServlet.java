package Shopping;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/alogin")

public class AdminLoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		String uname=req.getParameter("uname");
		String pword=req.getParameter("pword");
		
		AdminBean ab=new AdminloginDAO().login(uname,pword);
		if(ab==null) {
			req.setAttribute("msg", "AdminLogin failed");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else {
			
			HttpSession hs=req.getSession();
			hs.setAttribute("ubean", ab);
			
			
			
			req.setAttribute("ubean",ab);
			req.getRequestDispatcher("aloginsuccess.jsp").forward(req, res);
			
			
		}
				
	  		
		
	}

}
