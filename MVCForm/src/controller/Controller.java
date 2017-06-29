package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/* Handling get requests from pages */
		String action = request.getParameter("action");

		if (action == null) {
			request.getRequestDispatcher("/index.jsp").forward(request, response);


		} else if (action.equals("login")) {

			request.setAttribute("email", "");
			request.setAttribute("password", "");
			request.setAttribute("validationmessage", "");
			
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/* handling post requests from forms */
		
		String action = request.getParameter("action");
		
		/*
		 * The value for action is being set on the login.jsp page. If the value
		 * has not been set the code below will send the user to the index.jsp page.
		 * However, if the action has been set and is equal to dologin, the servlet
		 * will try to verify the email and password.
		 */

		if (action == null) {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else if (action.equals("dologin")) {

			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			/*
			 * setAttribute retains the input keyed into the JSP.
			 */

			request.setAttribute("email", email);
			
			/*
			 * Setting the attribute on the password is not secure.
			 */
			
			request.setAttribute("password", password);

			User user = new User(email, password);

			if (user.validate()) {
				request.getRequestDispatcher("/loginsuccess.jsp").forward(request, response);
			} else {
				
				/*
				 * If validation fails, show the validation message on the login 
				 * page.
				 */
				
				request.setAttribute("validationmessage", user.getMessage());
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
	}

}
