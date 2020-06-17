package Parameterization_Singleline;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SingleLine {
	
	
	@Given("^In login page$")
	public void in_Login_page() {
		
		
		System.out.println("login page");
	}
	
	
	@Then("^enter password$")
	public void enter(DataTable name) {
		
		List<List<String>> list=	name.raw();
		System.out.println(list.get(0).get(0));
		System.out.println(list.get(1).get(0));

	}
	
	
	@Then("^click onlogin$")
	public void click_onlogin(DataTable names) {
		
		List<List<String>> list=	names.raw();
		
		System.out.println(list.get(0).get(0));
		
		
		
	}

}
