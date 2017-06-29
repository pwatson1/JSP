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
		
		/*
		 * Create a session object
		 */
		
		HttpSession session = request.getSession();
		
		/*
		 * Check the session to see if there is a cart object.
		 * Asking for the cart object.
		 */
		
		Cart cart = (Cart)session.getAttribute("cart");
		
		/*
		 * If there is no cart, create a cart object.
		 */
		
		if(cart == null) {
			cart = new Cart();
		}
		
		/*
		 * Set the item property in cart.
		 */
		
		cart.setTotalItems(7);
		
		/*
		 * Set the cart in the session.
		 * Call it "cart" and give it a cart attribute.
		 */
		
		session.setAttribute("cart", cart);
		
		/*
		 * Forward the cart to showCart.jsp
		 */
		
		getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
