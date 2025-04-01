package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BasePage.BasePage;

public class Registerclk extends BasePage {

	@FindBy(xpath = "//*[@class='user-icon']")
	WebElement clkIcon;
	
	
public Registerclk(){
		
		PageFactory.initElements(driver, this);
	}
	
public void validatepagetitle() {
	
	String title = driver.getCurrentUrl();
	String actual = "https://www.llflooring.com/";
	
	Assert.assertEquals(title, actual, "true");
	
}
	public Registeration registerbt() {
		clkIcon.click();
		System.out.println("reg page: " + driver.getCurrentUrl());
		return new Registeration();
		
	}
	
}
