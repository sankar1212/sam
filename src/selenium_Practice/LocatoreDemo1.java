package selenium_Practice;

import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatoreDemo1 {
	
	   public static void main (String[] args) {
		   
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		   
		    WebDriver driver= new ChromeDriver();
		   driver.navigate().to("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=T+shirt&submit_search=");  
		   
		   driver.manage().window().maximize();   //  maximize webpage not mandatory

		   // i have use here "Id AND Name" Locators
		   WebElement  searchbox=driver.findElement(By.id("search_query_top"));  //  sendKeys("T-shirts"); 
		   searchbox. sendKeys("T-shirts");
		   
		   driver.findElement(By.name("submit_search")).click();
		   
		   // LinkText & PartialLinkText
		//   driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		   driver.findElement(By.partialLinkText("Chiffon Dress")).click();
	   }
	      
	  

}
