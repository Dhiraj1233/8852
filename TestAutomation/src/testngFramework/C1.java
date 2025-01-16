package testngFramework;

import org.testng.Assert;
import org.testng.annotations.Test;


public class C1
{
	@Test(timeOut = 1000)
	public void Test1() throws Exception
	{
		Thread.sleep(2000);
		System.out.println("Test1 of class 1");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void Test2()
	{
		System.out.println("Test2 of class 1");
//		Assert.fail();
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Test3 of class 1");
	}
}







