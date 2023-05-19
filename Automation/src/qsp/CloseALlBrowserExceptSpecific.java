package qsp;

import java.awt.AWTException;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseALlBrowserExceptSpecific {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.out.println("Enter the title of the browser");
		Scanner s=new Scanner(System.in);
		String eTitle = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("http://secure.indeed.com/");
        driver.findElement(By.id("apple-signin-button")).click();
        driver.findElement(By.id("login-facebook-button")).click();
        Set<String> allWh = driver.getWindowHandles();
        for( String wh:allWh) {
        	driver.switchTo().window(wh);
        	String title = driver.getTitle();
        	if(title.contains(eTitle)) {
        		
        		}
        	else {
        		driver.close();
        	}
              }
}
}