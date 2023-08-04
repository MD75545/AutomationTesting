package Locators.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement name=driver.findElement(By.name("email"));
		name.sendKeys("Cristiano");
		WebElement name1=driver.findElement(By.name("pass"));
		name1.sendKeys("ronaldo@777");
		WebElement button1=driver.findElement(By.name("login"));
		button1.click();
	}

}
