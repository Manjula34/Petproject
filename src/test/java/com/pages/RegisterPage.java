package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
WebDriver driver;
	
	public RegisterPage(WebDriver rdriver) {
			
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="WC_AccountDisplay_links_3")
	WebElement Caccount;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_firstName_In_Register_1")
	WebElement fname;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_lastName_In_Register_1")
	WebElement lname;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_logonId_In_Register_1")
	WebElement email;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_logonPassword_In_Register_1")
	WebElement passwd;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_logonPasswordVerify_In_Register_1")
	WebElement Verifypwd;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_Address1_In_Register_1")
	WebElement Address;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_City_In_Register_1")
	WebElement city;
	
	@FindBy(id="shipping-address-state")
	WebElement state;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_ZipCode_In_Register_1")
	WebElement zipcode;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_phoneNum_In_Register_1")
	WebElement phnumber;
	
	@FindBy(id="WC_UserRegistrationAddForm_links_1")
	WebElement CreateAcc;
	
	public void createAnt() {
		Caccount.click();
	}
	
	public void fnamelastname(String Fname,String Lname) {
		fname.sendKeys(Fname);
		lname.sendKeys(Lname);		
	}
	public void emailpasswd(String Email,String Password,String Cpassword) {
		email.sendKeys(Email);
		passwd.sendKeys(Password);
		Verifypwd.sendKeys(Cpassword);
	}
	
	public void AddressandCity(String address, String City) {
		Address.sendKeys(address);
		city.sendKeys(City);
	}
	public void selectSatate(String State) {
		Select sel = new Select(state);
		sel.deselectByVisibleText(State);
		
	}
	public void zipcode(String Zipcode,String phno) {
		zipcode.sendKeys(Zipcode);
		phnumber.sendKeys(phno);
		
	}
	public void createaccountBtn() {
		CreateAcc.click();
	}
	
}
