package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_WebTable {
	
	public static void main(String[] args)  throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/WebTable.html");   //--------------- here taken this path from in system local drive //D: 
		
		int row       = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();  
		
		int column     = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]")).size();
		
		int row_col = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		
		System.out.println (row);                  //      ("row count"+ row);
		
		System.out.println (column);                //  	("column count"+ column);
		
	    System.out.println (row_col);                 //  ("row_colum"+ row_col);
		
		String celldata=  driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[4]/td[2]")).getText();
	    System.out.println(celldata);
	    
	    
	    
	}

}





   