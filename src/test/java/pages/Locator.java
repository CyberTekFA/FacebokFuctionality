package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Locator {

	public Locator() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(linkText="Log In")
	public WebElement loginbutton;
}
