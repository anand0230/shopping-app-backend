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
@WebServlet("/cviewallproduct")

public class cViewallProductServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	
		
	HttpSession hs=req.getSession(false);
	if(hs==null) {
		
		req.setAttribute("msg", "Session Expired Please Login again...");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
	}else {
		
		ArrayList<ProductBean> al=new ProductDAO().getproduct();
		hs.setAttribute("alist", al);
		req.setAttribute("msg", "These All Items Are Available");
		req.getRequestDispatcher("cviewAllproduct.jsp").forward(req, res);
		
	}
     
		
		
		
	}

}
