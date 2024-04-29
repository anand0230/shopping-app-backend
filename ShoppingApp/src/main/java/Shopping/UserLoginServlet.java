package Shopping;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/ulogin")

public class UserLoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		String uname=req.getParameter("uname");
		String pword=req.getParameter("pword");
		
		UserBean ub=new userloginDAO().login(uname,pword);
		if(ub==null) {
			req.setAttribute("msg", "UserLogin failed");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else {
			
			HttpSession hs=req.getSession();
			hs.setAttribute("ubean", ub);
			
			
			
			req.setAttribute("ubean",ub);
			req.getRequestDispatcher("uloginsuccess.jsp").forward(req, res);
			
			
		}
				
	   
		
		System.out.println("login"+uname+pword);
		
		
	}

}
