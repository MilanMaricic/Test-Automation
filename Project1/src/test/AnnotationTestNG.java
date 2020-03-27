package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTestNG {
	
	@Test
	public void testCase1() {
		System.out.println("Hello from testCase1");
	}
	
	@Test
	void testCase2() {
		System.out.println("Hello from testCase2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("in beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("in afterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("in afterMethod");
	}
	

	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("in afterTest");
	}
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("in beforeSuit");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("in afterSuit");
	}

}
