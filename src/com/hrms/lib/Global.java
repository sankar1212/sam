package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	//=========================variables info /  Data ======================
	
  WebDriver driver ;   // import WebDriver package also Global class   here global class is Base class 
     
	public String url    = "http://183.82.103.245/nareshit/login.php";
	public String usern  = "nareshit";
	public String pw     = "nareshit";
    public String EFN    = "sankar";
    public String ELN    = "gaddirala";
    
    
	//====================Objects==================
	public String txtloginName = "txtUserName";
	public String txt_Password = "txtPassword";  
	public String login        = "Submit";
	public String logout       = "Logout";
	public String frame_empinfo   = "rightMenu";
	public String txt_EFN      = "txtEmpFirstName";
	public String txt_ELN      = "txtEmpLastName";
	public String btn_Add      = "//input[@value='Add']";
  	public String Save         = "btnEdit";
     
  	public String clickAnyEmplink     ="//*[@id='standardView']/table/tbody/tr[1]/td[3]/a";
  	
  }
