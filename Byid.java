package Locators.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byid {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement Email=driver.findElement(By.id("email"));
	Email.sendKeys("CristianoRonaldo@gmail.com");
	WebElement Pass=driver.findElement(By.id("pass"));
	Pass.sendKeys("ronaldo123");
	}

}
