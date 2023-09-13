package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class location {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		WebElement obj=driver.findElement(By.name("email"));
		org.openqa.selenium.Point p=obj.getLocation();
		
		int x=p.getX();
		System.out.println(x);
		
		int y=p.getY();
		System.out.println(y);
	}

}
