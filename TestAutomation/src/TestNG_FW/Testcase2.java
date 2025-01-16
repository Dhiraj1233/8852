package TestNG_FW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Testcase2 extends GenericScript
{
	@Test(priority = 1)
	public void FetchCurrentUrl()
	{
	String	url = driver.getCurrentUrl();
	System.out.println(url);
	Assert.fail();
	}
	
	@Test(dependsOnMethods = "FetchCurrentUrl",priority = 2)
	public void CheckElementUSN()
	{
		WebElement usn = driver.findElement(By.id("email"));
		boolean res = usn.isDisplayed();
		System.out.println("Usn is Displayed "+ res);
	}

}
