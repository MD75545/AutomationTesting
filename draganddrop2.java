package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop2 {

	public static void main(String[] args) {
		
			WebDriver driver=new EdgeDriver();
			driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			WebElement real=driver.findElement(By.id("box7"));
			WebElement madrid=driver.findElement(By.id("box107"));
			
			Actions a1=new Actions(driver);
			a1.dragAndDrop(real, madrid).perform();
	}

}
