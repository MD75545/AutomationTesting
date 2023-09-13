import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioIsenable {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		WebElement radio=driver.findElement(By.id("femalerb"));
		boolean active=radio.isEnabled();
		System.out.println(active);
		if(active==true)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].click;", radio);
		}
	}

}
