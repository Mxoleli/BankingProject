package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void LoginTest() throws IOException {
		
		driver.get(baseURL);
		logger.info("Open URL");
		
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(username);
		logger.info("eneter username");
		lp.setPassword(password);
		logger.info("Enter Password");
		lp.clickLogin();
		logger.info("Click login button");
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
			
			Assert.assertTrue(true);
			logger.info("Login test passed");
			
		}
		else {
			captureScreenshot(driver, "LoginTest");
			Assert.assertTrue(false,"the title is incorrect");
			captureScreenshot(driver, "LoginTest");
			logger.info("login test failed");
		}
		
		
	}

}
