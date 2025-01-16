package facebookFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements 
{
	@FindBy(id ="email")
	private WebElement usn;

	@FindBy(id ="pass")
	private WebElement psw;
	
	@FindBy(name="login")
	private WebElement lgn;
	
	LoginPageElements(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnterUsn()
	{
		usn.sendKeys("Admin");
	}
	
	public void EnterPsw()
	{
		psw.sendKeys("admin@123");
	}
	
	public void ClcikLgn()
	{
		lgn.click();
	}
	
	

}
