package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelected {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/radio-button");
	WebElement	check=driver.findElement(By.className("custom-control-label"));
		check.click();
		
		boolean check1=check.isSelected();
		System.out.println(check1);
		
		if(true) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("already selected");
		}
		
	}

}
