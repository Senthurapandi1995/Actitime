package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDOB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.linkText("Create new account")).click();
	        Thread.sleep(4000);
	        WebElement dateListbox = driver.findElement(By.id("day"));
	        Select s1=new Select(dateListbox);
	        s1.selectByIndex(0);
	        Thread.sleep(2000);
	        WebElement monListbox = driver.findElement(By.id("month"));
	        Select s2=new Select(monListbox);
	        s2.selectByValue("7");
	        Thread.sleep(2000);
	      WebElement yearListbox = driver.findElement(By.name("birthday_year"));
	      Select s3=new Select(yearListbox);
	        s3.selectByVisibleText("1995");
	        Thread.sleep(2000);
	        driver.close();
		}

	}
