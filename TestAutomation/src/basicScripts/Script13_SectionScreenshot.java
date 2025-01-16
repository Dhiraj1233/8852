package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Script13_SectionScreenshot
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		WebElement section = driver.findElement(By.xpath("//div[@class='login_form_container']"));
		File temp = section.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Screenshots/Section.png");
		FileHandler.copy(temp, perm);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
