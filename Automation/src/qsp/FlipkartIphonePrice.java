package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphonePrice {
	 static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
        List<WebElement> nameList = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));		  
        List<WebElement> priceList = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
		int count=nameList.size();
	    System.out.println(count);
	    for(int i=0;i<count;i++) {
	    Thread.sleep(2000);
	    String names = nameList.get(i).getText();
	    Thread.sleep(2000);
	    String price = priceList.get(i).getText();
	    System.out.println(names+"===>"+price);
       }
	    driver.close();
	}
	}

