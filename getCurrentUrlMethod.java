package demo.demo_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrlMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String currenturl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com/";
		if(currenturl.equals(expectedUrl))
				{
				System.out.println("test case pass");
			}
		else {
			System.out.println("test case fail");
		}
	}

}
