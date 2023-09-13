package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCBUS {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-bus']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String expectedTitle="IRCTC Next Generation eTicketing System";
		if(expectedTitle.equals(title))
		{
			System.out.println("test case pass");
		}
		else {
			System.out.println("Test case failed");
		}
	}

}
