package com.stepdefinition;

import cucumber.api.java.en.Given;

public class Session {
	
	
	@Given("^hi is the user$")
	public void hi_is_the_user() {
		
		System.out.println("hi");
	}

}
