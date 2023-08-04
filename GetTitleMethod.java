package demo.demo_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String expectedTitle="Facebook - log in or sign up";
		if(expectedTitle.equals(title))
		{
			System.out.println("Test case pass");
		}
		else {
			System.out.println("test case fail");
		}
	}

}
