package test;

import org.testng.annotations.Test;
import BasePage.BasePage;
import Pages.Registeration;

public class RegisterationTest extends BasePage {
	Registeration RG;
	
	public RegisterationTest() {
		super();
	}
	
	@Test(priority=3)
	public void reg() {
		RG = new Registeration();
		RG.pagevalidation();
		RG.userregister();
	}
	
	}
	

	 
	
