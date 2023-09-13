package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class gettextmethod {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
	WebElement obj=driver.findElement(By.id("email"));
	obj.getText();
	System.out.println(obj);
	
	WebElement obj2=driver.findElement(By.id("pass"));
	obj2.getText();
	System.out.println(obj2);
}
}
