package Test11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static FileInputStream f;
public static XSSFWorkbook wb;
public static XSSFSheet sh;
public static String readStringData(int i, int j) throws IOException{
f= new FileInputStream("D:\\demo\\employee.xlsx");
wb =new XSSFWorkbook(f);
sh =wb.getSheet("new Sheet");
XSSFRow r =sh.getRow(i);
Cell c = r.getCell(j);
return c.getStringCellValue();
}
public static String readNumericData(int i, int j) throws IOException{
f= new FileInputStream("D:\\demo\\employee.xlsx");
wb =new XSSFWorkbook(f);
sh =wb.getSheet("new Sheet");
XSSFRow r =sh.getRow(i);
Cell c = r.getCell(j);
return c.getStringCellValue();
}
}
