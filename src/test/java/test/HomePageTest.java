package test;

import org.testng.annotations.*;
import BasePage.BasePage;
import Pages.*;

public class HomePageTest extends BasePage {
	HomePage HP;
	Registerclk RC;
	
	  HomePageTest() { 
		  super(); 
		  }
	  
			
//	  @ AfterSuite 
//	  public void teardown() { 
//		  driver.quit(); 
//		  }
			 
	  
	@ BeforeSuite
	public void setup() {
		intialization();
		HP = new HomePage();
		HP.validatepagetitle();
		HP.Logo();
	}
	
	//@Test(priority = 1 , groups = { "regression" })
	@Test(priority = 1)
	public void Regclk() {
		RC = new Registerclk();
		RC.validatepagetitle();
		RC.registerbt();
			}
	

}

