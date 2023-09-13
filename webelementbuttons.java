package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementbuttons {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		boolean a=driver.findElement(By.id("but2")).isEnabled();
		
		
		if(a)
		{
			System.out.println("test case pass");
			
		}
		else {
			System.out.println("test case fail");
		}
		boolean b=driver.findElement(By.id("but1")).isEnabled();
				if(b==false)
					
				{
					System.out.println("test case pass");
				}
				else
				{
					System.out.println("test case fail");
				}
	}

}
