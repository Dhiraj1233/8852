package basicScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Emirates 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.emirates.com/in/english/book/");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("//h2[text()='We value your privacy']"));
		if(text.isDisplayed())
		{
			System.out.println("Msg is Present");
			driver.findElement(By.xpath("//button[text()='Accept']")).click();
		}
		
		driver.findElement(By.xpath("//button[@type='button' and @class='input-field__button-icon nofocus']")).click();
		WebElement src = driver.findElement(By.xpath("(//span[@class='input-field__field'])[1]"));
		
		List<WebElement> opts = driver.findElements(By.xpath("//button/div/strong"));
		for(WebElement opt:opts)
		{
			 String txt = opt.getText();
			 if(txt.equals("Bangkok"))
			 {
				 opt.click();
			 }
			System.out.println(txt);
		}
		
		
		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		WebElement ele = driver.findElement(By.xpath("//label[text()='Departure airport']"));
//		WebDriverWait ew = new WebDriverWait(driver, 10);
//		WebElement ewe = ew.until(ExpectedConditions.visibilityOf(ele));
//		js.executeScript("document.getElementById('auto-suggest_0_label').value='Dehli'");
		//		js.executeScript("arguments[0].value='Dehli';",src);
//		
		
		
		
		
		
		
		
	}

}
