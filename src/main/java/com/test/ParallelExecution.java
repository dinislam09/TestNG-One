package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver dr;
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.findElement(By.id("email")).sendKeys("shfsafk");
		dr.findElement(By.id("pass")).sendKeys("21423532");
		dr.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}
	
	@Test
	public void test2() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\geckodriver.exe");
		dr=new FirefoxDriver();
		dr.get("https://www.facebook.com/");
		dr.findElement(By.id("email")).sendKeys("iuwqihdwueq");
		dr.findElement(By.id("pass")).sendKeys("213712467");
		dr.findElement(By.xpath("//input[@id='u_0_b']")).click();
}
	
	
	
}