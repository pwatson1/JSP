package beans;

/*
 * Beans are a mechanism for sharing data between your JSP pages.
 * You can't use beans in servlets.
 */
public class User {
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
