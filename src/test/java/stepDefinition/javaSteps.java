package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class javaSteps {

		// TODO Auto-generated method stub

		@Given("I want to write a step with precondition")
		public void i_want_to_write_a_step_with_precondition() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("inside given");
		}
		
		@When("I complete action")
		public void i_complete_action() {
		    // Write code here that turns the phrase above into concrete actions
			   System.out.println("inside when");
		}
		
		@Then("I validate the outcomes")
		public void i_validate_the_outcomes() {
		    // Write code here that turns the phrase above into concrete actions
			   System.out.println("inside Then");
		}


}
