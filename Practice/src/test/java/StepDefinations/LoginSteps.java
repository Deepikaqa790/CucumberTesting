package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside steps - user is on login page");
	}

	@When("User enters username and Password")
	public void user_enters_username_and_password() {
		 System.out.println("Inside steps - enter username and password");
	}

	@And("Clicks login button")
	public void clicks_login_button() {
		 System.out.println("Inside steps - clicks on login button");
	}

	@Then("User is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		 System.out.println("Inside steps - user is navigate to homepage");
	}


}
