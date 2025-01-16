package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script19_FileUploadPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/QSPR/Desktop/TestAutomation/HTML_FILES/Upload.html");
		WebElement btn = driver.findElement(By.xpath("//input[@type='file']"));
		btn.sendKeys("C:\\Users\\QSPR\\Desktop\\TestAutomation\\HTML_FILES\\ABCD.html");
		
		
		
		
		
		
		
		
		
		
	}

}
