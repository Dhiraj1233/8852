package facebookFW;

import org.testng.annotations.Test;

public class Testcase1 extends BasePage
{
	@Test
	public void LoginModule()
	{
		LoginPageElements lp = new LoginPageElements(driver);
		lp.EnterUsn();
		lp.EnterPsw();
		lp.ClcikLgn();
	}

}
