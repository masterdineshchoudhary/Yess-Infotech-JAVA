package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SetCookie")
public class SetCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			String name = request.getParameter("name");
			Cookie c = new Cookie("MyCookies", name);
			response.addCookie(c);
			
			PrintWriter out = response.getWriter();
			out.println("Hi welcome to servlet "+name);
			out.println("<a href='GetCookie' > Go to MsgBox</a>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
