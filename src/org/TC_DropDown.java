package org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org .openqa.selenium.firefox.FirefoxDriver;

import org .openqa.selenium.support.ui.Select;




public class TC_DropDown {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		driver.findElement(By.name("Submit")).click();
		
		
		driver.switchTo().frame("rightMenu");
		
		Select st = new Select(driver.findElement(By.name("loc_code")));
		
		st.selectByVisibleText("Emp. ID");
		
		  driver.findElement(By.name("loc_code")).sendKeys("1240");
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//input[@value='Search']")).click();
		  
		  driver.findElement(By.name("chkLocID[]")).click();
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//input[@value='Delete']")).click();
		  Thread.sleep(4000);
		  
		  driver.switchTo().defaultContent();
		  
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(3000);
		  driver.close();
		  
           
		  
		  
		  
	}
}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	


