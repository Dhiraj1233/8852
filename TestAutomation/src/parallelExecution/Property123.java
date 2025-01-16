package parallelExecution;

import java.io.FileInputStream;
import java.util.Properties;

public class Property123 
{
	Properties p;
	public Property123() throws Exception
	{
		FileInputStream fis = new FileInputStream("./PropertyFiles/Url.properties");
		p = new Properties();
		p.load(fis);
		
	}
	public String Url()
	{
		String url = p.getProperty("testurl");
		return url;
	}
	public String Usn()
	{
		String usn = p.getProperty("usn");
		return usn;
	}
	public String Psw()
	{
		String psw = p.getProperty("psw");
		return psw;
	}
}
