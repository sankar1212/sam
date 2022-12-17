package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Upload_File {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		driver.findElement(By.name("Submit")).click();
		
		driver.switchTo().frame("rightMenu");
	
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(2000);
     		
		driver.findElement(By.id("txtEmpLastName")).sendKeys("Lastname");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Firstname");
	
		WebElement fileinput= driver.findElement(By.xpath("//input[@name='photofile'][@type='file']"));
		
		fileinput. sendKeys("C:\\Adactin\\Test Scenarios Template\\TestScenarios_Adactin.xlsx"); 
		
		Thread.sleep(4000);
		
		
	     
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(6000);
		
		driver.switchTo().defaultContent();
		
		
		
		driver.quit();
		
	}



}
