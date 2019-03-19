package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			if (ConfigurationReader.getProperties("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C://Users//faizm//Documents//Selenium Dependencies//WebDrivers//chromedriver.exe");
				driver = new ChromeDriver();
			} else if (ConfigurationReader.getProperties("browser").equals("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C://Users//faizm//Documents//Selenium Dependencies//WebDrivers//geckodriver.exe");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
