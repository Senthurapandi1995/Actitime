package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesAbcd {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Senthurapandi/Documents/Page1.html");
	driver.findElement(By.id("t1")).sendKeys("A");
	driver.switchTo().frame("f1");
	driver.findElement(By.id("t2")).sendKeys("B");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("C");
	WebElement frm = driver.findElement(By.xpath("//iframe"));
    driver.switchTo().frame(frm);
    driver.findElement(By.id("t2")).sendKeys("D");
}
}

