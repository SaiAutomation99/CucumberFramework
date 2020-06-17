package Tags;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TagsStepDefinition {
	
	
	
	
	@Given("^firstStep$")
	public void firstStep() {
		
		System.out.println("firststep");
		
	}
	
	
	@Then("^secondstep$")
	public void secondstep() {
		
		System.out.println("secondstep");
		
	}
	@Given("^firstStep1$")
	public void firstStep1() {
		
		System.out.println("firstStep1");
		
	}
	
	
	@Then("^secondstep2$")
	public void secondstep2() {
		
		System.out.println("secondstep2");
		
	}

	@Given("^firstStep3$")
	public void firstStep3() {
		
		System.out.println("firstStep3");
		
	}
	
	
	@Then("^secondstep4$")
	public void secondstep4() {
		
		System.out.println("secondstep4");
		
	}


}
