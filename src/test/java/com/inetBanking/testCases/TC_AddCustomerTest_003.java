package com.inetBanking.testCases;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@SuppressWarnings("deprecation")
	@Test
	public void AddNewCustomer() throws InterruptedException, IOException {
		
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		
		AddCustomerPage addcust =new AddCustomerPage(driver);
		addcust.AddNewCustomerLink();
		addcust.CustomerName("Man");
		addcust.custGender();
		addcust.custdob("1985","12","10");
		Thread.sleep(3000);
		addcust.custaddress("Asanda Village Milisi Street Strand");
		addcust.custcity("Strand");
		addcust.custstate("SA");
		addcust.custpinno("123536");
		addcust.custtelephone("0213652215");
		
		String email = randomstring()+"@gmail.com";
		addcust.custemail(email);
		addcust.custpassword("abcdef");
		addcust.custSubmitBtn();
		Thread.sleep(3000);
		boolean res= driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else {
			
			captureScreenshot(driver, "AddNewCustomer");
			Assert.assertTrue(false);
		}
		
	}
	
	
	
	//Create random email id
	public String randomstring() {
		
		String generatestring= RandomStringUtils.randomAlphabetic(8);
		return generatestring;
		
	}

}
