package Locators.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement classname=driver.findElement(By.className("gLFyf"));
		classname.sendKeys("cristiano Ronaldo");
		
		WebElement classname1=driver.findElement(By.className("gNO89b"));
		classname1.click();
	}

}
