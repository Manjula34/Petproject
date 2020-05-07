package com.stepdefinition;

import java.io.IOException;
import com.baseclass.library;
import com.pages.LoginPage;
import com.pages.Forgotpassword;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotpasswordSteps extends library{
	LoginPage lpge;
	Forgotpassword fpwd;
	
	@Given("^launching browser$")
	public void login_to_the_application() throws IOException, InterruptedException {
		launchApplication();
		logger.info("Application launched");
	}
	@When("^click on the account$")
	public void click_on_the_account()  {
		lpge = new LoginPage(driver);
		lpge.ClickAccount();
	}

	@Then("^click forgotpassword and give details$")
	public void select_your_pet() throws InterruptedException {
		fpwd = new Forgotpassword(driver);
		fpwd.forgotpassword("itsmanjudinesh@gmail.com");
		}	

	@Then("^screenshots and close browser$")
	public void screenshots_and_close_browser() throws IOException{
		logger.info("Take screenshot for forgot password");
		screenShot();
		quit();
	}

}
