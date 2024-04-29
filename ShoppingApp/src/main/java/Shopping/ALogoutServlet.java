package Shopping;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/alogout")

public class ALogoutServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession hs=req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else {
			hs.removeAttribute("abean");
			hs.removeAttribute("alist");
			hs.invalidate();
			
		
			req.setAttribute("ubean","Logout SuccessFull..");
			req.getRequestDispatcher("Logout.jsp").forward(req, res);
			
			
		}
				
	  		
		
	}

}
