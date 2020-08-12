package com.osa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_SecondPage {

	
	@Test(priority=1)
	public void carloan() {
		System.out.println("Car loan");
	
	}
	@Test(priority=4 , groups="bussinesloan")
	public void homeloan() {
		System.out.println("Home loan");
	
	}
	
	@Test(priority=2)
	public void bussinesloan() {
		System.out.println("Bussines loan");
	
	}
	
	@Test(priority=5)
	public void motorloan() {
		System.out.println("Motor loan");
	
	}
	
	@Test(priority=3)
	public void bikeloan() {
		System.out.println("Bike loan");
	
	}
	
	
	
}
