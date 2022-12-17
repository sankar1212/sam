package org;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\ChromeDriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(3000);
	//	 driver.manage().window().maximize();
		
		 
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");  //here asssertEquals is the package and type of one condition
		
		System.out.println("Title Matched");

		
	//	assertEquals(driver.getTitle(),"Drop");                     //assertEquals condition is if fail it will not Executed
      //         System.out.println("Title not matched");
		
		
		driver.switchTo().frame(0);
		
	Actions ac=new Actions(driver);
	
	ac.dragAndDrop(driver.findElement(By.id("draggable")),
			                 driver.findElement(By.id("droppable"))).perform();
	
	Thread.sleep(3000);
	
    driver.switchTo().defaultContent();
    
    driver.close();
		
	}
	
	
}
