package ScenarioOutlineExample;

import cucumber.api.java.en.Given;

public class ScenarioOutlineExamples {
	
	
	@Given("^user is in the \"(.*)\" loginpage")
	public void user_is_in_loginpage(String name) {
		
		
		System.out.println(name);
	}

}
