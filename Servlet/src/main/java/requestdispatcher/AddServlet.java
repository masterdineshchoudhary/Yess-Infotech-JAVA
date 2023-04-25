package requestdispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// on which url you want to call the servlet
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		int k = n1+n2;
		
		response.sendRedirect("SqServlet?k="+6);
		
//		request.setAttribute("k", k);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("/SqServlet");
//		rd.forward(request, response);
	}

}
