package Locators.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("Cristiano");
		
		driver.findElement(By.name("pass")).sendKeys("ronaldo@77");
		
		
		driver.findElement(By.tagName("Button")).click();
		
	}

}
