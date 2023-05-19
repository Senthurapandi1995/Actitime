/* write a script tonprint color, font-size, font-text of "Forgotten password" link 
  present in "facebook" */

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbFontsizeFonttype {
		 static {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
			public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
			System.out.println(color);
			String fontsize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
			System.out.println(fontsize);
			String fonttype = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
			System.out.println(fonttype);
			driver.close();
		}
		}