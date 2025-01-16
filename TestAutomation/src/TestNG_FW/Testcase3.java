package TestNG_FW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Testcase3 extends GenericScript
{
	@Test(dependsOnMethods = "FetchCurrentUrl",priority = 2)
	public void CheckElementUSN()
	{
		WebElement usn = driver.findElement(By.id("email"));
		boolean res = usn.isDisplayed();
		System.out.println("Usn is Displayed "+ res);
	}

}
