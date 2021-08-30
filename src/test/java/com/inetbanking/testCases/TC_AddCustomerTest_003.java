package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addnewcust() throws InterruptedException  {
		
		LoginPage lp=new LoginPage(driver);
		
		
		lp.setUserName(username);
		logger.info("entered user name");
	
		
		lp.setPassWord(password);
		logger.info("entered password");
		
		lp.clickSubmit();
		Thread.sleep(2000);
		
		AddCustomerPage ap=new AddCustomerPage(driver);
		
		ap.clickAddNewCustomer();
		logger.info("providing customer details...");
		ap.custName("shivani");
		ap.custgender("female");
		ap.custdob("06","21","96");
		ap.custaddress("INDIA");
		ap.custcity("hyd");
		ap.custstate("AP");
		ap.custpinno("500035");
		ap.custtelephoneno("234567877");
		String email=randomString()+"@gmail.com";
		ap.custemailid(email);
		ap.custpassword("12345");
		ap.custsubmit();
		Thread.sleep(2000);
		logger.info("validation started");
		
	boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
	if(res==true)	{
		Assert.assertTrue(true);
		logger.info("testcase passed");
		
	}
	else {
		//Assert.assertTrue(false);
		logger.info("testcase failed");
		try {
			capturescreen(driver,"addnewcust");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(false);
	}
		
	}

}
