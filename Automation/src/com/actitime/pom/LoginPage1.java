//Page Object Mode (Object repository or POM)

package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	@FindBy(id="username")
	private WebElement untbx;  //declaration
	
	@FindBy (name="pwd")
	private WebElement pwtbx;
	
	@FindBy (xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	public LoginPage1(WebDriver driver) {
	PageFactory.initElements(driver, this); //initialization
	}	
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);       //utilization
		lgbtn.click();
	}
}
