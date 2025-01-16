package testNg;

import org.testng.annotations.Test;

public class launch 
{
	@Test(priority = 1)
	public void smokeTesting()
	{
		System.out.println("Smoke");
	}
	@Test(priority = 2)
	public void functionlTesting()
	{
		System.out.println("Functional");
	}
	@Test(priority = 3)
	public void adhocTestting()
	{
		System.out.println("adhoc");
	}
	@Test(priority = 4)
	public void performanceTesting()
	{
		System.out.println("performance");
	}
	

}
