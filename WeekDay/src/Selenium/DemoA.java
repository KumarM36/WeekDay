package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA {
	static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Kumar/Desktop/Elements.html");
		//Example for driver.findElements
		List<WebElement> a1=driver.findElements(By.tagName("span"));
		System.out.println(a1.size());
		for (WebElement b:a1) {
			System.out.println(b.getText());
		}
		List<WebElement> element=driver.findElements(By.id("d2"));
		//Example for element.findElements
		List<WebElement> a2=element.findElements(By.tagName("span"));
		System.out.println(a2.size());
		for (WebElement b:a2){
			System.out.println(b.getText());
		}
		{
			
		}
		}
		
	}
