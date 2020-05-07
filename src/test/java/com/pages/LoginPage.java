package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
			
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="hdr-account")
	WebElement account;
	
	@FindBy(linkText="Sign In")
	WebElement sign;
	
	@FindBy(id="WC_AccountDisplay_FormInput_logonId_In_Logon_1")
	WebElement Email;
	
	@FindBy(id="WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")
	WebElement pwd;
	
	@FindBy(id="WC_AccountDisplay_links_2")
	WebElement login;
	
	public void ClickAccount() {		
		/*Actions act= new Actions(driver);
		act.moveToElement(account);
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(sign));
		sign.click();*/
		
		account.click();
	}
	
	public void setemail(String email) {
		Email.sendKeys(email);
	}
	public void setpasswd(String password) throws InterruptedException {
		Thread.sleep(1000);
		pwd.sendKeys(password);
	}
	public void clicklogin() {
		login.click();
	}
	
	
	public void login(String email,String password) {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs("Sign in"));
		Email.sendKeys(email);
		pwd.sendKeys(password);
		login.click();
		
	}

	
}
