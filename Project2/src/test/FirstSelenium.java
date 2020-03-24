package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","G:\\Eclipse workspaces\\Test Automation\\Project2\\lib\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://parabank.parasoft.com/parabank/index.htm;jsessionid=92DD59CD330DBAA5B75776596A749955");
		
		driver.quit();

	}

}
