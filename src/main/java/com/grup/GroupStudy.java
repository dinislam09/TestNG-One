package com.grup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupStudy {
	
	@BeforeMethod
	public void day1() {
		System.out.println("day1");
		
	}
	
	@Test(priority=1,groups= {"smoke"})
	public void day2() {
		System.out.println("day2");
		
	}
	@Test(priority=5,dependsOnMethods="day5")  // depends fail hole skip korbe.
	public void day3() {
		System.out.println("day3");
		
	}
	@Test(priority=2,groups= {"smoke"})
	public void day4() {
		System.out.println("day4");
		
	}
	@Test(priority=6)
	public void day5() {
		System.out.println(9/0);
	}
	@Test(priority=3,groups= {"smoke"})
	public void day6() {
		System.out.println("day6");
	}
	@Test(priority=7)
	public void day7() {
		System.out.println("day7");
	}
	@Test(priority=4,groups= {"smoke"})
	public void day8() {
		System.out.println("day8");
	}
	@ AfterMethod
	public void day9() {
		System.out.println("day9");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
