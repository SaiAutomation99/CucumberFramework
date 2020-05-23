package com.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TagsStepDefinition {
	
	
	
	@Before("@Before")
	public void m1() {
		System.out.println("m1 method");
		
	}
	@Given("^user uses tags$")
	public void user_uses_tags() {
		
		
		System.out.println("first step");
	}
	
	@Then("^also uses tags$")
	public void als_uses_tags() {
		
		System.out.println("second step");
		
		
	}
	
	

}
