package org.stepdefenition;

import org.bassclass.BaseClass;
import org.pojo.AmazonSignInPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class AmazonRegister extends BaseClass {

	AmazonSignInPojo a;

	@Given("To launch browser and mximize the window")
	public void to_launch_browser_and_mximize_the_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch the amazon application")
	public void to_launch_the_amazon_application() {
		launchUrl("https://www.amazon.in");

	}

	@When("To Click sign in accounts")
	public void to_Click_sign_in_accounts() {
		a = new AmazonSignInPojo();
		clickBtn(a.getSignin());

	}

	@When("To click new amazon account")
	public void to_click_new_amazon_account() {
		a = new AmazonSignInPojo();
		clickBtn(a.getCreateYourAcc());

	}

	@When("To pass firstname in firstbox")
	public void to_pass_firstname_in_firstbox() {
		a = new AmazonSignInPojo();
		passText("sasi", a.getNamebox());

	}

	@When("To pass the mobile number")
	public void to_pass_the_mobile_number() {
		a = new AmazonSignInPojo();
		passText("9998998", a.getMobileno());

	}
	
	@When("to enter the email")
	public void to_enter_the_email() {
		a = new AmazonSignInPojo();
		passText("Azeela", a.getPass());
		
	}

	@When("To set password")
	public void to_set_password() {
		a = new AmazonSignInPojo();
		passText("azee", a.getEmail());

	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
		// closeEntireBrowser();

	}

}
