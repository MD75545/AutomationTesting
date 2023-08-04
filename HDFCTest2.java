package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCTest2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String expectedTitle="HDFC Bank - Personal Banking & Netbanking Services";
		if(expectedTitle.equals(title))
		{
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		driver.close();
		System.out.println("Closed the window");
	}

}
