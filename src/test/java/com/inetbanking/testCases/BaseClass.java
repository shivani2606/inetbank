package com.inetbanking.testCases;



import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;


import com.inetbanking.utilities.ReadConfig;



public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.geturl();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public static  WebDriver driver;
    public static Logger logger;
   
    
  
    @Parameters("browser")
	@BeforeClass
public void setup(String br) throws Exception {
		

		logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
	
		
		if (br.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.getchoromepath());
			
			driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
          System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
			
			driver= new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
		
		}
   
		
		@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	public void capturescreen(WebDriver driver,String tname) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("screen shot taken");
	}
	public String randomString() {
		String generatedstring=RandomStringUtils.randomAlphabetic(6);
		return(generatedstring);
		
	}
	public static String randomNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
	
	
}
