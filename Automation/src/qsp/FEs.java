package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEs {
    static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13");
   List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']"));
   int count=allLinks.size();
   System.out.println(count);
   for(int i=0;i<count;i++) {
	   String text=allLinks.get(i).getText();
   System.out.println(text);
   }
	driver.close();
}
}
