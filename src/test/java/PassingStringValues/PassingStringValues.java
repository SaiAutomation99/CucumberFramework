package PassingStringValues;

import cucumber.api.java.en.Given;

public class PassingStringValues {
	
	
	@Given("^user \"(.*)\" is in login page \"(.*)\"$")
	public void user_in_loginpage(String username,String password) {
		
		System.out.println(username);
		System.out.println(password);
		
	}
	
	

}
