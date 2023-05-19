//write a script to print all option in mtr list without duplicates

package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrWithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Senthurapandi/Desktop/Web/Hotel.html");
	        WebElement mtrListbox = driver.findElement(By.id("mtr"));
	        Select s=new Select(mtrListbox);
	        List<WebElement> allOptions = s.getOptions();
	        int count = allOptions.size();
	        TreeSet<String> a=new TreeSet<String>();
	        for(int i=0;i<count;i++)
	        {
	        	String text = allOptions.get(i).getText();
	        	a.add(text);
	        }
	        for(String noDuplicate: a)
	        {
	        	System.out.println(noDuplicate);
	        }
	        driver.close();
		}
		}
