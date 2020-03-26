package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	
	static WebDriver driver;
	public static String browser;
	
	
	
	public static void setBrowser() {
		browser = "Firefox";
	}

	public static void setBrowserConfig() {
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

	public static void runTest() {
		driver.get("http://parabank.parasoft.com/parabank/index.htm;jsessionid=92DD59CD330DBAA5B75776596A749955");
		driver.quit();
	}
}	