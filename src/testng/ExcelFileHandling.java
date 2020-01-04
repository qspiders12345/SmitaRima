package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFileHandling 
{
	@Test
	public void excel() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:/Selenium156/ExcelFile.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		/*Sheet s=wb.getSheet("SeleniumBatch156");
		Row r=s.getRow(10);
		Cell c=r.getCell(10);
		//System.out.println(c.getStringCellValue());
		System.out.println(c.toString());*/
		System.out.println(wb.getSheet("SeleniumBatch156").getRow(10).getCell(10).getStringCellValue());
		//System.out.println(wb.getSheet("SeleniumBatch156").getRow(10).getCell(10).toString());
	}
}