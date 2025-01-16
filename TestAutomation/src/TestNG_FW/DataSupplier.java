package TestNG_FW;

import org.testng.annotations.DataProvider;

public class DataSupplier 
{
	@DataProvider(indices = {0})
	public Object[][] Credentials()
	{
		Object[][] data = {{"admin","admin@123"},{"abcd","abcd@123"},{"abcd111","abcd@111"}};
		return data;
	}

}
