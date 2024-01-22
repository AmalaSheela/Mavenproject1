package Test;

import java.io.IOException;

public class TestExcel1 {
	public static void main(String args[]) throws IOException
	{
		String s = ExcelCode1.readstringData(0,0);
		System.out.println(s);
		
		double d = ExcelCode1.readNumericData(1,1);
		System.out.println(d);
		
		
	}

}
