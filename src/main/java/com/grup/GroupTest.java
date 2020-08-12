package com.grup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupTest {
	WebDriver dr;
	
	@Test
	public void day1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");
	}
	
	@Test
	public void day2() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\geckodriver.exe");
		dr=new FirefoxDriver();
		dr.get("https://www.facebook.com/");
	}

}
