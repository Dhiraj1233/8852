package facebookFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage 
{
	WebDriver driver ;
	@BeforeMethod
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	@AfterMethod
	public void CloseBrowser() throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	

}
