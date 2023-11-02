package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode1 {
	
	public static FileInputStream f;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
public static String readstringData(int i,int j) throws IOException
{
	f=new FileInputStream("D:\\Demo\\Employee.xlsx");
	wb = new XSSFWorkbook(f);
	sh=wb.getSheet("sheet1");
	Row r= sh.getRow(i);
	Cell c=r.getCell(i);
	return c.getStringCellValue();
}


public static double readNumericData(int i,int j) throws IOException
{
	f=new FileInputStream("D:\\Demo\\Employee.xlsx");
	wb = new XSSFWorkbook(f);
	sh=wb.getSheet("sheet1");
	Row r= sh.getRow(i);
	Cell c=r.getCell(i);
	return c.getNumericCellValue();
}

	
}
	
	


