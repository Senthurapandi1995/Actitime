package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerDoubleClickLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException  {
			WebDriver driver=new ChromeDriver();
			driver.get("http://vtiger.com/");
            WebElement resource = driver.findElement(By.partialLinkText("Resources"));
            Actions a=new Actions(driver);
            a.moveToElement(resource).perform();
            driver.findElement(By.partialLinkText("Customers")).click();
            WebElement login = driver.findElement(By.id("loginspan"));
            a.doubleClick(login).perform();
             boolean loginPage = driver.findElement(By.id("page")).isDisplayed();
             if(loginPage==true)
            	 System.out.println("Login page is dispalyed");
             else
            	 System.out.println("Login page is not dispalyed");
            driver.close();
}
}