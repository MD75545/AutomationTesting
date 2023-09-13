package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://artoftesting.com/samplesiteforselenium");
			WebElement e1=driver.findElement(By.xpath("//button[@ondblclick='generateAlertBox()']"));
			
			Actions a2=new Actions(driver);
			a2.doubleClick(e1).perform();
	}

}
