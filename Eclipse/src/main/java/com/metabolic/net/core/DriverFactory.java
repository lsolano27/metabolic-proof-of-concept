package com.metabolic.net.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class DriverFactory {
	
	public WebDriver driver; 
		

	/**
	 * Method creates local webdriver
	 * @return webDriver
	 */

	public WebDriver setDriver(String url, String browser){
		try {		

			if (browser.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();							
			}
			if (browser.contains("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver.exe");  
				driver= new FirefoxDriver(); 
			}		
			driver.get(url);
			driver.manage().window().maximize();
           
			
		} catch (WebDriverException ex) {
			throw (ex);
		} 		
		return driver;
	}
	/**
	 * Class constructor method
	 * 
	 * @param url
	 */
	public DriverFactory(String url) {
		super();
	}

	/**
	 * Class constructor method
	 */
	public DriverFactory() {

	}
	/**
	 * Close local driver
	 * @return class instance
	 * @throws Exception
	 */

	public void killDriver() throws Exception {
		try {
			driver.close();
		} catch (Exception e) {
			throw new Exception("Issue unable to quit driver after test");
		}
	}
}