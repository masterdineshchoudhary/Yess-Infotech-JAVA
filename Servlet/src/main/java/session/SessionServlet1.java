package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet1")
public class SessionServlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String n = request.getParameter("name");
			out.print("Welcome "+n);
			
			HttpSession session = request.getSession();
			session.setAttribute("uname", n);
			out.print("<a href='SessionServlet2'>visit</a>");
			out.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
