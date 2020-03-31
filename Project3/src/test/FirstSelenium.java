package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is improved class of Project2, where we use methods declaration 
 * @author Milan Maricic
 *
 */
public class FirstSelenium {
	
	static String browser;
	static WebDriver driver;
	
	//URL to the testing site
	public String siteURL = "https://petstore.octoperf.com/actions/Catalog.action";

	
	@Test
	public void setupTest() {
		FirstSelenium runner = new FirstSelenium();
		runner.setBrowser();
		runner.setBrowserConfig();
		runner.runTest();
	}
	
	
	public void setBrowser() {
		browser="Firefox";
	}
	
	
	public void setBrowserConfig() {
		String projectLocation = System.getProperty("user.dir");
		 
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			driver = new ChromeDriver();
		}
		
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		}
	}
	
	
	public void runTest() {
		driver.get(siteURL);
		Assert.assertEquals(driver.getTitle(), "JPetStore Demo");
		driver.quit();
	}

}
