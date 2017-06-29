package demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session
 */
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		/*
		 * Check the session to see if there is a cart object.
		 */
		
		Cart cart = (Cart)session.getAttribute("cart");
		
		String action = request.getParameter("action");
		
		/*
		 * If there is no cart object create one.
		 */
		
		if(action == null) {
			cart = new Cart();	
			/*
			 * Set the items in the cart.
			 */
			cart.setTotalItems(7);
			/*
			 * Set the cart in the session.
			 */
			session.setAttribute("cart", cart);
			/*
			 * Forward the cart to showCart.jsp
			 */
			
			/*
			 * You only get one context per application but you may have multiple 
			 * servlets per context and each servlet has its own configuration.
			 * The RequestDispatcher replaces the current URL file location with a
			 * new designated location. The forward takes both HTTPServlet request
			 * and response objects 
			 */
			getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
			/*
			 * Since I use multiple if statement blocks, in order to use the 
			 * another forward or redirect, I must end this block with a return 
			 * statement. If I had followed this up with an else block I wouldn't 
			 * need the return statement.
			 */
			return;
		}
		else if(action.equals("showCart2")) {
			getServletContext().getRequestDispatcher("/showCart2.jsp").forward(request, response);
			return;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
