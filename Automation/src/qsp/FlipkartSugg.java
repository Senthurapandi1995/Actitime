/* Open browser, go to flipkart.com,type iphone in search text-box,
  capture all auto-suggestion and print all with count and
  select the last auto=suggestion */

package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSugg {
	 static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
	   int count=allsugg.size();
	   System.out.println(count);
	  for(WebElement sugg : allsugg) {
		  String text = sugg.getText();
		  System.out.println(text);
	  }
	allsugg.get(count-1).click();
	//driver.close();
	}
	}
