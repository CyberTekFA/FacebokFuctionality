package stepDefinations;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.SingUpLocator;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FacebookSingUp {

	SingUpLocator fb = new SingUpLocator();
	@Given("User is on sing up page")
	public void user_is_on_sing_up_page() {
	   Driver.getDriver().get(ConfigurationReader.getProperties("url"));
	}

	@When("User Enter the following details")
	public void user_Enter_the_following_details(List<Map<String,String>> list) {
	    for (Map<String, String> map : list) {
			fb.firstname.sendKeys(map.get("firstname"));
			fb.lastname.sendKeys(map.get("lastname"));
			fb.emailAddress.sendKeys(map.get("email"));
			fb.newPassword.sendKeys(map.get("newPassword"));
		}
	}
}
