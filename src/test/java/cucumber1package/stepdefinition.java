package cucumber1package;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	    System.out.println("User must be registered ");
	}

	@When("^User must enter the cedentials and confirm login$")
	public void user_must_enter_the_cedentials_and_confirm_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("User must Login ");
	}

	@Then("^User must be in the homepage$")
	public void user_must_be_in_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("User should be in homepage ");
	}
	@Given("^User must not be logged in$")
	public void user_must_not_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User must not be logged in ");
	 
	}

	@When("^User enters all mandatory fields$")
	public void user_enters_all_mandatory_fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User enters all mandatory fields ");
	
	}

	@Then("^Registration done successfully$")
	public void registration_done_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Registration done successfully ");
	
	}

	@Given("^User must be logged in$")
	public void user_must_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User must be logged in ");
	 
	}

	@When("^Search for a product$")
	public void search_for_a_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Search for a product ");
	  
	}

	@Then("^Product detail must be displayed$")
	public void product_detail_must_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Product detail must be displayed ");
	}




}
