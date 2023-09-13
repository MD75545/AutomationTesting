package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class tagname {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		String username=driver.findElement(By.id("email")).getTagName();
		System.out.println(username);
		
		String password=driver.findElement(By.id("pass")).getTagName();
		System.out.println("password");
	}

}
