package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import com.hrms.utility.Log;

 public class General extends Global {
	 
	public void OpenApplication()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		  driver.navigate().to(url);
		  System.out.println("Application opened");
		  Reporter.log("Application opened");
		  Log.info("Application opened");
	}
	
	  public void closeBrowser() {
    	  driver.close();
    	    System.out.println("browser closed");
    	    Log.info("browser closed");
	} 
	  
	public void login()throws Exception{
		driver.findElement(By.name(txtloginName)).sendKeys(usern);
		driver.findElement(By.name(txt_Password)).sendKeys(pw);
		driver.findElement(By.name(login)).click();
		Thread.sleep(4000);
		Log.info("login completed");
		
	}
	 public void logout() {
      driver.findElement(By.linkText(logout)).click();
      Log.info("logout completed");
	  }
	 public void EnterFrame() {
		 driver.switchTo().frame(frame_empinfo);
		   System.out.println("entered into frame");
		   Log.info("entered into frame");
	 }
	   public void ExitFrame() {
		   driver.switchTo().defaultContent();
		   System.out.println("exit to frame");
		   Log.info("exited frame");
	 }
	  
      public void addEmp() {
    	  
    	  driver.findElement(By.xpath(btn_Add)).click();
    	  driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
    	  driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
    	  driver.findElement(By.id(Save)).click();
        	  System.out.println("added new Emp");
    	      Log.info("added emp");
      }   
      
      public void EditEmp() 
      {
    	  
    	 driver.findElement(By.xpath(clickAnyEmplink)).click();
    	 
    	 Log.info("emp edited");
      }
  
      public void delemp() {
    	  System.out.println("delete emp");
    	  Log.info("emp deleted");
      }

	
		
	}
    
      
      

     

