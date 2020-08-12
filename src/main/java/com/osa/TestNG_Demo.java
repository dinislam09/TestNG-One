package com.osa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	
		@BeforeSuite
		public void setUp() {
			System.out.println("Set up System Property");
		}
		
		@BeforeTest
		public void openBrowser() {
			System.out.println("Launch the browser");
		}
		
		@BeforeClass
		public void sentUrl () {
			System.out.println("Navigate to the URL");
	
		}
	
		@BeforeMethod
		public void login() {
			System.out.println("Login to Facebook");
	
		}
	
		@Test
		public void facebookTitleTest() {
			System.out.println("Facebook Title Test");
	
		}
	
		@AfterMethod 
		public void logout() {
			System.out.println("Logout from the facebook");
	
		}
		
		@AfterClass
		public void closeBrowser() {
			System.out.println("Close the browser");
		}
		
		@Test
		public void facebookURLTest() {
			System.out.println("Facebook url tset");
		}
	}
