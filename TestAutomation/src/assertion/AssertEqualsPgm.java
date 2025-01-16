package assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsPgm
{
	String a ="Jeajkdkjdg";//nnull
	WebDriver driver;
	@Test
	public void Equals() throws InterruptedException
	{
		String E_name = "Selenium";
		String A_name = "Automation";
		SoftAssert s = new SoftAssert();
		s.assertEquals(A_name, E_name);
		System.out.println("Hiii");
		System.out.println("Helllo");
		s.assertAll();
		
		
		
		
		
		
		
		
		
	}

}
