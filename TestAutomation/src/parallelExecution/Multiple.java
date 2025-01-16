package parallelExecution;

import org.testng.annotations.Test;

public class Multiple
{
	@Test
	public void Test()
	{
		System.out.println("T1 "+Thread.currentThread().getId());
	}
	
	@Test
	public void Test1()
	{
		System.out.println("T2 "+Thread.currentThread().getId());
	}

}
