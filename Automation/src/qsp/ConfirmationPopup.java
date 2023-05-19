package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args)  {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
            WebDriverWait wait=new  WebDriverWait(driver,10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert a = driver.switchTo().alert();
			String text = a.getText();
			a.dismiss();
			System.out.println(text);
			boolean pressCancel = driver.findElement(By.id("demo")).isDisplayed();
			if(pressCancel==true)
				System.out.println("The text 'you pressed cancel' is displayed");
			else
				System.out.println("The text 'you pressed cancel' is not displayed");
	        driver.close();
		}
		}

