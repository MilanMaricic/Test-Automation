package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	
	private WebDriver driver;
	private static String browser;
	private String siteURL= "http://newtours.demoaut.com/";
	
	
	
	public void setBrowser() {
		browser = "Firefox";
	}

	public void setBrowserConfig() {
		String projectLocation = System.getProperty("user.dir");
	
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			System.setProperty("webdriver.chrome.driver", "G:\\Eclipse workspaces\\Test Automation\\Project5\\lib\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin", "C:\\\\Program Files\\\\Mozilla Firefox\\\\firefox.exe");
			driver = new FirefoxDriver();
		}
	}

	public void runTest() {
		driver.get(siteURL);
		driver.quit();
	}
	
	@Test
	public void testRunner() {
		FirstSeleniumTest runner = new FirstSeleniumTest();
		runner.setBrowser();
		runner.setBrowserConfig();
		runner.runTest();
	}
}	