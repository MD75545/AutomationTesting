package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement e1= driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions a1=new Actions(driver);
		a1.contextClick(e1).perform();
		
	}

}
