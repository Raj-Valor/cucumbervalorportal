package stepdefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.UserManagementPage;
import com.pages.vtPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class vtPageStepDefiation {
	
	private LoginPage  loginPage = new LoginPage(DriverFactory.getDriver());
	private vtPage vtpage;
	private HomePage homePage;
	
	
	
	@Given("user is on vtPage")
	public void user_is_on_vt_page(DataTable credTable) throws InterruptedException {
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		 DriverFactory.getDriver()
		 .get("https://demo.valorpaytech.com/signin");
		 homePage = loginPage.doLogin(userName, password);
		 vtpage =homePage.vclick();
		
	}
	
	@When("user clicks sale radio button")
	public void user_clicks_sale_radio_button() throws InterruptedException {
		vtpage.isSaleEnabled();
		
	    
	}
	
	@Then("user enter amount")
	public void user_enter_amount(DataTable dataTable) throws InterruptedException {
		List<List<String>>TransList=dataTable.asLists(String.class);
		
		String sale = TransList.get(0).get(0);
		String phoNo = TransList.get(1).get(0);
		
		vtpage.saletransaction(sale, phoNo);
		
		 for(List<String> f : TransList) {
		    	System.out.println(f);
	}
	}
	 
	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
	    
	    String num = userList.get(0).get("Cardnumber");
	    String cvv = userList.get(0).get("cvv");
	    String mym = userList.get(0).get("MM/YY");
	    String chh = userList.get(0).get("cardholdername"); 
		vtpage.sale(num, cvv, mym, chh);
		
	    for(Map<String, String> e : userList) {
	    	System.out.println(e);
	  
	    }
	   
	    
	    
	}
	
	@Then("select process")
	public void select_process() throws InterruptedException {
	   vtpage.clickProcess();  
	   
	}
	
	@Then("click summary details")
	public void click_summary_details() throws InterruptedException {
	    vtpage.summaryclick();
	}

	@Then("click close")
	public void  click_close() throws InterruptedException {
	    vtpage.close();
	}
}
