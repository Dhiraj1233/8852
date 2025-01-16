package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script09_SIngleSelectDropDown 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/QSPR/Desktop/TestAutomation/HTML_FILES/DropDown.html");
		Thread.sleep(2000);
		WebElement s_dd = driver.findElement(By.id("Empire"));
		
		
		Select s = new Select(s_dd);
		if(s.isMultiple()) {
		s.selectByIndex(3);
		s.selectByVisibleText("Mutton Biryani");
		s.selectByValue("k");
		Thread.sleep(2000);
//		s.deselectAll();
		s.deselectByIndex(2);
		Thread.sleep(2000);
		s.deselectByValue("i");
		Thread.sleep(2000);
		s.deselectByVisibleText("Mutton Biryani");
		}
		else {
			System.out.println("The drop down is single select");
		}
	}

}
