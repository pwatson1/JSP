package controller;

import java.io.IOException;
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		String page = null;
		
		if(action==null) {
			page = "/error.jsp";
		}
		else if(action.equals("about")) {
			page="/about.jsp";
		}
		else if (action.equals("login")) {
			page="/login.jsp";
		}
		else {
			page="/error.jsp";
		}
		/*
		 * You only get one context per application but you may have multiple 
		 * servlets per context and each servlet has its own configuration.
		 * The RequestDispatcher replaces the current URL file location with a
		 * new designated location. The forward takes both HTTPServlet request
		 * and response objects 
		 */
		getServletContext().getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
