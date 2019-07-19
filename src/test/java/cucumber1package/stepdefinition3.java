package cucumber1package;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition3 {
	@Given("^User must be registred$")
	public void user_must_be_registred() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User must be registred");
	 
	}

	@When("^User must give abc(\\d+) and abc(\\d+)$")
	public void user_must_give_abc_and_abc(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User must give name1 and pass1");
	}

	@Then("^User must be in homepage$")
	public void user_must_be_in_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User must be in homepage");
	}

	@When("^User must give xyz(\\d+) and xyz(\\d+)$")
	public void user_must_give_xyz_and_xyz(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User must give name2 and pass2");
	}


}
