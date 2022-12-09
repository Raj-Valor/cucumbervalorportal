package com.pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	private WebDriver driver;
	
	private By email = By.id("emailtype");
	private By password = By.id("passwordtype");
	private By continueButton = By.xpath("//span[contains(text(),'Continue')]");
	private By loginButton = By.xpath("//span[contains(text(),'YES')]");


public LoginPage(WebDriver driver) {
	this.driver = driver;
}


public void enterUserName(String username) {
	driver.findElement(email).sendKeys(username);
}

public void enterPassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
}

public void continueButton() {
	driver.findElement(continueButton).click();
}


public void clickOnLogin() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(loginButton).click();
	
}

public HomePage doLogin(String un, String pwd) throws InterruptedException {
	driver.findElement(email).sendKeys(un);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(continueButton).click();
	Thread.sleep(3000);
	driver.findElement(loginButton).click();
	return new HomePage(driver);
}

public void tearDown() {
	driver.close();
}
}