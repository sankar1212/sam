package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org .openqa.selenium.firefox.FirefoxDriver;
import org .openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class TC_004 {
	       static      String url = "http://183.82.103.245/nareshit/login.php";
	       static      String username = "nareshit";
	       static      String password ="nareshit";
	       static      String title1 =  "OrangeHRM - New Level of HR Management";
	       static      String title2= "OrangeHRM";
	       
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		//WebDriver driver= new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.navigate().to(url);
		Thread.sleep(5000);
		                                           
	            	if(driver.getTitle().equals(title1)) {               // ----------------------- OrangeHRM - New Level of HR Management
			              System.out.println("Title matched");
		             }
		               else {
			                  System.out.println("Title not matched");
			                // System.out.println(driver.getTitle());
			         }
	            	
		
		//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
	      driver.findElement(By.name("txtUserName")).sendKeys(username);
	      driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		              
		            if(driver.getTitle().equals(title2)) {                                 //OrangeHRM
			            System.out.println("Title matched");               
				        
			         }
			           else {
				           System.out.println("Title not matched");
				          // System.out.println(driver.getTitle());
			          }
		            
		        //MouseOver
		            Actions ac = new Actions(driver);
		            ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		            System.out.println("Mouseover completed");
		            Thread.sleep(3000);
		            
		            // click on AddEmployee sub menu
		            driver.findElement(By.linkText("Add Employee")).click();
		              Thread.sleep(6000);
		              System.out.println("clicked on AddEmp");
		            
		driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(5000);
		
		driver.close();
			
	}   

}
