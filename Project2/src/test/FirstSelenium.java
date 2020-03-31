package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSelenium {

	//public static void main(String[] args) {
	public String siteURL = "https://testsheepnz.github.io/BasicCalculator.html";
	
	@Test
	public void loadPageTest() {
		
		System.setProperty("webdriver.chrome.driver","G:\\Eclipse workspaces\\Test Automation\\Project2\\lib\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(siteURL);
		Assert.assertEquals(driver.getTitle(), "Basic Calculator");
		driver.quit();

	}

}
