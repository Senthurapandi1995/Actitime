//how StaleElementReferenceException coming

package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPom {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
WebElement untbx = driver.findElement(By.id("username"));
driver.navigate().refresh();
untbx.sendKeys("admin");
	}

}
