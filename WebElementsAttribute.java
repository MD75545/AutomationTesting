package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementsAttribute {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		String username=driver.findElement(By.id("email")).getAttribute("ID");
		System.out.println("Name"+username);
		
		
		String password=driver.findElement(By.id("pass")).getAttribute("ID");
		System.out.println("Password"+password);
	}

}
