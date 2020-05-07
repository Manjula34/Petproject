$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/itsdi/eclipse-workspace/PetcoProject/src/test/resources/Features/TestCase.feature");
formatter.feature({
  "line": 2,
  "name": "petco website",
  "description": "",
  "id": "petco-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PetCo_Project"
    }
  ]
});
formatter.scenario({
  "line": 31,
  "name": "Register for a new account",
  "description": "",
  "id": "petco-website;register-for-a-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@tc_03_Registerpage"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "open the browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Clicking an account menu",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "goto register",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "give all account details",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Taking screenshots and close App",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.open_the_browser_with_url()"
});
formatter.result({
  "duration": 17489180400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.clicking_an_account_menu()"
});
formatter.result({
  "duration": 1938272699,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.goto_register()"
});
formatter.result({
  "duration": 3856528400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.give_all_account_details()"
});
formatter.result({
  "duration": 6838737200,
  "error_message": "java.lang.UnsupportedOperationException: You may only deselect options of a multi-select\r\n\tat org.openqa.selenium.support.ui.Select.deselectByVisibleText(Select.java:264)\r\n\tat com.pages.RegisterPage.selectSatate(RegisterPage.java:75)\r\n\tat com.stepdefinition.RegisterSteps.give_all_account_details(RegisterSteps.java:40)\r\n\tat ✽.Then give all account details(C:/Users/itsdi/eclipse-workspace/PetcoProject/src/test/resources/Features/TestCase.feature:36)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RegisterSteps.screenshots_and_close_browser()"
});
formatter.result({
  "status": "skipped"
});
});