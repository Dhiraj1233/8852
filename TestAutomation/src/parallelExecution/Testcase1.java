package parallelExecution;

import org.testng.annotations.Test;

public class Testcase1
{
	@Test
	public void Testcase2()
	{
		System.out.println("Hello " +Thread.currentThread().getId());
	}

}
