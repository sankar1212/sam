package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {
                       
	          public static void main(String[] args) {
	        	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	   		   
	   		   WebDriver driver=new ChromeDriver();
	   		   driver.navigate().to("http://automationpractice.com/index.php");  
	   		   
	   		   driver.manage().window().maximize();   //  maximize webpage not mandatory
 	
	            	// How to use ClassName
	         Dimension sliderno = driver.findElement(By.className("homeslider-container")).getSize();
	          System.out.println(sliderno);
	          
	          //How to use TagName
	          
	        Dimension links=driver.findElement(By.tagName("a")).getSize();
	        System.out.println(links);    	
   }
}
