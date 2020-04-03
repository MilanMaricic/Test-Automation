package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FirstSeleniumTest {
	public String browser;
	WebDriver driver;
	private String siteURL = "http://parabank.parasoft.com/parabank/index.htm;jsessionid=92DD59CD330DBAA5B75776596A749955";
	
	
	public void setbrowser(){
		browser = "Firefox";
	}
	
	public void setBrowserConfig(){
		String projectLocation = System.getProperty("user.dir");
		
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\chromedriver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			driver = new ChromeDriver();
		}
		
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation + "\\lib\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		}
	}
	
	
	public void runTest(){
		driver.get(siteURL);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "ParaBank | Welcome | Online Banking");
		driver.quit();
	}

}
