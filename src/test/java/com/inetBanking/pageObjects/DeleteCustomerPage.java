package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
	WebDriver ldriver;
	
	public  DeleteCustomerPage( WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(how=How.LINK_TEXT, using="Delete Customer")
	@CacheLookup
	WebElement lnkDeleteCustomer;
	
	@FindBy(how=How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement accsubmitBtn;
	
	
	public void DeleteCustomerLink() {
		
		lnkDeleteCustomer.click();
	}
	
	public void ClickAccsubmitBtn() {
		
		accsubmitBtn.click();
	}

}
