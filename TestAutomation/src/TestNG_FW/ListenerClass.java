package TestNG_FW;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener 
{
	public void onStart(ITestContext context)
	{
		System.out.println("Testcases execution is started");
	}
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Testmethods execution is started");
		System.out.println(result.getName());
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testmethods execution is success");
		System.out.println(result.getName());  
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Testmethods execution is failed");
		System.out.println(result.getName());	  
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testmethods execution is skipped");
		System.out.println(result.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println("Testmethods execution is completed");
		  }
}


