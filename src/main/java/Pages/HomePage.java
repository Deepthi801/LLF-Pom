package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePage.BasePage;

   public class HomePage extends BasePage {
		
	   @FindBy(xpath = "//img[@class = 'brand-logo']")
	   WebElement logo;
	   @FindBy(xpath = "//a[@data-link-type='category']")
	   @CacheLookup
	   WebElement promoArticle;
	   @FindBy(xpath = "//a[@data-link-type='external']")
	   @CacheLookup
	   WebElement CreateProH;
	   @FindBy(xpath = "//div[@class = 'scrollable-menu-area']/ul/li[1]")
	   @CacheLookup
	   WebElement ShopF;
	   
	   
	   
	   
	   public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
		
	public String validatepagetitle() {
		System.out.println("here");
		System.out.println(driver.getCurrentUrl());
		return driver.getTitle();
	}
	
	public boolean Logo() {
		logo.isDisplayed();
		System.out.println("Logo is Enabled " + logo.isDisplayed());
		return true;
						
	}
	
}
