package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcLatestNews {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	List<WebElement> latestHeadings = driver.findElements(By.xpath("//h2[.='Latest Business News']/../ul/li/a/h3"));
    int count=latestHeadings.size();
    System.out.println(count);
    for(int i=0;i<count;i++) {
 	    String newsHeading = latestHeadings.get(i).getText();
 	   System.out.println((i+1)+"."+newsHeading);
	}
    driver.close();
}
}

//20.WebElement latestNews = driver.findElement(By.xpath("//h2[.='Latest Business News']"));
//21.Actions a=new Actions(driver);
//22.a.moveToElement(latestNews).perform();