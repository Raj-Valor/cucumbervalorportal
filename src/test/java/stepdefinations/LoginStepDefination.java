package stepdefinations;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		DriverFactory.getDriver().get("https://demo.valorpaytech.com/signin");
	}

	@Then("Page title shouldbe {string}")
	public void page_title_shouldbe(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);

	}


	@And("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);

	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		loginPage.continueButton();
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {

		loginPage.clickOnLogin();
	}

	@When("user enters valid username {string}")
	public void user_enters_valid_username(String username) throws InterruptedException {
		loginPage.forgetPWD();
		loginPage.validUserName(username);
	}

	@When("user clicks submit button")
	public void user_clicks_submit_button() throws InterruptedException {
		loginPage.submit();
	}

	@When("user enters the invalid username {string}")
	public void user_enters_the_invalid_username(String username) throws InterruptedException {
		loginPage.validUserName(username);
	}

	@When("user click submit button")
	public void user_click_submit_button() throws InterruptedException {
		loginPage.submit();
		loginPage.passwordLinkfromEmail();
		loginPage.clickEmail();
	}
}