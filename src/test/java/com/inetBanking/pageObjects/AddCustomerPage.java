package com.inetBanking.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.NAME, using="name")
	@CacheLookup
	WebElement CustomerName;
	
	@FindBy(how=How.NAME, using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how=How.ID, using="dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how=How.NAME, using="addr")
	@CacheLookup
	WebElement txtaddr;
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how=How.NAME, using="pinno")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(how=How.NAME, using="telephoneno")
	@CacheLookup
	WebElement txttelephoneno; 
	
	@FindBy(how=How.NAME, using="emailid")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how=How.NAME, using="sub")
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void AddNewCustomerLink() {
		
		lnkAddNewCustomer.click();
	}
	
	public void CustomerName(String custName) {
		CustomerName.sendKeys(custName);
	}
	
	public void custGender() {
		rdGender.click();
	}
	
	public void custdob(String mm, String dd, String yyyy) {
		txtdob.sendKeys(dd);
		txtdob.sendKeys(Keys.TAB);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(Keys.TAB);
		txtdob.sendKeys(yyyy);
		
		
	}
	
	public void custaddress(String addrss) {
		
		txtaddr.sendKeys(addrss);
	}
	
	public void custcity (String city) {
		
		txtcity.sendKeys(city);
	}
	
	public void custstate (String state) {
		
		txtstate.sendKeys(state);
	}
	
	public void custpinno (String pin) {
		
		txtpinno.sendKeys(String.valueOf(pin));
	}
	
	public void custtelephone (String telephone) {
		
		txttelephoneno.sendKeys(telephone);
	}
	
	public void custemail (String email) {
		
		txtemail.sendKeys(email);
	}
	
	public void custpassword (String pswd) {
		
		txtpassword.sendKeys(pswd);
	}
	
	public void custSubmitBtn() {
		btnSubmit.click();
	}

}
