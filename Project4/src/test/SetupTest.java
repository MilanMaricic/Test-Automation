package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import config.PropertiesFile;

public class SetupTest {
		
	private WebDriver driver;
	public String browser;
	private String siteURL = "https://petstore.octoperf.com/actions/Catalog.action";
		
		
		/*
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//setBrowser();
			PropertiesFile.readPropertiesFile();
			setBrowserConfig();
			runTest();
			PropertiesFile.writePropertiesFile();
		}
		*/
		
		public void setBrowser() {
			browser = "Chrome";
		}
		
		public void setBrowserConfig() {
			String projectLocation = System.getProperty("user.dir");
			
			if(browser.contains("Chrome")) {
				System.setProperty("webdriver.chrome.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
				System.setProperty("webdriver.chrome.driver", "G:\\Eclipse workspaces\\Test Automation\\Project4\\lib\\chromedriver\\chromedriver.exe");
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

	}



