package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script16_ImplicitWait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		WebDriverWait ew = new WebDriverWait(driver, 10);
		ew.until(ExpectedConditions.titleContains("DemoApps | Qspiders | Text Box"));
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);		
		ew.until(ExpectedConditions.urlContains("https://demoapps.qspiders.com/ui"));
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
	}
}
