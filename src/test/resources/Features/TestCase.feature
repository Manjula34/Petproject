@PetCo_Project
Feature: petco website

@tc_01_login
Scenario Outline: Validate the login functionality

Given Launch the browser and enter the url
When petco page is opened
Then Go to Account and click signin button
Then login page is displayed
Then enter the "<email>" and "<password>"
Then Click the login
And Take screenshots and quit browser

Examples:
|email                    |password  |
|itsmanjudinesh@gmail.com |hello123  |
|   admin123              | admin124 |


@tc_02_forgotPasswd
Scenario: Shop by selected pet

Given launching browser 
When click on the account 
Then click forgotpassword and give details
And screenshots and close browser


@tc_03_Registerpage
Scenario: Register for a new account

Given open the browser with url 
When Clicking an account menu
Then goto register
Then give all account details
And Taking screenshots and close App
