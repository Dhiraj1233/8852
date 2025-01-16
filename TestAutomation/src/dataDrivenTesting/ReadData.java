package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("./Data/Testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		short lastcell = sheet.getRow(1).getLastCellNum();
		int lastrow = sheet.getLastRowNum();
		System.out.println(lastcell);
		System.out.println(lastrow);
		workbook.close();
		fis.close();
	}
		
		
		
		
		
		
		
		
		
		
//		
//		for(int i=0;i<lastrow;i++)
//		{
//			XSSFRow row = sheet.getRow(i);
//			for(int j=0;j<lastcell;j++)
//			{
//				XSSFCell cel = row.getCell(j);
//				String val = cel.getStringCellValue();
//				System.out.print(val+"\t");//usn/psw
//			}
//			System.out.println("");			
//		}
		

}
