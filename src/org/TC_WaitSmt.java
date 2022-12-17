package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;

public class TC_WaitSmt {
	


	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		
		
		driver.findElement(By.name("Submit")).click();
		
		  // it will wait EMP information page to be available
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    System.out.println("Login Completed");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		
		
	}
}
		
		
		
		
		
	


