package KeyBoardsEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabKeys {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement obj=driver.findElement(By.id("email"));
		obj.sendKeys("Cristiano Ronaldo");
		
		Actions e1=new Actions(driver); 
		
		e1.keyDown(obj, Keys.TAB).sendKeys("Ronaldo").perform();
		
		
		
	}

}
