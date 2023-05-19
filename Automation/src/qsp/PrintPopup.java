package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException  {
			WebDriver driver=new ChromeDriver();
			Thread.sleep(1000);
			driver.get("https://www.selenium.dev/downloads/");
			Thread.sleep(1000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_CONTROL);	
			Thread.sleep(1000);
			for (int i=0; i < 6; i++) {
				Thread.sleep(1000);
				r.keyPress(KeyEvent.VK_TAB);	
				Thread.sleep(1000);
			}
				Thread.sleep(1000);
			for (int i = 0; i < 3; i++) {
				Thread.sleep(1000);
				r.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
			}
			Thread.sleep(1000);
		    r.keyPress(KeyEvent.VK_1);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_MINUS);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_2);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			}
}