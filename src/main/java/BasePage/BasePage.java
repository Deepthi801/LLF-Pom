package BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import utulities.Utilities;

public class BasePage {
	
	public static WebDriver driver;
	public String sBrowser;
	public String sUrl;
	

	public Properties prop;

	public BasePage() {

		try {

			prop = new Properties();
			FileInputStream fs = new FileInputStream(
					"C:\\Users\\vinay\\eclipse-workspace\\Llflooring\\src\\main\\java\\Config\\config.properties");
			prop.load(fs);

			/*
			 * sBrowser = prop.getProperty("Browser"); sUrl = prop.getProperty("Url");
			 */

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void intialization() {

		String BrowserName = prop.getProperty("Browser");

		if (BrowserName.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver" ,"C:\\Driver new\\chromedriver.exe" );
			driver = new ChromeDriver();
			System.out.println("success");
		} else if (BrowserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Utilities.Implicit_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utilities.page_util_timeout, TimeUnit.SECONDS);

		driver.get(prop.getProperty("Url"));
		driver.findElement(By.xpath("//div[@class='bx-wrap']/a")).click();
}
}