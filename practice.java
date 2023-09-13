package KeyBoardsEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		
		Actions A1=new Actions(driver);
		
		Action mahesh=A1.moveToElement(username).click().sendKeys("cristiano").doubleClick().
		keyDown(username, Keys.TAB).sendKeys("ronaldo@7").keyDown(Keys.ENTER).build();mahesh.perform();
	}

}
