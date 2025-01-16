package basicScripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20_ChildBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		WebElement ele = driver.findElement(By.xpath("//button[.='Click to open multiple popup windows']"));
		ele.click();//3cb/1pb
		String pwin = driver.getWindowHandle();//parent browser
		System.out.println("The address of parent browser is "+pwin);
		
		Set<String> allwins = driver.getWindowHandles();//4
		allwins.remove(pwin);
		for(String win:allwins)//1/2/3
		{ 
			driver.switchTo().window(win);
			driver.close();
//			if(!win.equals(pwin))
//			{
//				driver.close();
//			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
