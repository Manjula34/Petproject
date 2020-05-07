package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class library {
	protected WebDriver driver;
	public static Properties prop;
	public static final  Logger logger = LogManager.getLogger(library.class.getName());
	
	public void launchApplication() throws IOException {
		FileInputStream file =  new FileInputStream("C:\\Users\\itsdi\\eclipse-workspace\\PetcoProject\\src\\test\\resources\\configurationproperties\\config.properties");
		prop = new Properties();
		prop.load(file);
		String Browser = prop.getProperty("browser");
		
		try {
			if(Browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				logger.info("Firefox Browser is launched ");
				
			}else if(Browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				logger.info("Chrome Browser is launched ");
				System.out.println("chrome Browser launch");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			logger.info("url is entered in the browser");
		}catch (WebDriverException a) {
			System.out.println("Browser cannot be launched");
			
		}
		
	}
	public void quit() {
		driver.close();
		logger.info("Window is closed");
	}
	public void screenShot() throws IOException {
		logger.info("Taking ScreenShot");
		TakesScreenshot ts = (TakesScreenshot)driver;
		String screenshotpath = System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\Pet" + System.currentTimeMillis()+".png";
		System.out.println(screenshotpath);
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(screenshotpath));
		}
	
	public String getTitle() {
		String Title = driver.getTitle();
		return Title;
	}
		

}
