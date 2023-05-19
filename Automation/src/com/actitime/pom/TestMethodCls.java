package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	@Test
	public void validLogin() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage1 l=new LoginPage1(driver);
		l.setLogin("admin", "manager");
	}
}
