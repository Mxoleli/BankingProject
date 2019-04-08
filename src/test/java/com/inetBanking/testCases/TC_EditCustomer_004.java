package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.EditCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_EditCustomer_004 extends BaseClass {
	
	
	@Test
	public void EditCustomer() throws InterruptedException {
		
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		EditCustomerPage editcust = new EditCustomerPage(driver);
		
		editcust.EditCustomerLink();
		editcust.EnterCustID("62688");
		editcust.ClickAccsubmitBtn();
		Thread.sleep(3000);
		editcust.EditAdrress("Man Pole");
		editcust.EditCity("Cosmo");
		editcust.EditState("Whale");
		editcust.ClicksubmitEdit();
		
	}

}
