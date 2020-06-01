package com.class01;

import org.testng.annotations.*;

public class TaskTwo {
	
	
	
	@Test
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test 2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This is After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This is After Method");
	}


}
