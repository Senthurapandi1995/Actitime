package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriFileUploadAlert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException  {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.get("https://www.naukri.com/");
			driver.findElement(By.id("login_Layer")).click();
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("senthurapandi1995@gmail.com");			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("P@nd1senthur@");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//a[@href='/mnjuser/profile']")).click();
			File f=new File("./data/Resume.docx");
			String path = f.getAbsolutePath();
           driver.findElement(By.id("attachCV")).sendKeys(path);			
		}
}