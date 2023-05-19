package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiCheckbox {
    static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	boolean checkbox=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
	if(checkbox==true)
		System.out.println("Checkbox is selected and pass");
	else
		System.out.println("Checkbox is not selected and fail");
	driver.close();
	}
}

