package cucumber1package;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition2 {
	@Given("^Browser must be installed by the user$")
	public void browser_must_be_installed_by_the_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Browser must be installed by the user");
	}

	@When("^User enters AUT URL in the browser$")
	public void user_enters_AUT_URL_in_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters AUT URL in the browser");
	 
	}

	@Then("^Application must open in the browser$")
	public void application_must_open_in_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Application must open in the browser");
	}

	@Given("^user must be registered$")
	public void user_must_be_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user must be registered");
	}

	@When("^user must enter the cedentials and confirm login$")
	public void user_must_enter_the_cedentials_and_confirm_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^user must enter the cedentials and confirm login");
	}

	@Then("^user must be in the homepage$")
	public void user_must_be_in_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user must be in the homepage");
	}

	@Given("^user must be logged in$")
	public void user_must_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user must be logged in");
	}

	@When("^search for a product$")
	public void search_for_a_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("search for a product");
	}

	@Then("^Product details must be displayed to the user$")
	public void product_details_must_be_displayed_to_the_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Product details must be displayed to the user");
	}


 
  }

