package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWriting 
{
	@Test
	public void write() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:/Selenium156/ExcelFile.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//Sheet s=wb.getSheet("SeleniumBatch156");
		Sheet s1=wb.createSheet("Aashirvadit");
		Row r=s1.createRow(1);
		Cell c=r.createCell(1);
		c.setCellValue("Qspiders");
		FileOutputStream fos=new FileOutputStream("E:/Selenium156/ExcelFile.xlsx");
		wb.write(fos);
	}
}