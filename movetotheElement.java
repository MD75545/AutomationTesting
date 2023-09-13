package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetotheElement {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.myntra.com/");
		WebElement women=driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(women).perform();
	}

}
