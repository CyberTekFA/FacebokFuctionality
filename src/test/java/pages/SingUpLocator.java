package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SingUpLocator {

	public SingUpLocator() {
		PageFactory.initElements(Driver.getDriver(),this);
	}
	
	@FindBy(name="firstname")
	public WebElement firstname;
	@FindBy(name="lastname")
	public WebElement lastname;
	@FindBy(name="reg_email__")
	public WebElement emailAddress;
	@FindBy(name="reg_passwd__")
	public WebElement newPassword;
}
