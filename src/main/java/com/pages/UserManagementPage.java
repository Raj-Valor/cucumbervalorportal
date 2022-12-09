package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserManagementPage {

	private WebDriver driver;

	private By userMgtadd = By.xpath("//span[contains(text(),'Add')]");
	private By umaddCust = By.xpath("//span[contains(text(),'ADD CUSTOMER')]");
	private By custName = By.xpath("//input[@id='custName']");
	private By email = By.xpath("//input[@id='email']");
	private By UserName = By.xpath("//input[@id='user_Name']");
	private By Phone = By.xpath("//input[@id='Phone']");
	private By firstName = By.id("firstName");
	private By lastName = By.xpath("//input[@id='lastName']");
	private By address = By.xpath("//input[@id='address']");
	private By zipCode = By.xpath("//input[@name='zipCode']");
	private By city = By.xpath("//input[@id='city']");
	// private By state =By.xpath("//div[@class='css-1hwfws3']");
	private By nextBtn = By.xpath("//span[contains(text(),'Next')]");
	private By bin = By.xpath("//input[@name='bin']");
	private By addBin = By.xpath("//*[@id='binDataAdd-bin_details']/span[1]");
	private By agent = By.xpath("//input[@name='agent']");
	private By addagent = By.xpath("//*[@id='agentbankDataAdd-agentbank_details']/span[1]");
	private By agentcode = By.xpath("//input[@id='agentDataAdd-agent_details']");
	private By addagentcode = By.xpath("//*[@id='agentDataAdd-agent_details']/span[1]");
	private By chainNumber = By.xpath("//input[@id='chainDataAdd-chain_details']");
	private By addchainnumber = By.xpath("//*[@id='chainDataAdd-chain_details']/span[1]");
	private By label = By.xpath("//*[@id='label-label']");
	private By debitsharing = By.xpath("//*[@id='debit_sharing-debit_sharing']");
	private By abaNumber = By.xpath("//*[@id='aba_number-aba_number']");
	private By addaba = By.xpath("//*[@id='drgdrg']/span[1]");
	private By selectmodule = By.xpath("//input[@value='jason']");
	private By submitbutton  = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jr-btn next-btn MuiButton-containedPrimary'][2]");
	private By Userstile = By.xpath("//span[contains(text(),'Users')]");
	private By Isotile = By.xpath("//span[contains(text(),'Iso')]");
	private By SubIso = By.xpath("//span[contains(text(),'Sub Iso')]");
	private By Merchants = By.xpath("//span[contains(text(),'Merchants')]");
	private By Operators = By.xpath("//span[contains(text(),'Operators')]");
	private By InternalUser = By.xpath("//span[contains(text(),'Internal User')]");	
	private By Userscountbottom = By.xpath("//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'][2]");
	private By Isocountbottom = By.xpath("//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'][2]");
	private By SubIsocountbottom  = By.xpath("//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'][2]");
	private By Merchantcountbottom = By.xpath("//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'][2]");
	private By Internaluserbottom = By.xpath("//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'][2]");
	
	public UserManagementPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickUserTile() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Userstile).click();
		
	}
	
	public int getUserstileCount() {
		return driver.findElements(Userstile).size();
	}

	public void clickIsoTile() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Isotile).click();

	}
	public void clickSubIsoTile() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(SubIso).click();

	}
	public void MerchantsTile() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Merchants).click();

	}
	public void OperatorsTile() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Operators).click();

	}

	public void  InternalUserTile() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(InternalUser).click();

	}
	

	public void addISO() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userMgtadd).click();
	}

	public void addcust() throws InterruptedException {

		driver.findElement(umaddCust).click();
	}

	public void createISO(String custname, String mail, String username, String phone, String firstname,
			String lastname, String add, String zip, String cit) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(custName).sendKeys(custname);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(Phone).sendKeys(phone);
		driver.findElement(firstName).sendKeys(firstname);
		driver.findElement(lastName).sendKeys(lastname);
		driver.findElement(address).sendKeys(add);
		driver.findElement(zipCode).sendKeys(zip);
		driver.findElement(city).sendKeys(cit);
		/*
		 * Select select = new Select(driver.findElement(state));
		 * select.selectByValue("XX - India");
		 */

	}

	public void clickNextButton() {
		driver.findElement(nextBtn).click();

	}

	public void Processordetails(String BinNumber, String AgentBankNo, String AgentCode, String ChainNumber,
			String Label, String DebitSharing, String AbaNumber) {

		driver.findElement(bin).sendKeys(BinNumber);
		driver.findElement(agent).sendKeys(AgentBankNo);
		driver.findElement(agentcode).sendKeys(AgentCode);
		driver.findElement(addagentcode).click();
		driver.findElement(chainNumber).sendKeys(ChainNumber);
		driver.findElement(label).sendKeys(Label);
		driver.findElement(debitsharing).sendKeys(DebitSharing);
		driver.findElement(abaNumber).sendKeys(AbaNumber);
//To click add button on processor info
		driver.findElement(addBin).click();
		driver.findElement(addagent).click();
		driver.findElement(addagentcode).click();
		driver.findElement(addchainnumber).click();
		driver.findElement(addaba).click();
		driver.findElement(nextBtn).click();
		
		

	}
public void selectallmodule() {
	driver.findElement(selectmodule).click();
	driver.findElement(submitbutton).click();
}

}
