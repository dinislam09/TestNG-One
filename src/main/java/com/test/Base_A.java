package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Base_A {
	WebDriver dr;
	
	public static Logger log = Utilities.getlog(Base_A.class);
	
	@Test
	 public void openBrowse(){
		log.info("Set property");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
		log.info("Open Blank Browser");
		dr = new ChromeDriver();
		log.info("Pass the url");
		dr.get("https://www.facebook.com/");
		 
	}
	 
	/*   @AfterMethod
	 public void closeBrowser() throws InterruptedException {
		 dr.quit();
		 
	}     */

		

}
