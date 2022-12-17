package org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org .openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alerts {
		public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(5000);
	
	//LOGIN FUN:
	driver.findElement(By.name("Submit")).click();
	
	// Alert/Pop up Fun:
	Alert a= driver.switchTo().alert();
	
	System.out.println(a.getText());
	Thread.sleep(5000);
	
 //  a.dismiss(); //-----------------------------------for using cancel button
	
   a.accept();  //--------------------------------- for using OK Button
	Thread.sleep(5000);
	
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3500);
	
	//LOGIN FUN:
	driver.findElement(By.name("Submit")).click();
	
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3500);
	driver.close();
	
	}

		
			
		

}
