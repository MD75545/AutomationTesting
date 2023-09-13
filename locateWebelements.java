package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateWebelements {

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		String username=driver.findElement(By.id("email")).getTagName();
		System.out.println("Name"+username);
	 
		String password=driver.findElement(By.id("pass")).getTagName();
		System.out.println("Name"+password);
		
	}

}
