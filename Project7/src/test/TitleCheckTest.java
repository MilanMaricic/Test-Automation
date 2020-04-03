package test;

import org.testng.annotations.Test;

public class TitleCheckTest {
	
	@Test
	public void testRunner() {
		FirstSeleniumTest runner = new FirstSeleniumTest();
		runner.setbrowser();
		runner.setBrowserConfig();
		runner.runTest();
	
	}

}
