package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {
		public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
	        Workbook wb = WorkbookFactory.create(fis);
	        String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
	        System.out.println(data);
	 }
	}