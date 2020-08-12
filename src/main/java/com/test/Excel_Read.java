package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excel_Read {
	WebDriver dr;
	@Test
	public void excelRead() throws IOException {
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\shihab\\Desktop\\Java\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(f1);
		XSSFSheet sheet = workbook.getSheet("Menu");
		int rowSize = sheet.getLastRowNum();
		
		//System.out.println(rowSize);
		
		for(int i=1;i<=rowSize;i++) {
			XSSFRow row = sheet.getRow(i);
			String username = row.getCell(0).toString();
			String password = row.getCell(1).toString();
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
			dr= new ChromeDriver();
			dr.get("https://www.facebook.com/");
			dr.findElement(By.id("email")).sendKeys(username);
			dr.findElement(By.id("pass")).sendKeys(password);
			dr.findElement(By.xpath("//input[@id='u_0_b']")).click();
			dr.quit();
			
			
			//System.out.println(username +" "+password);
		}
		
	}

	
	
	
	/* note:-Q. getsheet()
			ans: public XSSFSheet getsheet() {
					returntype = XSSFSheet
					mathodname = getsheet
					
				Q.How to get dependency?
				ans:- mvnrepository.com (Apache POI)
					
	} */
	
	
	
	
	
	
	
}
