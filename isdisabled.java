package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class isdisabled {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		Boolean String=driver.findElement(By.id("but1")).isEnabled();
		System.out.println(String);
	}

}
