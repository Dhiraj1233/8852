package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Script12_ElementScreenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.netflix.com");
//		WebElement ele = driver.findElement(By.xpath("(//button[text()='Get Started'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//select[@name='LanguageSelect'])[1]"));
		File temp = ele2.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Screenshots/Element2.png");
		FileHandler.copy(temp, perm);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
