package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean display=driver.findElement(By.name("login")).isEnabled();
	if(display==true)
		System.out.println("Login button is enable and pass");
	else
		System.out.println("Login buttton is not enable and fail");
	driver.close();
	}
}
