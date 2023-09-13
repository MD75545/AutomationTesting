package actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class monitorscount {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement e1=driver.findElement(By.xpath("//a[contains(text(),'Components')]"));
		
		Actions a2=new Actions(driver);
		a2.moveToElement(e1).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]")).click();
		
		List<WebElement> box=driver.findElements(By.xpath("//span[@class='price-new']"));
		int count =box.size();
	}

}
