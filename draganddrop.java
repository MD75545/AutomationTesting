package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		WebElement tiger=driver.findElement(By.id("box4"));
		WebElement lion=driver.findElement(By.id("dropBox"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(tiger, lion).perform();
	}

}
