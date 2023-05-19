package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllContent {
	 static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Senthurapandi/Documents/BookWebTable.html");
	   List<WebElement> book = driver.findElements(By.xpath("//tr/td[1]"));
	   List<WebElement> price = driver.findElements(By.xpath("//tr/td[1]/../td[2]"));
	     int count = book.size();
	   System.out.println(count);
	   for(int i=0;i<count;i++) {
		   String bookName=book.get(i).getText();
		   String bookPrice=price.get(i).getText();
		   
	   System.out.println(bookName+"-->"+bookPrice);
	   }
		driver.close();
	}
	}
