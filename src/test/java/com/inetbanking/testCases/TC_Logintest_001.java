package com.inetbanking.testCases;





import org.testng.Assert;

import org.testng.annotations.Test;



import com.inetbanking.pageObjects.LoginPage;



public class TC_Logintest_001 extends BaseClass
 {
	
	
	@Test
	public void loginTest() throws Exception 
	{
		
	
		LoginPage lp=new LoginPage(driver);
	
	
		lp.setUserName(username);
		logger.info("entered user name");
	
		
		lp.setPassWord(password);
		logger.info("entered password");
		
		lp.clickSubmit();
		
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			System.out.println("title correct");
			logger.info("login passed");
			
		}
		else 
		{
			capturescreen(driver,"loginTest");
			Assert.assertTrue(false);
			System.out.println("title incorrect");
			logger.info("login failed");
			
		}	
	}
 }
		
		
		
		
	
	
	

	   
 


	

 
