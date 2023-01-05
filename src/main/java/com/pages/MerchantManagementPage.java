package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MerchantManagementPage {
	
	private WebDriver driver;
	
	
	private By addmer = By.xpath("//span[contains(text(),'Add')]");
	private By merchantMgtadd = By.xpath("//span[contains(text(),'Full Board')]");
	private By DBA = By.name("dbaName");
	private By ln = By.xpath("//input[@name='legalName']");
	private By fn = By.xpath("//input[@name='firstName']");
	private By lastn = By.xpath("//input[@name='lastName']");
	private By mail= By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[5]/div/div/input");
	private By un = By.xpath("(//input[@type='text'])[6]");
	private By pho = By.xpath("//input[@autocomplete='disabled']");
	private By address = By.xpath("//input[@name='legalAddress']");
	private By zip = By.name("legalZipCode");
	/*private By lc= By.xpath("//input[@name='legalCity']");
	private By st = By.xpath("//div[@id='state']");*/
	private By tz = By.xpath("//div[@aria-haspopup=\"listbox\"]");
	private By est = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
	//private By mcc = By.xpath("//input[@id=\"mui-42218\"][@aria-autocomplete=\"list\"]");
	//private By mcc = By.xpath("//div[@class=\"MuiAutocomplete-endAdornment-784\"]");
	private By mcc = By.xpath("//button[@aria-label=\"Open\"]");
	private By NtxBn = By.xpath("//span[contains(text(),'Next')]");
	private By tzz = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[12]/div/div/div");
	//private By listmcc = By.xpath(");
	private By adstore = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[16]/button/span[1]");
	private By device = By.xpath("(//div[@role='button'])[3]");
	private By listofdevice = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[5]");
	private By processor = By.xpath("(//div[@role='button'])[4]");
	private By listofprocessor = By.xpath("(//li[@role='option'])[1]");
	private By debitshare = By.xpath("//div[@id='mui-component-select-debitShare']");
	private By dbshareValue = By.xpath("(//li[@role='option'])[1]");
	private By mid = By.xpath("//input[@name='mid']");
	private By vNum = By.xpath("//input[@name='vNumber']");
	private By Stroeno = By.xpath("//input[@name='storeNo']");
	private By TermNo = By.xpath("//input[@name='termNo']");
	private By binNumber = By.xpath("//div[@id='mui-component-select-binnumber']");
	private By binlist = By.xpath("(//li[@role='option'])[1]");
	private By industry = By.xpath("//div[@id='mui-component-select-industry']");
	private By listofIndustry = By.xpath("(//ul[@role=\"listbox\"])/li[1]");
	private By agenBankNo = By.xpath("//input[@name=\"agentBank\"]");
	private By chain = By.xpath("(//input[@name='chain'])[1]");
	private By agent = By.xpath("(//input[@name='agent'])[1]");
	private By flat = By.xpath("(//span[contains(text(),'Flat fee amount $')])[1]");
	private By cusfee = By.xpath("//input[@name=\"surchargePercentage\"]");
	private By cashDiscount = By.xpath("(//span[contains(text(),'Cash Discount')])[2]");
	private By adddev = By.xpath("//span[contains(text(),'Add Device')]");
	private By addnoDevice = By.xpath("//span[contains(text(),'NO')]");
	private By boardmer = By.xpath("//span[contains(text(),'Onboard Merchant')]");
	
	
	
	//ul[@role="listbox"]/li - list of device
	//ul[@role="listbox"]
	
	

	
	public MerchantManagementPage(WebDriver driver) {
		this.driver = driver;
	}
	public void addClick() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(addmer).click();
	}
	public void fullBoardOption() throws InterruptedException {
		driver.findElement(merchantMgtadd).click();
	}
	
	public void merchantDetails(String dbaname, String leName, String fName, String lName,String ema, String uName, String phe, String adDress, String zipe
 ) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(DBA).sendKeys(dbaname);
		driver.findElement(ln).sendKeys(leName);
		driver.findElement(fn).sendKeys(fName);
		driver.findElement(lastn).sendKeys(lName);
		driver.findElement(mail).sendKeys(ema);
		driver.findElement(un).sendKeys(uName);
		driver.findElement(pho).sendKeys(phe);
		driver.findElement(address).sendKeys(adDress);
		driver.findElement(zip).sendKeys(zipe);
		
		
		
		
		
		//Actions action = new Actions(driver);

        /*action.moveToElement(driver.findElement(tz));
        action.sendKeys(action, Keys.ARROW_DOWN).perform();*/
		
		//driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
		/*List<WebElement>list=driver.findElements(By.xpath("//ul[@class=\'MuiList-root-760 MuiMenu-list-676 MuiList-padding-761\']"));
				for(int i=0; i<list.size();i++){
					if(list.get(i).getText().equals(time)) {
						list.get(i).click();
						break;
					}
				}*/
		
		
		//driver.findElement(tz).click();
		//Select select = new select 
		
	}
	
	public void timezoneDropdown() {
		driver.findElement(tz).click();
		List<WebElement>tzlist=driver.findElements(By.xpath("//li[@role='option']"));
		tzlist.get(0).click();
		
		
	}
	
	public void clickNxtnBn() {
		driver.findElement(NtxBn).click();
	}
	
	
	public void stroecode(String code) throws InterruptedException {
		driver.findElement(tzz).click();
		List<WebElement>tzzlist=driver.findElements(By.xpath("//li[@role='option']"));
		tzzlist.get(0).click();
		Thread.sleep(3000);
		driver.findElement(mcc).sendKeys(code);
	
		/*driver.findElement(mcc).sendKeys(Keys.ENTER);*/
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
		//action.sendKeys(Keys.ENTER);
		//action.sendKeys(Keys.ENTER);
		
	
	
		
		
		//driver.findElement(mcc).sendKeys("4814");
		
		/*String mccWindow = driver.getWindowHandle();
		driver.switchTo().window(mccWindow);
	
		
		/*driver.findElement(mcc).getAttribute("1520 - GENERAL CONTRACTORS-RESIDENTIAL AND COMMERCIAL");
		driver.findElement(mcc).click();*/
		
	

		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//input[@value='0780 - LANDSCAPING AND HORTICULTURAL SERVICES']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);*/
	
		//driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"][@value='4814 - TELECOMMUNICATION SERVICE INCLUDING LOCAL & LONG DISTANCE CALLS-FAX SERVICES - CREDIT CARD CA']")).click();
		
	}
	
	public void addStore() throws InterruptedException {
		
		driver.findElement(adstore).click();
		driver.findElement(NtxBn).click();
	}
	
	/*public void clickNtn() {
	driver.findElement(NtxBn).click();
}*/
	public void choicetoSelectDevice() {
		driver.findElement(device).click();
		driver.findElement(listofdevice).click();
		
	}
	
	public void choicetoSelectProcessor() {
		driver.findElement(processor).click();
		driver.findElement(listofprocessor).click();
	}
	
	public void adDebitshare() {
		
		driver.findElement(debitshare).click();
		driver.findElement(dbshareValue).click();
		
	}
	public void cashDiscountDetails(String Mid, String Vnumber, String Storeno, String Termno, String Abanknum,
			String ChainNum, String Agent) { 
		driver.findElement(mid).sendKeys(Mid);
		driver.findElement(vNum).sendKeys(Vnumber);
		driver.findElement(Stroeno).sendKeys(Storeno);
		driver.findElement(TermNo).sendKeys(Termno);
		driver.findElement(binNumber).click();;
		driver.findElement(binlist).click();
		driver.findElement(industry).click();;
		driver.findElement(listofIndustry).click();
		driver.findElement(agenBankNo).sendKeys(Abanknum);
		driver.findElement(chain).sendKeys(ChainNum);
		driver.findElement(agent).sendKeys(Agent);
		driver.findElement(flat).click();
		driver.findElement(cusfee).sendKeys("80.00");
		driver.findElement(cashDiscount).click();
		driver.findElement(adddev).click();
		driver.findElement(addnoDevice).click();
		driver.findElement(boardmer).click();
	
	
		
		
		
	}
	
	
	
}