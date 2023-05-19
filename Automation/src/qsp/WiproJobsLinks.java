package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobsLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("wipro jobs"+Keys.ENTER);
       List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
       int count=allLinks.size();
       System.out.println(count);
       for(int i=0;i<count;i++) {
    	    String url = allLinks.get(i).getAttribute("href");
    	   System.out.println(url);
       }
       driver.close();
	}
}
