package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args)  {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
			driver.findElement(By.id("policynumber")).sendKeys("123");
			driver.findElement(By.id("dob")).click();
			 WebElement month = driver.findElement(By.className("ui-datepicker-month"));
            Select s1=new Select(month);
            s1.selectByValue("6");
            WebElement year = driver.findElement(By.className("ui-datepicker-year"));
            Select s2=new Select(year);
            s2.selectByValue("1995");
            driver.findElement(By.linkText("1")).click();
            driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
            driver.findElement(By.id("renew_policy_submit")).click();
			boolean errorMsg = driver.findElement(By.id("policynumberError")).isDisplayed();
			if(errorMsg==true)
				System.out.println("The text 'Please enter valid Policy No.' is displayed");
			else
				System.out.println("The text 'Please enter valid Policy No' is not displayed");
	        driver.close();
		}
}
