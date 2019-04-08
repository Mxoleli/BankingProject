package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Edit Customer")
	@CacheLookup
	WebElement lnkEditCustomer;
	
	@FindBy(how=How.NAME, using="cusid")
	@CacheLookup
	WebElement txtCustID;
	
	@FindBy(how=How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement accsubmitBtn;
	
	@FindBy(how=How.NAME, using="telephoneno")
	@CacheLookup
	WebElement txtEditMobileNo;
	
	@FindBy(how=How.NAME, using="addr")
	@CacheLookup
	WebElement txtEditAdrss;
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement txtEditCity;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement txtEditState;
	
	@FindBy(how=How.NAME, using="sub")
	@CacheLookup
	WebElement submitEdit;
	
	
	public void EditCustomerLink() {
		
		lnkEditCustomer.click();
	}
	
	public void EnterCustID(String cusID) {
		
	txtCustID.sendKeys(cusID);
	}
	
	
	public void ClickAccsubmitBtn() {
		
		accsubmitBtn.click();
	}
	
	
	public void EditMobileNo(String mobileno) {
		
	txtCustID.sendKeys(mobileno);
	}
	
	
	public void EditAdrress(String adrss) {
		
		txtEditAdrss.clear();
		txtEditAdrss.sendKeys(adrss);
		}
	
	public void EditCity(String city) {
		
		txtEditCity.clear();
		txtEditCity.sendKeys(city);
		}
	
	public void EditState(String state) {
		
		txtEditState.clear();
		txtEditState.sendKeys(state);
		}
	
	public void ClicksubmitEdit() {
		
		submitEdit.click();
	}
	

}
