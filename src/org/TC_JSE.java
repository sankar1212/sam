package org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_JSE {
	
	public static void main(String[] args)throws Exception  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		    // Login  "click" activity handle by JSE
		
		WebElement loginbutton= driver.findElement(By.name("Submit"));
			JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",loginbutton);
		Thread.sleep(4000);
		
		System.out.println("login completed");
		
		//logout completed with "click requirement" handled by JSE
		
	         WebElement logout= driver.findElement(By.linkText("Logout"));
	              JavascriptExecutor executor2= (JavascriptExecutor)driver;
	                 executor2.executeScript("arguments[0].click()", logout);
	                  Thread.sleep(4000);
	       
	       System.out.println("logout completed");
	       
	       driver.close();

	  
	}

	

}
