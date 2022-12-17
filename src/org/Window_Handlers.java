package org;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handlers {
	
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//wind-1
		driver.get("D:\\HTML_files\\multiplewindows.html");
		Thread.sleep(3000);
		
	//wind-2
    driver.findElement(By.id("btn2")).click();   
    Thread.sleep(3000);
    
	//wind-3	
    driver.findElement(By.id("btn3")).click();
    Thread.sleep(3000);	
    
    //here created for Reference to window because handle purpose and accessed in param webdriver object [driver] and multiple windowhandles(); method
    
    ArrayList<String> windinfo= new ArrayList<String> (driver.getWindowHandles());
    
    driver.switchTo().window(windinfo.get(0));
    
    driver.quit();
		
	}

}
