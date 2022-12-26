package stepdefinations;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.TransactionsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TransactionsPageStepDefination {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private TransactionsPage transactionsPage;
	private HomePage homePage;

	@Given("user is on TransactionsPage")
	public void user_is_on_transactions_page(DataTable credTable) throws InterruptedException {
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://demo.valorpaytech.com/signin");
		homePage = loginPage.doLogin(userName, password);
		transactionsPage = homePage.tclick();

	}

	@When("User check the today's transactions")
	public void user_check_the_today_s_transactions() throws InterruptedException {
		transactionsPage.transactionsfilterclick();
	}

	@When("User check transaction with multpleoptions")
	public void user_check_transaction_with_multpleoptions() throws InterruptedException {
		transactionsPage.transactionsfilteringoptinclick();
	}

	@When("User performs the export on transactions")
	public void user_performs_the_export_on_transactions() throws InterruptedException {
		transactionsPage.toshowapprovedtax();
		transactionsPage.ExportValidation();

	}

	@When("To Verify the count")
	public void to_verify_the_count() throws FileNotFoundException, IOException {
		transactionsPage.countcheck();
		transactionsPage.getRowCount();
	
	}

	@When("To show the approved tax")
	public void to_show_the_approved_tax() throws InterruptedException, FileNotFoundException, IOException {

		transactionsPage.filterwitthallTransactiontype();
		transactionsPage.ExportValidation();
		

	}

}
