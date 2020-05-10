package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import org.junit.runner.RunWith;
import org.testng.Assert;

@RunWith(Cucumber.class)
public class QaAcademy extends base {

	LoginPage lp;
	LandingPage l;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {

		driver = initializeBrowser();

	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
		driver.manage().window().maximize();
	}

	@Given("^Click on Login link in Home page to land on secure Sign in Page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		l = new LandingPage(driver);
		Thread.sleep(5000);
		if (l.PopUpMsgElements() > 0) {
			l.PopUpMsg().click();
		}
		l.SignIn().click();
	}

	/*@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and Logs in$")
	public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
		lp = new LoginPage(driver);

		lp.Email().sendKeys(strArg1);

		lp.Password().sendKeys(strArg2);
		lp.LogIn().click();
	}*/

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		System.out.println(lp.ErrorMsg().isDisplayed());
		Assert.assertTrue(lp.ErrorMsg().isDisplayed());
		

	}

	@When("^user enters (.+) and (.+) and Logs in$")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		lp = new LoginPage(driver);

		lp.Email().sendKeys(username);

		lp.Password().sendKeys(password);
		lp.LogIn().click();
	}
	@And("^close browsers$")
    public void close_browsers() throws Throwable {
		driver.close();
		driver.quit();
		driver = null;
    }

}