package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Actions.PageActions;


public class loginsteps {
	PageActions actions = new PageActions();
	
	//Added Regex TO ^...$ to match the Pattern/Feature
	@Given("^Launch the driver$")
	public void Launch_the_driver() throws InterruptedException {
		actions.LaunchDriver();

	}
	
	@Given("^Launch the Guru99 Webpage$")
	public void Launch_the_Guru99() throws InterruptedException {
		actions.LaunchGuru99();

	}
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_login_page() {
		actions.login_page();
	    }
	
	@Then("^Launch the flipkart Webpage$")
	public void Launch_the_flipkart() throws Exception {
		actions.LaunchFlipkart();

	}
	
	@When("^User is on Login Page childwindow$")
	public void Loginpage_Flipkart() throws Exception {
		actions.Login_Childwindow();

	}
	
	

	@When("^User Enter the Credentials$")
	public void user_enter_the_credentials() {
		System.out.println("Login Credentials are Entered");;
	}

	@And("^Click On Login Button$")
	public void click_on_login_button() {
		System.out.println("User Has clicked the Login Button");
	}

	@Then("^User Is navigated to the Home Page$")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("User Has Navigated to the Home Page");
	}

}
