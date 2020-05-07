package com.stepdefinition;

import java.io.IOException;

import com.baseclass.library;
import com.pages.LoginPage;
import com.pages.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps extends library {
	LoginPage lpge;
	RegisterPage rp;
	@Given("^open the browser with url$")
	public void open_the_browser_with_url() throws IOException {
		launchApplication();
	    
	}

	@When("^Clicking an account menu$")
	public void clicking_an_account_menu() {
		lpge = new LoginPage(driver);
		lpge.ClickAccount();
	 }

	@Then("^goto register$")
	public void goto_register() {
		rp = new RegisterPage(driver);
		rp.createAnt();
	    
	}
	@Then("^give all account details$")
	public void give_all_account_details() throws InterruptedException {
		logger.info("Adding details for the account");
		rp.fnamelastname("Abinaya", "Dinesh");
		rp.emailpasswd("Abi@gmail.com", "Hello123", "Hello123");
		rp.AddressandCity("1050 E Bell Rd", "Pheonix");
		rp.selectSatate("Arizona");
		rp.zipcode("85023", "2547896321");
		Thread.sleep(2000);
		rp.createaccountBtn();
	  
	}
	@Then("^Taking screenshots and close App$")
	public void screenshots_and_close_browser() throws IOException{
		logger.info("Take screenshot for register Account");
		screenShot();
		quit();
	}
}
