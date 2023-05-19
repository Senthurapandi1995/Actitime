package qsp;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActitimeTabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000); 
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> wh = driver.getWindowHandles();
		for(String a:wh) {
			Thread.sleep(2000);
			driver.switchTo().window(a);
			Thread.sleep(2000);
			List<WebElement> text = driver.findElements(By.xpath("//h2"));
			int count = text.size();
			for(int i=0;i<count;i++) {
				Thread.sleep(2000);
				String headings = text.get(i).getText();
				System.out.println(headings);
			}
		}
		driver.quit();
	}
}
