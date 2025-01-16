package dataDrivenTesting;

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

public class WriteMultipleData2
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		List<WebElement> eles = driver.findElements(By.xpath("//*"));
		int linkscount = eles.size();
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Amazon Element Text");
				
		for(int i=0;i<linkscount;i++)
		{
			WebElement ele = eles.get(i);
			String txt = ele.getText();
			XSSFRow row = sheet.createRow(i);
			XSSFCell cel = row.createCell(0);
			cel.setCellValue(txt);
		}
		FileOutputStream fos = new FileOutputStream("./Data/AmazonELementTexts.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		
		
		
		
	}
	

}
