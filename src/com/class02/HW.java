package com.class02;

import org.testng.annotations.Test;

import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class HW extends CommonMethods{
  @Test
  public void validLogin() {
	
	  WebElement username = driver.findElement(By.id("txtUsername"));
	  //first way
	 // username.sendKeys(ConfigsReader.getProperty("username"));
	  
	  //second way
	 // sendText(username,ConfigsReader.getProperty("username"));
	  
	  //third way, using page object model and page factory
	  LoginPageElements login = new LoginPageElements();
	  
	  
  }
  
  @BeforeMethod
  public void openBrowserAndNavigate() {
	  setUp();
  }

  @AfterMethod
  public void quitBrowser() {
	  tearDown();
  }

}
