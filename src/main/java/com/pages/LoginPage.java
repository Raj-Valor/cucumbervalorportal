package com.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;
	private By email = By.id("emailtype");
	private By password = By.id("passwordtype");
	private By continueButton = By.xpath("//span[contains(text(),'Continue')]");
	private By loginButton = By.xpath("//span[contains(text(),'YES')]");
	private By forgetPWDLink = By.xpath("//a[normalize-space()='Forgot Password']");
	private By submit = By.xpath("//span[contains(text(),'Submit')]");
	private By Ftext = By.xpath("//input[@type='text']");
	private By emailcre = By.name("loginfmt");
	private By NxtEm = By.id("idSIButton9");
	private By pass = By.xpath("//input[@id='password']");
	private By sub = By.id("submitBtn");
	private By MSYyes = By.xpath("//input[@id='idSIButton9']");
	private By DL = By.id("username");

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
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'YES')]")));
		driver.findElement(loginButton).click();

	}

	public void forgetPWD() {
		driver.findElement(forgetPWDLink).click();
	}

	public void validUserName(String username) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Ftext).sendKeys(username);
	}

	public void submit() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(submit).click();

	}

	public void passwordLinkfromEmail() throws InterruptedException {

		/*
		 * rajkumar@valorpaytech.com Welcome1#
		 */

		driver.get("https://outlook.office.com");
		Thread.sleep(3000);
		/*
		 * driver.findElement(emailcre).sendKeys("rajkumar@valorpaytech.com");
		 * driver.findElement(NxtEm).click(); Thread.sleep(3000);
		 */
		/*
		 * driver.findElement(DL).clear();
		 * driver.findElement(DL).sendKeys("rajkumar@valorpaytech.com");
		 */
		/*
		 * Actions act = new Actions(driver);
		 * 
		 * act.sendKeys(Keys.TAB).build().perform();
		 * driver.findElement(pass).sendKeys("Welcome1#");
		 * driver.findElement(sub).click(); driver.findElement(MSYyes).click();
		 */

	}

	public void clickEmail() throws InterruptedException {

		List<WebElement> fli = driver.findElements(By.xpath(
				"//*[@id=\"MainModule\"]/div/div/div[3]/div/div[3]/div[1]/div[1]/div[1]/div/div[3]/div/div[1]/i/span/i"));
		for (WebElement ftt : fli) {

			if (ftt.getText().contains("Unread")) {
				ftt.click();
				break;
			}

			List<WebElement> emailThreads = driver.findElements(By.xpath("//div[@role='complementary']"));
			Thread.sleep(6000);
			for (WebElement et : emailThreads) {

				if (et.getText().contains("Reset Password Request")) {
					et.click();
					break;
				}
				driver.findElement(By.xpath(
						"//*[@id=\\\"ReadingPaneContainerId\\\"]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[3]/div/div/div/div/table/tbody/tr/td/table/tbody/tr[3]/td/h3/a"))
						.click();

			}

		}

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