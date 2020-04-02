package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class CheckTitleTest{
	
	public void testRunner() {
		SetupTest runner = new SetupTest();
		runner.setBrowser();
		runner.setBrowserConfig();
		runner.runTest();
	}
	
}

