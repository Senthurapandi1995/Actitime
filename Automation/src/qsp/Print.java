package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException  {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.selenium.dev/downloads/");
			Thread.sleep(1000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_CONTROL);	
			Thread.sleep(10000);
			for (int i = 0; i < 6; i++) {
				r.keyPress(KeyEvent.VK_TAB);
		}
		}
}
