package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forgotpassword {
	
WebDriver driver;
	
	public Forgotpassword(WebDriver rdriver) {
			
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='WC_PasswordResetForm_FormInput_logonId_In_ResetPasswordForm_1']")
	WebElement Femail;
   
	@FindBy(id="WC_PasswordResetForm_Link_2")
	WebElement summit;
	@FindBy(id="WC_AccountDisplay_links_1")
	WebElement fpasswd;
	
	

	
	public void forgotpassword(String email) throws InterruptedException {
		fpasswd.click();
		//profile.click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", profile);
		Femail.sendKeys(email);
		Thread.sleep(1000);
		summit.click();
		
		
		
		
	}
	
}
