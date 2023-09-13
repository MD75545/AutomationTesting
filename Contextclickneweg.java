package actionclass;

import java.util.Iterator;
import java.util.List;

import javax.swing.Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclickneweg {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement e1=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		
		Actions a2=new Actions(driver);
		a2.contextClick(e1).perform();
		
		List<WebElement> obj=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']"));
		int size=obj.size();
		
		for (int i=0;i<size;i++)
		{
			WebElement a=obj.get(0);
			a.click();
			
		}
	}

}
