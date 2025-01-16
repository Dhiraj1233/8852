package TestNG_FW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Testcase1 extends GenericScript
{
	@Test(dataProvider = "Credentials",dataProviderClass = DataSupplier.class,priority = 0,testName = "00001")
	public void FaceBookLogin(String usn,String psw)
	{
		WebElement usn1 = driver.findElement(By.id("email"));
		WebElement psw1 = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		usn1.sendKeys(usn);
		psw1.sendKeys(psw);
		login.click();
	}
}
