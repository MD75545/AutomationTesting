package Locators.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("Input#email")).sendKeys("Cristiano Ronaldo");
		driver.findElement(By.cssSelector("Input#pass")).sendKeys("ronaldo@7777");
		driver.findElement(By.cssSelector("Button#u_0_5_0U")).click();
	}
}


