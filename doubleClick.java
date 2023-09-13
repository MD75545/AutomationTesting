package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import practise.webelementbuttons;

public class doubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement e1    =driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
	
		
		
		Actions a1=new Actions(driver);
		
		a1.doubleClick(e1).perform();
		
	}

}
