package KeyBoardsEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FB {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement obj=driver.findElement(By.id("email"));
	
		
		Actions act= new Actions(driver);
		Action xyz=act.moveToElement(obj).click().sendKeys("Mohammed").doubleClick(obj).
		keyDown(obj, Keys.TAB).sendKeys("cris").keyDown(Keys.ENTER).build();xyz.perform();
		
		
		
	}

}
