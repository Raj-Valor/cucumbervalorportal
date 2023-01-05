package stepdefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MerchantManagementPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MerchantManagementPageStepDefination {
	
	
	private LoginPage  loginPage = new LoginPage(DriverFactory.getDriver());
	private MerchantManagementPage merchntmanagementpage;
	private HomePage homePage;
	
	
	
	

@Given("user is on MerchantManagementPage")
public void user_is_on_merchant_management_page(DataTable credTable)throws InterruptedException {	
	List<Map<String, String>> credList = credTable.asMaps();
	String userName = credList.get(0).get("username");
	String password = credList.get(0).get("password");
	 DriverFactory.getDriver()
	 .get("https://demo.valorpaytech.com/signin");
	 homePage = loginPage.doLogin(userName, password);
	 merchntmanagementpage =homePage.mmclick();
		
}

@When("user clicks add button for merchant")
public void user_clicks_add_button_for_merchant() throws InterruptedException {
	merchntmanagementpage.addClick();
}

@When("user clicks the Full Board Option for mechant")
public void user_clicks_the_full_board_option_for_mechant() throws InterruptedException {
	merchntmanagementpage.fullBoardOption();
}

@When("user fil the merchan details from given sheetname {string} and rownumber {int}")
public void user_fil_the_merchan_details_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\rajkumar\\Documents\\rajkumar\\Excel\\doc.xlsx", SheetName);

	
	 String DBA = testData.get(rowNumber).get("Dname");
	 String ln = testData.get(rowNumber).get("legalname");
	 String fn = testData.get(rowNumber).get("firstname");
	 String lastn = testData.get(rowNumber).get("lastname");
	 String mail = testData.get(rowNumber).get("email");
	 String un = testData.get(rowNumber).get("username");
	 String pho = testData.get(rowNumber).get("phone");
	 String adrss = testData.get(rowNumber).get("Address");
	 String zipc = testData.get(rowNumber).get("zipcode");
	// String TimeZ = testData.get(rowNumber).get("timezne");
	
	 merchntmanagementpage.merchantDetails(DBA, ln, fn, lastn, mail, un, pho, adrss, zipc);
	 
}

@When("user select state")
public void user_select_state() {
  
	merchntmanagementpage.timezoneDropdown();
}
	

@When("click the next")
public void click_the_next() {
	merchntmanagementpage.clickNxtnBn();
}

@When("user select the store from sheet {string} and rownumber {int}")
public void user_select_the_store_from_sheet_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
    
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\rajkumar\\Documents\\rajkumar\\Excel\\doc.xlsx", SheetName);


	 String mcc = testData.get(rowNumber).get("store");
	
	
	
	merchntmanagementpage.stroecode(mcc);

}


@When("click addstore")
public void click_addstore() throws InterruptedException {
	merchntmanagementpage.addStore();
}

@When("user select the device from the list")
public void user_select_the_device_from_the_list() {
	merchntmanagementpage.choicetoSelectDevice();
}

@When("user select the processor")
public void user_select_the_processor() {
	merchntmanagementpage.choicetoSelectProcessor();
}

@When("add debitshare")
public void add_debitshare() {
	merchntmanagementpage.adDebitshare();
    
}

@When("user fil the cash discount values from the sheetname {string} and rownumber {int}")
public void user_fil_the_cash_discount_values_from_the_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\rajkumar\\Documents\\rajkumar\\Excel\\doc.xlsx", SheetName);


	 String mid = testData.get(rowNumber).get("merchantID");
	 String vNum = testData.get(rowNumber).get("vNumb");
	 String Stroeno = testData.get(rowNumber).get("stroeNum");
	 String TermNo = testData.get(rowNumber).get("termNoo");
	 String agenBankNo = testData.get(rowNumber).get("agenBnum");
	 String chain = testData.get(rowNumber).get("chainNum");
	 String agent = testData.get(rowNumber).get("Agentdetail");
	
	 
	 merchntmanagementpage.cashDiscountDetails(mid, vNum, Stroeno, TermNo, agenBankNo, chain, agent);
}

}
