package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script06 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));//379
		int count = links.size();
		System.out.println(count);		
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
			System.out.println(url);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
