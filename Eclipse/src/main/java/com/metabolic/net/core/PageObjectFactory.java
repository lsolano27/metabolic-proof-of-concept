package com.metabolic.net.core;

import java.time.Clock;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class PageObjectFactory {

	private static final long DEFAULT_SLEEP_TIMEOUT = 90;
	public WebDriver driver;
	private WebDriverWait wait = null;
	/**
	 * Class constructor method 
	 * @param driver
	 */
	public PageObjectFactory(WebDriver driver) {
	    this.driver = driver;
	    }

	public boolean isElementDisplayedOnPage(String stringLocator) {

		return driver.findElements(By.xpath(stringLocator)).size() > 1;	
	}


	/***
	 * Method verifies that element exist in the DOM
	 * @param by
	 * @return
	 */
	public boolean isElementPresent(String xpath) {
	    try {
	    	int count = driver.findElements(ByXPath.xpath(xpath)).size();
	      return driver.findElements(ByXPath.xpath(xpath)).size() > 0 ;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	      return false;
	    }
	}
	/**
	 * Method implements fluid Wait until element is Visible
	 * @param element
	 * @param timeout
	 * @return
	 */
	public void isElementIsVisible(WebElement element) throws Error{
		wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_SLEEP_TIMEOUT));
		element = wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(DEFAULT_SLEEP_TIMEOUT))
	            .pollingEvery(Duration.ofSeconds(DEFAULT_SLEEP_TIMEOUT))
	            .ignoring(NoSuchElementException.class);

	    WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver driver) {
	            return driver.findElement(locator);
	        }
	    });
	    return element;
	};
	
	public void waitUntilTextElementIsPresent(WebElement element,String text, int timeout)throws Error{
	
	}
	
}
