package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValueMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testkru.com/Elements/Buttons");
		
		String background=driver.findElement(By.id("leftClick")).getCssValue("Background");
		System.out.println("color"+background);
		String expectedvalue="rgb(255, 186, 0)";
		
		String actualvalue=background;
		
		if(actualvalue.contains(expectedvalue))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case failed");
		}
	}

}
