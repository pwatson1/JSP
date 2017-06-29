package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    			   /*
    			    * (non-Javadoc) -- counting the number of get requests
    			    */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * Track the number of hits to your site
		 * i.e. your application. Start by getting the 
		 * context object. 
		 */
		
		ServletContext context = getServletContext();
		
		/*
		 * Asking for an attribute that hasn't been created yet
		 * and giving it the name "hits".
		 */
		Integer hits = (Integer)context.getAttribute("hits");
		
		if(hits == null) {
			hits = 0;
		
		}
		else {
			hits++;
		
		}
		/*
		 * Remember the attribute named "hits" and its' associated
		 * value of the integer hits
		 */
		context.setAttribute("hits", hits);
		
		PrintWriter out = response.getWriter();
		
		out.println("hits: " + hits);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
