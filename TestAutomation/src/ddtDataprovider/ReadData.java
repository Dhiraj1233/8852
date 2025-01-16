package ddtDataprovider;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData 
{
	@DataProvider(name = "Excel")
	public String[][] ReadData() throws Exception
	{
		FileInputStream read = new FileInputStream("./Data/Testdata.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(read);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int lr = sheet.getLastRowNum();//0-4
		System.out.println(lr);//5
		short lc = sheet.getRow(0).getLastCellNum();//2
		System.out.println(lc);//1-2=2
		String [][] arr = new String [lr+1][lc];
		for(int r = 0;r<lr+1;r++)
		{
			XSSFRow row = sheet.getRow(r);//0
			for(int c=0;c<lc;c++)
			{
				String val = row.getCell(c).getStringCellValue();
				arr[r][c]= val;//0,0->Username
				
			}
			System.out.println(" ");
		}
		return arr;
	}


@Test(dataProvider = "Excel")
public void Testcase(String usn, String psw) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	Thread.sleep(2000);
	driver.get("https://www.Facebook.com");
	driver.findElement(By.id("email")).sendKeys(usn);
	driver.findElement(By.id("pass")).sendKeys(psw);
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
	driver.quit();
	}
}


















