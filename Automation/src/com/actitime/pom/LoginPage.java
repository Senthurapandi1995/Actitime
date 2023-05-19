package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

     public class LoginPage {
     private WebElement  untbx;
     private WebElement  pwtbx;
     private WebElement lgnbtn;
     public LoginPage(WebDriver driver) {
	 untbx=driver.findElement(By.id("username"));
	 pwtbx=driver.findElement(By.name("pwd"));
	 lgnbtn=driver.findElement(By.xpath("//div[.='Login ']"));
     }
	 public void setUser(String un) {
		 untbx.sendKeys(un);
	 }
	
	public void setPassword(String pw) {
		 pwtbx.sendKeys(pw);
	}
	
	public void setLogin() {
		lgnbtn.click();
	}
}

