package com.osa;

import org.testng.annotations.Test;

public class InvocationCount {

	
	@Test(invocationCount=5)
	public void add() {
		
		int a=8;
		int b=9;
		System.out.println(a+b);
	}

}
