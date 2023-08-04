package demo.demo_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String expectedTitle="Instagram";
		if(expectedTitle.equals(title))
		{
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
	}

}
