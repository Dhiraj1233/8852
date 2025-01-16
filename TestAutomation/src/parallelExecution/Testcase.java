package parallelExecution;

import org.testng.annotations.Test;

public class Testcase
{
	@Test
	public void Testcase1()
	{
		System.out.println("Hi " +Thread.currentThread().getId());
	}

}
