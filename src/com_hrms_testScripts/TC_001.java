
package com_hrms_testScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC_001 {
	//public static void main(String[] args) throws Exception {
	
	@Test
	public void tc_001() throws Exception { 
		
	 DOMConfigurator. configure ("log4j.xml");
	 
		General gl= new General();
		
		gl.OpenApplication();
		gl.login();
        gl.logout();
        gl.closeBrowser();

    
	}

}
