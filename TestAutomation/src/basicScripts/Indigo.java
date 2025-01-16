package basicScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indigo
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=nav_logo");
		WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchBar.sendKeys("Wrist Watches");
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		WebElement leather = driver.findElement(By.xpath("//span[.='Leather']"));
		leather.click();
		WebElement pagination = driver.findElement(By.xpath("(//div[@role='navigation'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",pagination);
		Point loc = pagination.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		js.executeScript("window.scrollIntoView("+x+","+y+")");
//		List<WebElement> pages = driver.findElements(By.xpath("//a[@class='s-pagination-item s-pagination-button']"));
//		for(WebElement page:pages)
//		{
//			String no = page.getText();
//			System.out.println(no);
//			Thread.sleep(2000);
//			if(no.equals("2"))
//			{
//				page.click();
//			}
//		}
//		driver.findElement(By.xpath("(//*[contains(@data-asin,\"B0\")])[position()>3]")).click();
	}

}
