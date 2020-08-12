package com.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest_A extends Base_A{

	
	@DataProvider(name="facebook")
	public Object[][] excelRead() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\shihab\\Desktop\\Group A.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(f);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowSize=sheet.getLastRowNum();
		int cellSize=sheet.getRow(0).getLastCellNum();
		
		
		Object[][]data=new Object[rowSize][cellSize];
		
		for (int i=1;i<=rowSize;i++) {
			for(int j=0; j<cellSize;j++) {
				
				data[i-1][j]=sheet.getRow(i).getCell(j);
			}
			
		}
		
		return data;
		//System.out.println(data[1][1]);
}
	
	
	
	@Test(dataProvider="facebook")
	public void getData(Object a,Object b,Object c,Object d) {
		
	
		
		dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys(a.toString());
		dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys(b.toString());
		dr.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(c.toString());
		dr.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(d.toString());
		dr.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		//System.out.println(a);
		
	}
	
	
	



}
