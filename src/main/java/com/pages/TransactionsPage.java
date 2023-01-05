package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class TransactionsPage {

	private WebDriver driver;
	

	private By tfilter = By.xpath("//span[contains(text(),'Recent')]");
	private By muifilter = By.xpath("//button[@type='button']//span//span//i");
	private By list = By.xpath("//ul[@role='menu']/li");
	private By transtype = By.xpath("(//span[contains(text(),'ALL')])[1]");
	private By trnstaus = By.xpath(
			"//body/div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']/div/div/button[@name='Transaction_Status']/span[1]");
	private By countfirmtile = By.xpath("//div[@class='_loading_overlay_overlay css-1oig5ex']");
	private By bottomcount = By.xpath("");
	private By Action = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-4 MuiGrid-grid-md-2']//span[@class='MuiButton-label']");
	private By Export = By.xpath("//span[contains(text(),'Export')]");
	private By Atax = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1']");
	//all
	
	private By cardtypes = By.xpath("//button[@name='Card_Brands']//span//span//span[contains(text(),'ALL')]");
	
	

	public TransactionsPage(WebDriver driver) {
		this.driver = driver;

	}

	public void transactionsfilterclick() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(tfilter).click();
		List<WebElement> filter = driver.findElements(list);
		for (WebElement ftype : filter) {
			if (ftype.getText().equals("Yesterday")) {
				ftype.click();
				break;
			}
			
		}

	}

	public void transactionsfilteringoptinclick() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(muifilter).click();
		List<WebElement> fil = driver.findElements(list);
		
		for (WebElement ftyp : fil) {
			if (ftyp.getText().equals("Recent")) {
				ftyp.click();
				break;
			}

		}
		driver.findElement(transtype).click();
		List<WebElement> fill = driver.findElements(list);
		for (WebElement fty : fill) {
			if (fty.getText().equals("SALE")) {
				fty.click();
				break;
			}
			
		
		}
		Thread.sleep(3000);
		driver.findElement(trnstaus).click();
		List<WebElement> filstatus = driver.findElements(list);
		for (WebElement fty : filstatus) {
			if (fty.getText().equals("Approved")) {
				fty.click();
				break;
			}

		
		
			
		}
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		
	}


	/*if(countfirmtile==bottomcount) {
		System.out.println("count matched");
	}
		else {
			System.out.println("count mismatch");
			
		}
	}*/ 
	public void ExportValidation() {
	
		driver.findElement(Action).click();
		driver.findElement(Export).click();
		
		
		
	
}
	public void countcheck() {
		
		String aprvTxnCount = driver.findElement(By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div/div/span")).getText();
		System.out.println("\nVolume count on tile:"+aprvTxnCount);
		
		String pnation = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'])[2]")).getText();
		
		System.out.println("\npnation count is:"+ pnation);	
	
		if(pnation.contains(aprvTxnCount)) {
			System.out.println("\nPagination and tile is count matched:" + aprvTxnCount);
		} else {
			System.out.println("Pagination and tile count is not matched");
		}
		
		
		
	}
	
	public void toshowapprovedtax() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Atax).click();
		
	}
	
	public void rowcount() throws IOException, InterruptedException {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream("C:\\Users\\rajkumar\\Downloads\\TRANSACTION_1_4_2023_4_32_04_AM.xlsx");
	       XSSFWorkbook workbook = new XSSFWorkbook(fis);
	       XSSFSheet sheet = workbook.getSheet("TRANSACTION_1_4_2023_4_32_04_AM");
	       XSSFRow row = sheet.getRow(0);
	       int colNum = row.getLastCellNum();
	       System.out.println("Total Number of Columns in the excel is : "+colNum);
	       int rowNum = sheet.getLastRowNum()+1;
	       System.out.println("Total Number of Rows in the excel is : "+rowNum);
		
	}

	
		
}


