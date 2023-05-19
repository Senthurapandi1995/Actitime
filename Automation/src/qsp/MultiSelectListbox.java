package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Senthurapandi/Desktop/Web/Hotel.html");
	        WebElement mtrListbox = driver.findElement(By.id("mtr"));
	        Select s=new Select(mtrListbox);
	        s.selectByIndex(0);
	        s.selectByVisibleText("dosa");
	        s.selectByValue("d");
	        s.deselectByIndex(2);
	        s.deselectByVisibleText("dosa");
	        s.deselectByValue("i");
	        System.out.println(s.isMultiple());	        
	        driver.close();
		}
		}
