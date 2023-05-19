package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethods {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
         driver.get("https://demo.actitime.com/");
         LoginPage l=new LoginPage(driver);
         l.setUser("admin");
         Thread.sleep(3000);
         l.setPassword("manager");
         Thread.sleep(3000);
         l.setLogin();
	}
}
