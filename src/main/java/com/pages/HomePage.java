package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

	private WebDriver driver;
    
	private By userMgtclick = By.xpath("//span[contains(text(),'User Management')]");
	private By MerMgtclick = By.xpath("//span[contains(text(),'Merchant Management')]");
	private By transclick = By.xpath("//span[contains(text(),'Transactions')]");
	private By vt = By.xpath("//span[contains(text(),'Virtual Terminal')]");
	
	    
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        
	    }
	    
	    public String getHomePageTitle() {
	        return driver.getTitle();
	    }
	    
	    
	    public UserManagementPage umclick() throws InterruptedException {
	    	Thread.sleep(3000);
	        driver.findElement(userMgtclick).click();
	        return new UserManagementPage(driver);

	    
	   }
	    
	    public MerchantManagementPage mmclick() throws InterruptedException {
	    	Thread.sleep(3000);
	        driver.findElement(MerMgtclick).click();
	        return new MerchantManagementPage(driver);

	    
	   }
	    
	    public TransactionsPage tclick() throws InterruptedException {
	    	Thread.sleep(3000);
	        driver.findElement(transclick).click();
	        return new TransactionsPage(driver);
	    
	    }
	    
	    public vtPage vclick() throws InterruptedException {
	    	Thread.sleep(3000);
	    	driver.findElement(vt).click();
	    	return new vtPage(driver);
	    }
	}

