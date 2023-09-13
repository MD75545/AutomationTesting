package Checkboxtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checktest {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement checkbox=driver.findElement(By.name("accessories"));
		Boolean check=checkbox.isSelected();
		System.out.println(check);
		if(check==false)
		{
			checkbox.click();
		}
	}

}
