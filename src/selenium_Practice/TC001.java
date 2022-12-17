package selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC001 {
     public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		 driver.navigate().to("http://adactinhotelapp.com/");		
		 Thread.sleep(5000);
		 System.out.println("Application opened");

		 driver.findElement(By.name("username")).sendKeys("sankar1234");
		 driver.findElement(By.name("password")).sendKeys("729LW9");
		 Thread.sleep(4000);
		 System.out.println("Login completed");
		 
		 driver.findElement(By.className("login_button")).click();
		 driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(3000);
		  System.out.println("logout completed"); 
		  
		 driver.close();
	}
}
