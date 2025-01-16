package dataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteMultipleData
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkscount = links.size();
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Amazon Links");
				
		for(int i=0;i<linkscount;i++)
		{
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			XSSFRow row = sheet.createRow(i);
			XSSFCell cel = row.createCell(0);
			cel.setCellValue(url);
		}
		FileOutputStream fos = new FileOutputStream("./Data/AmazonLinks.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		
		
		
	}

}
