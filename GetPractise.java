package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPractise {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String name =driver.getTitle();
		System.out.println(name);
		
		String ExpectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println(name);
		
		if(ExpectedTitle.equals(name))
		{
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		driver.close();
		driver.quit();
	}

}
