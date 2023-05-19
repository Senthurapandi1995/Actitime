package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginNoLocator {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException, AWTException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.switchTo().activeElement().sendKeys("admin");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		driver.switchTo().activeElement().sendKeys("manager");
		r.keyPress(KeyEvent.VK_ENTER);
}
}