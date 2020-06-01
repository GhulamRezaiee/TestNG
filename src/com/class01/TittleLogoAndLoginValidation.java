package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class TittleLogoAndLoginValidation extends CommonMethods{

	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}
	
	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
	
	
	@Test
	public void titleValidation() {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)){
			System.out.println("Title Validation Passed");
		}else {
			System.out.println("Title Validation Failed");
		}
	}
	
	@Test
	public void logoValidation() {
		String logoPath = "//div[@id='divLogo']/img";
		WebElement logo = driver.findElement(By.xpath(logoPath));
		if(logo.isDisplayed()) {
			System.out.println("Logo Validation Passed");
		}else {
			System.out.println("Logo Validation Failed");
		}
		
	}
	
	@Test
	public void validLogin() throws InterruptedException {
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.id("btnLogin")));
		
		//validate that welcome admin is dispalyed
		//check the reports in test-output folder
		Thread.sleep(2000);
		
	}
}
