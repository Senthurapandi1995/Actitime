package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActittimeExcelFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
      //  String url = wb.getSheet("Actitime").geRow(0).getCell(1).getStringCellValue("url");
        //String un = wb.getSheet("Actitime").geRow(1).getCell(1).getStringCellValue("username");
        //String pw = wb.getSheet("Actitime").geRow(2).getCell(1).getStringCellValue("password");
        WebDriver driver=new ChromeDriver();
       // driver.get(url);
        //driver.findElement(By.id("username")).sendKeys(un);
        //driver.findElement(By.name("pwd")).sendKeys(pw);   
        driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
}

