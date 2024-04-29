package Shopping;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@WebServlet("/uregister")

public class UserRegistrationServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		String uname=req.getParameter("uname");
		String pword=req.getParameter("pword");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String mid=req.getParameter("mid");
		long phno=Long.parseLong(req.getParameter("phno"));
		String addr=req.getParameter("addr");
		
		UserBean ub=new UserBean();
		ub.setUname(uname);
		ub.setPword(pword);
		ub.setFname(fname);
		ub.setLname(lname);
		ub.setMid(mid);
		ub.setPhno(phno);
		ub.setAddr(addr);
		
		
		
		int k=new UserRegisterDAO().register(ub);
		
		if(k>0) {
			req.setAttribute("msg", "Registration successful you can login..");
			req.getRequestDispatcher("registersuccess.jsp").forward(req, res);
			
		}else
		{
			req.setAttribute("msg", "Registration fail");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		
		
		
		
		
	}

}
