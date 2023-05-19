package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarTopAndBottom {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bbc.com/");
	Thread.sleep(3000);
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	j.executeScript("window.scrollTo(0,0)");
}
}
