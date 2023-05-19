package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("Fail");
        FileOutputStream fos=new FileOutputStream("./data/Testscript.xlsx");
        wb.write(fos);
        wb.close();
 }
}

