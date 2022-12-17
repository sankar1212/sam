package selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.ibomma.net/");
       
      /*
      System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver1 =new FirefoxDriver();
		driver1.navigate().to("https://www.instagram.com/accounts/login/");
      */	
	}

}
