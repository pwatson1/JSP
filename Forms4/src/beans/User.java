package beans;
/*
 * Beans are a mechanism for sharing data between your JSP pages.
 * You can't use beans in servlets.
 */
public class User {
	private String email;
	private String password;

	private String message = "Error validating message";

	public User() {

	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

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

	/*
	 * No need for a setter for message because the boolean sets the message.
	 */
	
	/*
	 * The boolean states if validate, return true, "success" but if any of the 
	 * scenarios are true, return false, "failure".
	 */
	
	public String getMessage() {
		return message;
	}

	public boolean validate() {
		
		if(email==null) {
			message = "No email set.";
			return false;
		}
		
		if(password==null) {
			message = "No password set.";
			return false;
		}
		
		if(email.matches("")) {
			message = "Invalid email address.";
			return false;
		}
		
		if(!email.matches("([A-Za-z\\_\\d+@\\W+])+")) {
			message = "Invalid email address.";
			return false;
		}

		if (password.length() < 8) {
			message ="password must be at least 8 characters";
			return false;
		} 
		else if (password.matches("\\w*\\s+\\w*")) {
			message = "Password cannot contain space.";
			return false;

		}		
			return true;
		
		

	}

}
