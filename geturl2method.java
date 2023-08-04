package demo.demo_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geturl2method {
 public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String currenturl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com/";
		driver.get("https://www.instagram.com/");
		String currentUrl2=driver.getCurrentUrl();
		System.out.println(currentUrl2);
}
}
