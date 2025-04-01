package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import BasePage.BasePage;

public class Registeration extends BasePage{
	
	@FindBy(xpath = "//input[@id='registration-form-fname']")
	WebElement fname;
	@FindBy(xpath = "//input[@id='registration-form-lname']")
	WebElement lname;
	@FindBy(xpath = "//input[@id='registration-form-phone']")
	WebElement phone;
	//@FindBy()
	
	
public Registeration(){
		
		PageFactory.initElements(driver, this);
	}

	public void pagevalidation() {
		
		String Actual = driver.getCurrentUrl();
		String Expected = "https://www.llflooring.com/login";
		Assert.assertEquals(Actual, Expected);
		
			}
	
	public void userregister() {
		
		fname.sendKeys("rgf");
		lname.sendKeys("rgtg");
		driver.findElement(By.xpath("//input[@id='registration-form-phone']")).sendKeys("4565654565");
		driver.findElement(By.xpath("//input[@id='registration-form-email']")).sendKeys("ght@kj.vgb");
	
		driver.findElement(By.xpath("//input[@id='registration-form-email-confirm']")).sendKeys("ght@kj.vgb");
		driver.findElement(By.xpath("//input[@id='registration-form-password']")).sendKeys("5Tgyhg%");
		driver.findElement(By.xpath("//input[@id='registration-form-password-confirm']")).sendKeys("5Tgyhg%");
	
		WebElement Iama = driver.findElement(By.xpath("//div[@class ='form-group']/select"));
		Select sl = new Select(Iama);
		sl.selectByVisibleText("Homeowner");
		WebElement Emailsub = driver.findElement(By.xpath("//label[@class ='custom-control-label']"));
	    System.out.println("Email Subscribtion selection is " + Emailsub.isEnabled());
	}
	
	
}
