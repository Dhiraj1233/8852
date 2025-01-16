package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script05 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QSPR/Desktop/TestAutomation/HTML_FILES/Link.html");
//		driver.findElement(By.tagName("a")).click();
//		WebElement ele = driver.findElement(By.id("n1"));
//		WebElement ele = driver.findElement(By.name("n1"));
//		WebElement ele = driver.findElement(By.className("c1"));
//		WebElement link = driver.findElement(By.linkText("Netflix 2024"));
//		WebElement link = driver.findElement(By.partialLinkText("Netflix"));
	    WebElement link = driver.findElement(By.cssSelector("a[href='https://www.netflix.com']"));
		link.click();
	}
}








