package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiHtWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	 WebElement un = driver.findElement(By.name("username"));
	 int h1=un.getSize().getHeight();
	 int w1=un.getSize().getWidth();
	 WebElement pwd = driver.findElement(By.name("pwd"));
	 int h2=pwd.getSize().getHeight();
	 int w2=pwd.getSize().getWidth();
	 if(h1==h2 && w1==w2)
		 System.out.println("height and width of username & password are equal and pass");
	 else
		 System.out.println("height and with of username & password are not equal and fail");
	 driver.close();
	}
}

