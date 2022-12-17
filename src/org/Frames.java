package org;
import org .openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org .openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Frames {
	
	public static void main(String[] args) throws Exception {
		
	   //   System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	      
	    //  WebDriver driver= new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		// Open Application
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		Thread.sleep(5000);
		
	 //LOGIN
		 driver.findElement(By.name("Submit")).click();
		 
		 
		 driver.switchTo().frame("rightMenu");
         
		 //Add Button activity
		 driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		  
		  //EMP ADDING
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("sankar");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("gaddirala");
		  
		  // Save activity
		 driver.findElement(By.className("savebutton")).click();
		 Thread.sleep(5000);
		 
		 driver.switchTo().defaultContent();
		  
		  //LOgOut 
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(4000);
		  
		  
		  driver.close();
		 
		
	}

}
