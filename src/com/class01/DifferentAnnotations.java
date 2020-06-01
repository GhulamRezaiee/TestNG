package com.class01;

import org.testng.annotations.*;

public class DifferentAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
//		BayramGul();
		System.out.println("Before Method");
	}
	
	@Test
	public void test() {
		System.out.println("Actual Test is running...");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
//	public void BayramGul() {
//		System.out.println("Hi from BayramGul");
//	}
	
}
