package dataDrivenTesting;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData 
{
	public static void main(String[] args) throws Exception 
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Flipkart");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cel = row.createCell(0);
		cel.setCellValue("AutomationTesting");
		XSSFCell cel1 = row.createCell(1);
		cel1.setCellValue("HybridFramework");
		FileOutputStream fos = new FileOutputStream("./Data/WritingData.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
	}

}
