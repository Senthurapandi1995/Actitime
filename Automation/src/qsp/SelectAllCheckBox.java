package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBox {
	 static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Senthurapandi/Documents/MutlipleCheckBox.html");
	   List<WebElement> selectAll = driver.findElements(By.xpath("//input"));
	     int count = selectAll.size();
	   System.out.println(count);
	   for(int i=0;i<count;i++) {
		   selectAll.get(i).click();
	   }
	}
	}
