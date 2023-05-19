//write a script to print all the option present in MTR listbox in alphabet order

package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrListSorted {
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
	        ArrayList<String> a=new ArrayList<String>();
	        for(int i=0;i<count;i++)
	        {
	        	String text = allOptions.get(i).getText();
	        	a.add(text);
	        }
	        Collections.sort(a);
	        for(int i=0;i<count;i++)                  
	        {
	        String order = a.get(i);
	        	System.out.println(order);
	        }
	        	driver.close();
		}}
/* line 33 using for each loop
 for(String sorted: a)
{
	System.out.println(sorted);
}
	*/	
