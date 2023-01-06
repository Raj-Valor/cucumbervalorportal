package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	private WebDriver driver;
	

	public Util(WebDriver driver){
		this.driver = driver;
	}

	public void wait(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver,timeout)
		.until(ExpectedConditions.visibilityOf(element));
		
	}
}
