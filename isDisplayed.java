package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Boolean String=driver.findElement(By.id("email")).isDisplayed();
		System.out.println(String);
		
		if(String==true)
		{
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case failed");
		}
	}

}
