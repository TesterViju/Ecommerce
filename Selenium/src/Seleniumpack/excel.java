package Seleniumpack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {
	public static void main(String[] args) throws Throwable, IOException {
	// How to get data from excel file
	String path= "C:\\Users\\vijay\\OneDrive\\Desktop\\Telus work data\\Work dta\\Work sheet April 2022 .xlsx";
	
	FileInputStream file = new FileInputStream(path);
	
	double value = WorkbookFactory.create(file).getSheet("week 03").getRow(3).getCell(0).getNumericCellValue();
	
	System.out.println(value);
	
}
}



 