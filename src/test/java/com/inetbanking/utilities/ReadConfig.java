package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig(){
		File src=new File("./configurations/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception is: "+e.getMessage());
		}
		
	}
	
	public String geturl() {
		
		String url=pro.getProperty("baseURL");
		return url;
		
	}

	public String getusername() {
		
		String username=pro.getProperty("username");
		return username;
		
		
	}
	
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public String getchoromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxpath");
				return firefoxpath;
	}
}
