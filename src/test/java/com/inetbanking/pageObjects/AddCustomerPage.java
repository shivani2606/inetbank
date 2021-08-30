package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(linkText="New Customer")
	@CacheLookup
	WebElement lnkaddcustomer;
	@FindBy(xpath="//input[@name='name']")
	@CacheLookup
	WebElement txtcustomername;
	@FindBy(name="rad1")
	@CacheLookup
	WebElement rdgender;
	@FindBy(id="dob")
	@CacheLookup
	WebElement txtdob;
	@FindBy(name="addr")
	@CacheLookup
	WebElement txtaddress;
	@FindBy(name="city")
	@CacheLookup
	WebElement txtcity;
	@FindBy(name="state")
	@CacheLookup
	WebElement txtstate;
	@FindBy(name="pinno")
	@CacheLookup
	WebElement txtpin;
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement txtphone;
	@FindBy(name="emailid")
	@CacheLookup
	WebElement txtemail;
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	@FindBy(name="sub")
	@CacheLookup
	WebElement btnsubmit;
	@FindBy(name="res")
	@CacheLookup
	WebElement btnreset;
	public void clickAddNewCustomer() {
		lnkaddcustomer.click();
			
	}

	public void custName(String cname) {
		txtcustomername.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		rdgender.click();
	}

	public void custdob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpin.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		txtphone.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemail.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnsubmit.click();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

