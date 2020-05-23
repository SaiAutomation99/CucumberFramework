package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
	
	@Given("^User is in Login page$")
	public void user_in_loginpage() {
		System.out.println("login page");
	}
	
	
	@Then("^enter username and password$")
	public void enter_username_password() {
		System.out.println("enter username and password");
	}
	
	@Then("^click on login button$")
	public void click_login_button() {
		
		System.out.println("login button click");
	}

}
