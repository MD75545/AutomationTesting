package Checkboxtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checkboxtask {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://total-qa.com/checkbox-example/");
		//store webelements in list
		
		List<WebElement>box=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//loop for elements ib box
		for (int i = 0; i < box.size(); i++) {
			boolean check1=box.get(i).isSelected();
			if(check1==false)
			{
				box.get(i).click();
			}
		}
	}

}
