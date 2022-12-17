package org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Screen_shot {
	
	

	public static void main(String[] args)throws  Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		try {
		driver.get("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		WebElement element= driver.findElement(By.linkText("PIM"));
		
		Actions ac= new Actions(driver);
		
		ac.moveToElement(element).perform();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Add Empolyee123")).click();
		
		Thread.sleep(3000);
        driver.findElement(By.linkText("Logout"));

		}
		
		catch(Exception e){
			
		
			File ff=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils .copyFile(ff,new File("/SeleniumPro/Screenshots/img.jpg "));          //img.jpj         /SeleniumPro/Screenshots/img.jpg
            
      
             Thread.sleep(4000); 
             
             System.out.println("screen shot is saved successfully");
           
			
		}
            
		driver.quit();
	
	}


	}


	

