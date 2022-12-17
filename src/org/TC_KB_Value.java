package org;
import org .openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC_KB_Value {
	public static void main(String[] args)throws Exception {
		  
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
	
	 WebDriver driver= new ChromeDriver();
	   
	   driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	   
	   driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	   driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	   Thread.sleep(3000);

	     Robot r= new Robot();
	     
	    r.keyPress(KeyEvent.VK_TAB);    //---------------------------------TAB
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("TAB key completed");
		Thread.sleep(5000);
		
	     r.keyPress(KeyEvent.VK_ENTER);  //-------------------------------ENTER
		 r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		System.out.println("ENTER key completed");
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		  System.out.println("Logout completed");
		
		driver.close();
				
	}

}
