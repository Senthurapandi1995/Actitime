package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultiDataFromExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        int count = wb.getSheet("InvalidLogin").getLastRowNum();
        for(int i=1;i<=count;i++) {
        	String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
        	String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
            System.out.println(un+" "+pw);
        }
 }
}
 
