package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.DeleteCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_DeleteCustomer_005 extends BaseClass {
	
	
	@Test
	public void DeleteCustomer()throws InterruptedException {
		
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		
		DeleteCustomerPage deletcust = new DeleteCustomerPage(driver);
		deletcust.DeleteCustomerLink();
		deletcust.ClickAccsubmitBtn();
		driver.switchTo().alert().accept();
	}

}
