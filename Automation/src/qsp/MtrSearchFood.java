package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrSearchFood {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args)  {
			System.out.println("Enter a food item name");
			Scanner sc=new Scanner(System.in);
			String food = sc.nextLine();
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Senthurapandi/Desktop/Web/Hotel.html");
	        WebElement mtrListbox = driver.findElement(By.id("mtr"));
	        Select s=new Select(mtrListbox);
	        List<WebElement> duplicate = s.getOptions();
	        int count = duplicate.size();
	        int c=0;
	        for(int i=0;i<count;i++)
	        {
	        	String text = duplicate.get(i).getText();
	        	if(food.equals(text))
	        	c++;
	        }
	        if(c>=1)
	        	System.out.println(food+" is present in the MTR Listbox");
	        else
	        	System.out.println(food+" is not present in the MTR Listbox");
	        driver.close();
		}
		}
