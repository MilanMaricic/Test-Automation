package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	
	//public static void main(String[] args) {
		
	@Test
	public void loadPageTest() {
		//Location/path of our project 
		String projectLocation = System.getProperty("user.dir");
		
		//configure WebDriver which will be used for test execution 
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//commands for executing what test will do
		driver.get("http://parabank.parasoft.com/parabank/index.htm;jsessionid=92DD59CD330DBAA5B75776596A749955");
		driver.quit();

	}

}
