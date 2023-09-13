package Checkboxtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checkboxtask2 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://semantic-ui.com/modules/checkbox.html");
		WebElement checkbox=driver.findElement(By.xpath("//div[@class='ui checkbox']"));
		boolean visible=checkbox.isDisplayed();
		System.out.println(visible);
		if(visible==true) {
			checkbox.click();
		}
	}

}
