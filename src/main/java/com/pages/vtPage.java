package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class vtPage {
	
	

	private WebDriver driver;
	
	private By salerbutn = By.name("transaction");
	private By sale = By.name("amount");
	private By num = By.name("number");
	private By cvv = By.name("cvc");
	private By my = By.name("expiry");
	private By ch = By.name("_chn");
	private By process = By.xpath("//span[contains(text(),'Process')]");
	private By summary = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[3]/button[2]/span[1]/span");
	private By close = By.xpath("//span[contains(text(),'Close')]");
	
	
	
	public vtPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public void isSaleEnabled() throws InterruptedException {
		Thread.sleep(3000);
		boolean enable = driver.findElement(salerbutn).isEnabled();
		System.out.println("sale button is Enable:" + enable);
		
	}

	public void saletransaction() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(sale).sendKeys("10.00");
	}
	
	public void sale(String cn, String cv, String mm, String c) { 
		driver.findElement(num).sendKeys(cn);
		driver.findElement(cvv).sendKeys(cv);
		driver.findElement(my).sendKeys(mm);
		driver.findElement(ch).sendKeys(c);
	}

	
	public void clickProcess() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	     executor.executeScript("arguments[0].click();", driver.findElement(process));	
	     }
	
	public void summaryclick() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(summary).click();
		
		
	}
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(close).click();
		
		
	}
	
}
