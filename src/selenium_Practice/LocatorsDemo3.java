package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {


public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	  
	    driver.navigate().to("https://www.facebook.com/login/");  
	    driver.manage().window().maximize(); 
	   
 // Tag & id//
	  // driver.findElement(By.cssSelector("#email")).sendKeys("Sankar");
	  // driver.findElement(By.cssSelector("input#email")).sendKeys("sankar");
	   
//  Tag &class 
	 //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("john");
	 //  driver.findElement(By.cssSelector(".inputtext")).sendKeys("john"); 
      
//Tag & Attribute
	   // driver.findElement(By.cssSelector("[name=email]")).sendKeys("siri");
	  //  driver.findElement(By.cssSelector("input[name=email]")).sendKeys("siri");
//Tag ,class & Attribute
	    
	driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("David");
	driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("abc");
	
	
     }
}
	
	
	
	
	

    	   
