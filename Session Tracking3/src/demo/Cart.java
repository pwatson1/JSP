package demo;
/*
 * Beans are a mechanism for sharing data between your JSP pages.
 * You can't use beans in servlets.
 */
public class Cart {
	
	private int totalItems = 0;

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	

}
