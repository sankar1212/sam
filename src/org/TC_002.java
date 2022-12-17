package org;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_002 {
	     static   String url = "http://adactinhotelapp.com/";
	     static   String username = "sankar1234";
	     static   String password = "729LW9";
	     static   String title1   = "Adactin.com - Hotel Reservation System";
	     static   String title2    = "Adactin.com - Search Hotel";
	     		
	      
	        public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		      WebDriver driver= new FirefoxDriver();
		      
	//	driver.navigate().to("http://adactinhotelapp.com/");
		      
		      driver.navigate().to(url);
		Thread.sleep(5000);
		
		if(driver.getTitle().equals(title1)) {    //Adactin.com - Hotel Reservation System
			System.out.println("Title matched");
		}
		else{
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
	//	driver.findElement(By.name("username")).sendKeys("sankar1234");
	//driver.findElement(By.id("password")).sendKeys("729LW9");
		
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(4500);
		
		
		
		if(driver.getTitle().equals(title2)) {       //Adactin.com - Search Hotel
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not Matched");
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
