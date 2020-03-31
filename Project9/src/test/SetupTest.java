package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupTest {
	
	static String browser;
	static WebDriver driver;
	
	//URL to the testing site
	public String siteURL = "https://petstore.octoperf.com/actions/Catalog.action";
	
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
		System.out.println("Site title is: "+driver.getTitle());
		driver.quit();
	}

}
