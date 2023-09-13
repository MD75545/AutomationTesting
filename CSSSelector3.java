package Locators.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("Input[type=text]")).sendKeys("Cristiano Ronaldo");
		driver.findElement(By.cssSelector("Input[type=password]")).sendKeys("Ronaldo@7");
		driver.findElement(By.cssSelector("button[type=submit]")).click();
	}

}
