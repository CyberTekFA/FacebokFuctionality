package stepDefinations;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Locator;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FacebookStep {

	Locator fb = new Locator();
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	   Driver.getDriver().get(ConfigurationReader.getProperties("url"));
	}

	@When("User enter a valid username and a valid password")
	public void user_enter_a_valid_username_and_a_valid_password() {
	fb.email.sendKeys(ConfigurationReader.getProperties("username"));
	fb.password.sendKeys(ConfigurationReader.getProperties("password"));
	}

	@Then("User click on the login button")
	public void user_click_on_the_login_button() {
	   fb.loginbutton.click();
	}

	@Then("User should be able to succefully Login")
	public void user_should_be_able_to_succefully_Login() {
		System.out.println("java is fun");
	   Driver.closeDriver();
	}

}
