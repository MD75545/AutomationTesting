package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class getsize {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		WebElement obj=driver.findElement(By.name("email"));
		org.openqa.selenium.Dimension d=obj.getSize();
		
		int width=d.getWidth();
		System.out.println("usernbame text widthh"+width);
		
		int height=d.getHeight();
		System.out.println("usernbame textheight"+height);
	}

}
