package auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//WebFilter("/Servlet1")
public class Filter1 implements Filter {
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String password = request.getParameter("password");
		if (password.equals("admin")) {
			chain.doFilter(request, response);
		} else {
			out.println("Username or Password ERROR !");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		out.println("Login Successfully");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
