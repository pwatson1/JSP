package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookies
 */
public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * Response from server
		 */
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		
		/*
		 * Request to server for browser data
		 * Code creates an array container to hold all cookies set by the site server
		 * 
		 */
		
		Cookie[] cookies = request.getCookies();
		if(cookies == null) {
			out.println("No cookies found.");
		}
		else {
			
			/*
			 * Iterate through cookie key value pair.
			 */
			
		for(Cookie retrievedCookie : cookies) {
			String name = retrievedCookie.getName();
			String value = retrievedCookie.getValue();
			
			out.println(name + " = " + value + "<br/>");
		}
		
		}
		
		/*
		 * Cookies have a name and a value.
		 */
		
		Cookie cookie = new Cookie("user", "Oatmeal Raisin");
		
		/*
		 * Set life span of cookie.
		 */
		
		cookie.setMaxAge(300);
		
		/*
		 * Modify response header.
		 * Response from server
		 */
		
		response.addCookie(cookie);
		
		out.println("Cookie set.<br/>");
		
		out.println("</html>");
	}
	/*
	 * Added 
	 * <CookieProcessor className="org.apache.tomcat.util.http.LegacyCookieProcessor" />
	 * to server context.xml file to get this program to work. 
	 * New settings RFC 6265
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
