package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ExamplesScenario1 {
	
	
//	@Given("^user logined page\"(.*)\"$")
//	public void user_in(String url) {
//		
//		System.out.println(url);
//	}
//	
//	@Then("^clicked on \"(.*)\" button$")
//	public void click_on_button(String name) {
//		System.out.println(name);
//		
//	}
//			

	@Given("^user logined page<\"([^\"]*)\">$")
	public void user_logined_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(arg1);
	}

	@Then("^clicked on <\"([^\"]*)\"> button$")
	public void clicked_on_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println(arg1);

	}


}
