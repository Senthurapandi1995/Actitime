package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFileOtherWay {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet s = wb.getSheet("CreateCustomer");
Row r = s.getRow(1);
Cell c = r.getCell(2);
String data = c.getStringCellValue();
System.out.println(data);
	}
}
