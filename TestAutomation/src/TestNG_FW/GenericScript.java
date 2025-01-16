package TestNG_FW;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class GenericScript 
{
	WebDriver driver;
	@Parameters({"Browser"})
	@BeforeMethod
	public void LaunchApplication(String Browser) throws Exception
	{
		switch(Browser)
		{
			case "chrome":System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
							driver = new ChromeDriver();
							break;
			case "fire":System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
						driver = new FirefoxDriver();
						break;
		default:System.out.println("Invalid Browsers");		
		}
	
		driver.get(ReadPropertyFile());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	

	public static String ReadPropertyFile() throws Exception
	{
		FileInputStream fis = new FileInputStream("./PropertyFiles/Url.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("testurl");
		return url;
	}
		@AfterMethod
	public void CloseApplication() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
