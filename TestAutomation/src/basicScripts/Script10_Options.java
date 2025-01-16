package basicScripts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script10_Options 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/QSPR/Desktop/TestAutomation/HTML_FILES/DropDown.html");
		Thread.sleep(2000);
		WebElement s_dd = driver.findElement(By.id("Empire"));
		Select s = new Select(s_dd);
		ArrayList<String> arr = new ArrayList<>();//5
				
		List<WebElement> opts = s.getOptions();
		int count = opts.size();
		for(int i =0;i<count;i++)
		{
			WebElement opt = opts.get(i);
			String txt = opt.getText();
			arr.add(txt);	
		}
		Collections.sort(arr,Collections.reverseOrder());//5
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		
		
	}
}
