package com.stepdefinition;

import cucumber.api.java.en.Given;

public class Step {
	
	
	
	@Given("^then enter user \"(.*)\" and \"(.*)\"$")
	public void then_enter_user(String arg1, String arg2) throws Throwable {
		System.out.println(arg1);
		System.out.println(arg2);
	}
	

}
