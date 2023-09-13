package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class isenable {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		Boolean obj=driver.findElement(By.id("but2")).isEnabled();
		System.out.println(obj);
		
		if(obj)
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
	}

}
