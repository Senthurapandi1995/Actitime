//intiElements() methods used in TestMethod class or MainMethod class

package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage2 {
	@FindBy(id="username")
	private WebElement untbx;  //declaration
	
	@FindBy (name="pwd")
	private WebElement pwtbx;
	
	@FindBy (xpath="//div[.='Login ']")
	private WebElement lgbtn;
		
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);       //utilization
		lgbtn.click();
	}
}
