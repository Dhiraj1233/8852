package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.fdf.FDFJavaScript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		WebElement ele1 = driver.findElement(By.xpath("(//a[.='4.25.0 (September 20, 2024)'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//a[.='4.25.0 (September 20, 2024)'])[2]"));
		WebElement ele3 = driver.findElement(By.xpath("(//a[.='4.25.0 (September 20, 2024)'])[4]"));
		WebElement ele4 = driver.findElement(By.xpath("(//a[.='4.25.0 (September 20, 2024)'])[5]"));
		Actions a = new Actions(driver);
		Robot r = new Robot();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		ArrayList<WebElement> eles = new ArrayList<>();
		eles.add(ele1);
		eles.add(ele2);
		eles.add(ele3);
		eles.add(ele4);
		int count = eles.size();
		for(int i=0;i<count;i++)
		{
			WebElement ele = eles.get(i);
			a.contextClick(ele).perform();
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		Set<String> wins = driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}		
	}
}
