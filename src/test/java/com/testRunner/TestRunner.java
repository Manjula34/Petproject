package com.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Cucumber class
@RunWith(Cucumber.class)
@CucumberOptions
(
	
features = "C:\\Users\\itsdi\\eclipse-workspace\\PetcoProject\\src\\test\\resources\\Features\\TestCase.feature",
glue = {"com.stepdefinition"},	        
plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report","json:src/test/resources/Reports/cucumber-html-report/jsonreport",
"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreports/Extentreport.html"},
tags= {"@tc_03_Registerpage"},
strict = true,
monochrome = true,
dryRun = false		        
)

public class TestRunner {
	
	@AfterClass
    public static void extendReport()
  {
      Reporter.loadXMLConfig("extent-config.xml");
      Reporter.setSystemInfo("user", System.getProperty("user.name"));
      Reporter.setSystemInfo("os", "Windows");
      Reporter.setTestRunnerOutput("Sample test runner output message");
  }

}
