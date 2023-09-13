package Checkboxtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class radioisenable {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		WebElement radio=driver.findElement(By.id("femalerb"));
		boolean active=radio.isEnabled();
		System.out.println(active);
		if(active==true) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].click;",radio);
		}
	}

}
