package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script17_AlertPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		WebElement btn = driver.findElement(By.xpath("//button[.='Prompt Alert Box']"));
		btn.click();
		Alert popup = driver.switchTo().alert();
		String txt = popup.getText();
		System.out.println(txt);
		popup.sendKeys("no");
//		popup.dismiss();
		popup.accept();
		
		
		
		
	}

}
